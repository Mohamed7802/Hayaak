package com.codecaique.hiakk.pojo.services

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.codecaique.hiakk.R
import com.codecaique.hiakk.base.agent.SubMainActivity
import com.codecaique.hiakk.data.ApiCreater
import com.codecaique.hiakk.pojo.response.Message
import com.codecaique.hiakk.pojo.util.UserInfo
import com.codecaique.hiakk.ui.agent.main.dialogs.RateUserDialog
import com.codecaique.hiakk.ui.agent.subMain.ui.postproblem.PostProblemFragment
import com.codecaique.hiakk.ui.client.chat.ChatViewModel
import com.codecaique.hiakk.ui.client.loading.LoadingDialog
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.order_deliverd_or_no.*
import kotlinx.android.synthetic.main.order_deliverd_or_no.tv_1

class DeliveredDialog : AppCompatActivity() {

    private val TAG = "DeliveredDialog"

    lateinit var loadingDialog: LoadingDialog
    lateinit var viewModel: ChatViewModel
    lateinit var userInfo: UserInfo
    var driverId: Int = 0
    var requestId: Int = 0
    private var db = FirebaseFirestore.getInstance()
            .collection(ApiCreater.OrdersCollection)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_deliverd_or_no)
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        this.setFinishOnTouchOutside(false)

        loadingDialog = LoadingDialog(this)
        viewModel = ViewModelProvider(this).get(ChatViewModel::class.java)
        userInfo = UserInfo(applicationContext)

        Log.e(TAG, "onCreate: first")

        val chatViewModel = ViewModelProviders.of(this).get(ChatViewModel::class.java)

        if (intent.extras != null) {

            Log.e(TAG, "onCreate: extras")
            val action = intent.extras!!.getString("action")

            // errrooooor 232
            Log.e(TAG, "onCreate: --232-->  ${intent.extras!!.getString("request_id")}")

            try {
                requestId = intent.extras!!.getString("request_id")!!.toInt()
            } catch (e: Exception) {
            }

            Log.e(TAG, requestId.toString() + action)


//            tv_1.text = intent.extras!!.getString("text")
            if (action == "cancel") {
                tv_1.text = intent.extras!!.getString("text")
                btn_yes.setOnClickListener {

                    Log.e(TAG, requestId.toString() + action)
                    chatViewModel.acceptCancelorder(UserInfo(this.applicationContext).getUserToken(), requestId, "yes", this)

                    chatViewModel.cancelOrderMutableLiveData.observe(this, Observer {

                        if (it.error == 0) {
                            Toast.makeText(this, "تم  حذف الطلب بنجاح ", Toast.LENGTH_SHORT).show()

                            loadingDialog.dismiss()
                            finish()
                        } else {
                            loadingDialog.dismiss()
                            Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
                        }
                    })
                }
                btn_no.setOnClickListener { _ ->
                    Log.e(TAG, requestId.toString() + action)


                    chatViewModel.acceptCancelorder(UserInfo(this.applicationContext).getUserToken(), requestId, "no", this)

                    chatViewModel.cancelOrderMutableLiveData.observe(this, Observer {

                        if (it.error == 0) {
                            Toast.makeText(baseContext, "لم يتم الموافقة على طلب العميل بنجاح ",
                                    Toast.LENGTH_SHORT).show()

                            loadingDialog.dismiss()
                            finish()
                        } else {
                            loadingDialog.dismiss()
                            Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
                        }
                    })

                    Log.e(TAG, requestId.toString() + action)

                    finish()
                }

                /*  btn_yes.setOnClickListener {
                      finish()
                  }*/

            } else if (action == "delivered") {

                //delivered

                db = FirebaseFirestore.getInstance()
                        .collection(ApiCreater.OrdersCollection)
                        .document(requestId.toString())
                        .collection(ApiCreater.ChatCollection)

                Log.e(TAG, "onCreate: delivered")

                driverId = intent!!.extras!!.getString("user_id")!!.toInt()
                requestId = intent!!.extras!!.getString("request_id")!!.toInt()

                Log.e(TAG, "onCreate: userId $driverId requestId $requestId")

                btn_yes.setOnClickListener {

                    Log.e(TAG, "onCreate: deliver yes")
                    receivedDone()

                }

                btn_no.setOnClickListener { v ->

                    Log.e(TAG, "onCreate: deliver no")

                    val intent = Intent(this, SubMainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    intent.putExtra(SubMainActivity.KEY, SubMainActivity.POSTPROBLEM)
                    intent.putExtra(PostProblemFragment.ORDER_ID, requestId)
                    intent.putExtra(PostProblemFragment.USER_ID, driverId)
                    startActivity(intent)

                    //            ChatFragment().rateDialog(this)
                    finish()

                }

            }
        } else {
            Log.e(TAG, "onCreate: no extras")
        }

    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart: start")
    }

    private fun receivedDone() {

        linearLayout5.visibility = View.GONE
        progressBar.visibility = View.VISIBLE

        viewModel.userReceivedOrder(applicationContext, userInfo.getUserToken(), requestId, driverId)
        viewModel.userReceivedOrderMutableLiveData.observe(this, Observer { t ->

            //TODO
            val message = Message()
            message.message = ApiCreater.OrderMessages.clientReceivedOrderMessage
            message.order_state = ApiCreater.OrderStates.receivedOrder
            sendMessageToCloud(message)
//            finish()
        })

    }

    private fun rateDialog() {

        val intent = Intent(this, RateUserDialog::class.java)
        intent.putExtra(RateUserDialog.ORDER_ID, requestId.toString())
        intent.putExtra(RateUserDialog.USER_ID, driverId.toString())
        startActivity(intent)

        /*
        Log.e(TAG, "rateDialog: ${userInfo.getKeyRate(requestId.toString())} ")
        if (!userInfo.getKeyRate(requestId.toString())) {
            Log.e(TAG, "rateDialog: show")
            Log.e(TAG, "rateDialog: not show")
        }

        startActivity()
*/

        //        val dialog = Dialog(applicationContext)
        //        dialog.setContentView(R.layout.dialog_rate_user)

    }

    private fun sendMessageToCloud(message: Message) {

        message.id = db.document().id
        message.created_at = System.currentTimeMillis().toString()
        message.updated_at = System.currentTimeMillis().toString()
        message.receiver_id = driverId.toString()
        message.request_id = requestId.toString()
        message.sender_id = userInfo.getId().toString()
        message.order_state = ApiCreater.OrderStates.receivedOrder

        sendTheMessage(message)


    }

    private fun sendTheMessage(message: Message) {

        db.document(message.id).set(message).addOnSuccessListener {

            progressBar.visibility = View.GONE
            linearLayout5.visibility = View.VISIBLE
//            rateDialog()
            finish()

        }
    }

}