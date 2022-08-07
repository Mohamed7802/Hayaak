package com.codecaique.hiakk.pojo.response

class Shop_Orders_Response
{

    private var error = 0
    private var message: String? = null
    private var data: List<DataBean?>? = null

    fun getError(): Int {
        return error
    }

    fun setError(error: Int) {
        this.error = error
    }

    fun getMessage(): String? {
        return message
    }

    fun setMessage(message: String?) {
        this.message = message
    }

    fun getData(): List<DataBean?>? {
        return data
    }

    fun setData(data: List<DataBean?>?) {
        this.data = data
    }

    class DataBean {
        var id: String? = null
        var shop_id: String? = null
        var name: String? = null
        var user_id: String? = null
        var first_name: String? = null
        var image: String? = null
        var phone: String? = null
        var description: String? = null
        var delivery_time: String? = null
        var state: String? = null
        var created_at: String? = null
        var distance: String? = null

    }
}