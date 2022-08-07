package com.codecaique.hiakk.pojo.services

import android.annotation.SuppressLint
import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.media.AudioAttributes
import android.media.RingtoneManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.codecaique.hiakk.R
import com.codecaique.hiakk.base.agent.AuthActivity
import com.codecaique.hiakk.base.agent.SubMainActivity
import com.codecaique.hiakk.pojo.util.UserInfo
import com.codecaique.hiakk.ui.agent.subMain.ui.chat.ChatFragment
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import kotlinx.android.synthetic.main.order_deliverd_or_no.*


class MyFirebaseMessagingService : FirebaseMessagingService() {
    private var numMessages = 0

    lateinit var data: MutableMap<String, String>
    lateinit var userInfo: UserInfo

    val TAG = "MyFirebase"

    @RequiresApi(api = Build.VERSION_CODES.M)
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        //        Log.e("fmc------------q", +" test");

        userInfo = UserInfo(this)

        val title = remoteMessage.notification!!.title
        val body = remoteMessage.notification!!.body

        val notification = remoteMessage.notification
        data = remoteMessage.data
        val click_action = remoteMessage.notification!!.clickAction
        val from_ = remoteMessage.from
        val value = remoteMessage.data["click_action"]

        val data__ = remoteMessage.notification.toString()
        val data___ = remoteMessage.data
        val clickAction = remoteMessage.notification!!.clickAction

        Log.e(TAG, "onMessageReceived: 1 == $data__")
        Log.e(TAG, "onMessageReceived: 2 == $data___")
        Log.e(TAG, "onMessageReceived: 3 == $clickAction")
        Log.e(TAG, "onMessageReceived: 4 == ${data["click_action"]}")

        val body2 = data["body"]

        Log.e("click ", "e 000005  " + click_action.toString())

        Log.e("MYValue  ", "e 0000010  " + value.toString())


        Log.e("FROM 0 ", "e 000009  " + from_.toString())

        Log.e("MyService title", "e 000001 \n" + title.toString())

        Log.e("Data ser0", data.toString() + "  ")
        Log.e("Data body ser0", body2 + "  ")

        Log.e("Remote ser0", remoteMessage.toString() + "  ")
        Log.e("Notification ser0", remoteMessage.notification!!.toString() + "  ")


        //// 11111111111111111111111111111111
        /*
        if (data["click_action"].toString() == "1") {


            Log.e("MyService body", "e 2014 \n" + body.toString())
//            deliverdOrNo("amin")

            Log.e(TAG, "onMessageReceived: 32")
            val intent = Intent(this, Deliverd_Dialog::class.java)
            intent.putExtra("action", "deliverd")
//            todo  noww

            intent.putExtra("request_id", data["request_id"])
            intent.putExtra("user_id", data["driver_id"])
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            Log.e(TAG, "ddd 55555555555555555555555555555555555555555555555555555555555555555");
            startActivity(intent)

        } else */

        if (data["click_action"].toString() == "2") {

            Log.e("MyService body", "e 2014 \n" + body.toString())
//            deliverdOrNo("amin")

            if (UserInfo(this).getState() == "mandop") {
                Log.e(TAG, "onMessageReceived: mandop")

                val intent = Intent(this, DeliveredDialog::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                intent.putExtra("action", "cancel")


                Log.e("REQUEst", data["click_action"].toString() + "  ")


                val text1 = body + "\n"
                val text2 = "\n" + " رقم " + data["request_id"]

                val text =
                        " هل تريد الموافقة ؟"

                val text3 = "$text1  $text2  $text "
                intent.putExtra("text", text3)
                intent.putExtra("request_id", data["request_id"])
                startActivity(intent)
            }

        }


        sendNotification(notification, title, body, data)

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private fun sendNotification(notification: RemoteMessage.Notification?, title: String?, body: String?, data: Map<String, String>) {


        Log.e(TAG, "sendNotification: nowwwwwww")

        val bundle = Bundle()
        bundle.putString(FCM_PARAM, data[FCM_PARAM])

        val type = data["click_action"]
        println(type)
        println(notification!!.body)
        assert(type != null)
        bundle.putString("type", type)



        Log.e(TAG, "sendNotification: ${data["click_action"].toString()}")

        if (userInfo.getRingtone() != null)
            Log.e(TAG, "sendNotification: yesss")
        else
            Log.e(TAG, "sendNotification: noooo")


        if (data["click_action"].toString() == "2") {

            Log.e(TAG, "sendNotification:1")
            Log.e("MyService body", "e 2014 \n" + body.toString())
//            deliverdOrNo("amin")

            /*if (UserInfo(this).getState() == "mandop") {

                Log.e(TAG, "sendNotification:21")
                val intent = Intent(this, DeliveredDialog::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                intent.putExtra("action", "cancel")
                val text1 = body + "\n"
                val text2 = " رقم " + data["request_id"]

                val text = " هل تريد الموافقة ؟"

                val text3 = text1 + text2 + text
                intent.putExtra("text", text3)
                intent.putExtra("request_id", data["request_id"])


                val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
                Log.e(TAG, "de 2222222222222222222222222222222")


                val localBroadcastManager = LocalBroadcastManager.getInstance(this)
                localBroadcastManager.sendBroadcast(intent)
                val notificationBuilder = NotificationCompat.Builder(this, getString(R.string.notification_channel_id))
                        .setContentTitle(title)
                        .setContentText(body)
                        .setAutoCancel(true)
//                        .setSound(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.win))
//                        .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)) //.setSound(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.win))
                        .setContentIntent(pendingIntent)
                        .setContentInfo("Hello")
                        .setLargeIcon(BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher))
                        .setColor(getColor(R.color.colorPrimaryDark))
                        .setLights(Color.RED, 1000, 300)
                        .setDefaults(Notification.DEFAULT_VIBRATE)
                        .setSound(UserInfo(applicationContext).getRingtone())
                        .setNumber(++numMessages)
                        .setSmallIcon(R.drawable.hyak_logo)


//                    notificationBuilder .setSound(userInfo.getRingtone())

                *//*   val ringtoneUri = if (userInfo.getRingtone() != null)
                       RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
                   else
                       RingtoneManager.getDefaultUri(userInfo.getRingtone()!!)

                   val r = RingtoneManager.getRingtone(applicationContext, ringtoneUri)
                   r.play()*//*

                val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    val channel = NotificationChannel(
                            getString(R.string.notification_channel_id), CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT
                    )
                    channel.description = CHANNEL_DESC
                    channel.setShowBadge(true)
                    channel.canShowBadge()
                    channel.enableLights(true)
                    channel.lightColor = Color.RED
                    channel.enableVibration(true)
                    channel.vibrationPattern = longArrayOf(100, 200, 300, 400, 500)
                    if (userInfo.getRingtone() != null)
                        channel.setSound(userInfo.getRingtone(), audioAttributes)
                    assert(notificationManager != null)
                    notificationManager.createNotificationChannel(channel)
                }
                assert(notificationManager != null)
                notificationManager.notify(0, notificationBuilder.build())

                Log.e("REQUEst", data["click_action"].toString() + "  ")
            }*/

        } else if (data["click_action"].toString() == "1") {
            orderIsDelivered(title, body, data)
        } else if (data["click_action"].toString() == "9") {
            userReceiveTheOrder(title, body, data)
        } else {

            Log.e(TAG, "sendNotification:3")

            Log.e(TAG, "sendNotification: data[ click_action ] ${data["click_action"]}")
            Log.e(TAG, "sendNotification:312")

            Log.e(TAG, "sendNotification: ${data["request_id"].toString()}")
            Log.e(TAG, "sendNotification: ${data["driver_id"].toString()}")
            Log.e(TAG, "sendNotification: if result  $title")
            Log.e(TAG, "sendNotification: if result  ${title!!.contains("deliverd")}")


            val intent//: Intent = Intent()
                    = Intent(this, AuthActivity::class.java).apply {
//                flags = Intent.FLAG_ACTIVITY_NEW_TASK //or Intent.FLAG_ACTIVITY_CLEAR_TASK
                putExtra("action", "deliverd")
                putExtra("request_id", data["request_id"].toString())
                putExtra("user_id", data["driver_id"].toString())
            }

            Log.e(TAG, "sendNotification: before ${data["request_id"].toString()}")
            Log.e(TAG, "sendNotification: before ${data["driver_id"].toString()}")

            val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT)

            val notificationBuilder = NotificationCompat.Builder(this, getString(R.string.notification_channel_id)).apply {
                setContentTitle(title)
                setContentText(body)
                setAutoCancel(true)
                setSound(/*if (userInfo.getRingtone() != null)
                        userInfo.getRingtone()
                    else*/
                        RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
                ) //.setSound(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.win))
                setContentIntent(pendingIntent)
                setLargeIcon(BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher))
                color = getColor(R.color.colorPrimaryDark)
                setLights(Color.RED, 1000, 300)
                setDefaults(Notification.DEFAULT_VIBRATE)
                setNumber(++numMessages)
                setSmallIcon(R.drawable.hyak_logo)
            }

            try {
                if (data.getValue("distance").toDouble() > 5)
                    notificationBuilder.setSound(null)

            } catch (e: Exception) {
            }

            /*  val ringtoneUri = if (userInfo.getRingtone() != null)
                  RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
              else
                  RingtoneManager.getDefaultUri(userInfo.getRingtone()!!)

              val r = RingtoneManager.getRingtone(applicationContext, ringtoneUri)
              r.play()
  */

            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val channel = NotificationChannel(
                        getString(R.string.notification_channel_id), CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT
                )
                channel.description = CHANNEL_DESC
                channel.setShowBadge(true)
                channel.canShowBadge()
                channel.enableLights(true)
                channel.lightColor = Color.RED
                channel.enableVibration(true)
                channel.vibrationPattern = longArrayOf(100, 200, 300, 400, 500)
                assert(notificationManager != null)
                notificationManager.createNotificationChannel(channel)
                if (userInfo.getRingtone() != null)
                    channel.setSound(userInfo.getRingtone(), audioAttributes)

            }
            assert(notificationManager != null)
            notificationManager.notify(0, notificationBuilder.build())
        }


    }

    private fun userReceiveTheOrder(title: String?, body: String?, data: Map<String, String>) {

        val intent = Intent(applicationContext, SubMainActivity::class.java).apply {
            putExtra(ChatFragment.USER_ID, data["driver_id"].toString())
            putExtra(ChatFragment.REQUEST_ID, data["request_id"].toString())
            putExtra(SubMainActivity.KEY, SubMainActivity.CHAT)
        }

        Log.e(TAG, "sendNotification: before ${data["request_id"].toString()}")
        Log.e(TAG, "sendNotification: before ${data["driver_id"].toString()}")

        val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT)

        val notificationBuilder = NotificationCompat.Builder(this, getString(R.string.notification_channel_id)).apply {
            setContentTitle(title)
            setContentText(body)
            setAutoCancel(true)
            setSound(/*if (userInfo.getRingtone() != null)
                        userInfo.getRingtone()
                    else*/
                    RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
            ) //.setSound(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.win))
            setContentIntent(pendingIntent)
            setLargeIcon(BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher))
            color = ContextCompat.getColor(applicationContext, R.color.colorPrimaryDark)
            setLights(Color.RED, 1000, 300)
            setDefaults(Notification.DEFAULT_VIBRATE)
            setNumber(++numMessages)
            setSmallIcon(R.drawable.hyak_logo)
        }


        /*  val ringtoneUri = if (userInfo.getRingtone() != null)
              RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
          else
              RingtoneManager.getDefaultUri(userInfo.getRingtone()!!)

          val r = RingtoneManager.getRingtone(applicationContext, ringtoneUri)
          r.play()
*/

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                    getString(R.string.notification_channel_id), CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT
            )
            channel.description = CHANNEL_DESC
            channel.setShowBadge(true)
            channel.canShowBadge()
            channel.enableLights(true)
            channel.lightColor = Color.RED
            channel.enableVibration(true)
            channel.vibrationPattern = longArrayOf(100, 200, 300, 400, 500)
            assert(notificationManager != null)
            notificationManager.createNotificationChannel(channel)
            if (userInfo.getRingtone() != null)
                channel.setSound(userInfo.getRingtone(), audioAttributes)

        }
        assert(notificationManager != null)
        notificationManager.notify(0, notificationBuilder.build())


    }

    private fun orderIsDelivered(title: String?, body: String?, data: Map<String, String>) {

        logs(title!!)


        val intent: Intent = Intent()
//                = Intent(this, DeliveredDialog::class.java).apply {
//                flags = Intent.FLAG_ACTIVITY_NEW_TASK //or Intent.FLAG_ACTIVITY_CLEAR_TASK
//            putExtra("action", "deliverd")
//            putExtra("request_id", data["request_id"].toString())
//            putExtra("user_id", data["driver_id"].toString())
//        }

        Log.e(TAG, "sendNotification: before ${data["request_id"].toString()}")
        Log.e(TAG, "sendNotification: before ${data["driver_id"].toString()}")

        val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT)

        val notificationBuilder = NotificationCompat.Builder(this, getString(R.string.notification_channel_id)).apply {
            setContentTitle(title)
            setContentText(body)
            setAutoCancel(true)
            setSound(/*if (userInfo.getRingtone() != null)
                        userInfo.getRingtone()
                    else*/
                    RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
            ) //.setSound(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.win))
            setContentIntent(pendingIntent)
            setLargeIcon(BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher))
            color = ContextCompat.getColor(applicationContext, R.color.colorPrimaryDark)
            setLights(Color.RED, 1000, 300)
            setDefaults(Notification.DEFAULT_VIBRATE)
            setNumber(++numMessages)
            setSmallIcon(R.drawable.hyak_logo)
        }


        /*  val ringtoneUri = if (userInfo.getRingtone() != null)
              RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
          else
              RingtoneManager.getDefaultUri(userInfo.getRingtone()!!)

          val r = RingtoneManager.getRingtone(applicationContext, ringtoneUri)
          r.play()
*/

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                    getString(R.string.notification_channel_id), CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT
            )
            channel.description = CHANNEL_DESC
            channel.setShowBadge(true)
            channel.canShowBadge()
            channel.enableLights(true)
            channel.lightColor = Color.RED
            channel.enableVibration(true)
            channel.vibrationPattern = longArrayOf(100, 200, 300, 400, 500)
            assert(notificationManager != null)
            notificationManager.createNotificationChannel(channel)
            if (userInfo.getRingtone() != null)
                channel.setSound(userInfo.getRingtone(), audioAttributes)

        }
        assert(notificationManager != null)
        notificationManager.notify(0, notificationBuilder.build())

    }

    private fun logs(title: String) {
        Log.e(TAG, "sendNotification:3")

        Log.e(TAG, "sendNotification: data[ click_action ] ${data["click_action"]}")
        Log.e(TAG, "sendNotification:312")

        Log.e(TAG, "sendNotification: ${data["request_id"].toString()}")
        Log.e(TAG, "sendNotification: ${data["driver_id"].toString()}")
        Log.e(TAG, "sendNotification: if result  $title")
        Log.e(TAG, "sendNotification: if result  ${title.contains("deliverd")}")

    }

    companion object {
        const val FCM_PARAM = "picture"
        private const val CHANNEL_NAME = "FCM"
        private const val CHANNEL_DESC = "Firebase Cloud Messaging"
    }

    @SuppressLint("NewApi")
    private val audioAttributes = AudioAttributes.Builder()
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .setUsage(AudioAttributes.USAGE_NOTIFICATION)
            .build()

    private fun deliverdOrNo(rateState: String) {
        Log.e("asasas", "asasas")
        val dialog = Dialog(applicationContext)
        dialog.setContentView(R.layout.order_deliverd_or_no)
        dialog.btn_yes.setOnClickListener {
            dialog.dismiss()
            dialog.cancel()


        }

        dialog.show()

    }

}