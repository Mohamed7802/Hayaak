package com.codecaique.hiakk.pojo.response

data class ShowMessagesResponse(
        var state: String,
        var acceptTime: String,
        var deliveryTime: DeliveryTime,
        var data: List<Message>,
        var error: Int,
        var message: String
)

data class Message(
        var created_at: String = "",
        var id: String = "",
        var image: String = "",
        var message: String = "",
        var receiver_id: String = "",
        var receiver_image: String = "",
        var receiver_name: String = "",
        var receiver_phone: String = "",
        var request_id: String = "",
        var sender_id: String = "",
        var sender_image: String = "",
        var sender_name: String = "",
        var sender_phone: String = "",
        var order_state: String = "",
        var updated_at: String = "",
        var is_bill: String = "0",
        var voice: String = "",
        var client_rated: Boolean = false,
        var client_pay: Boolean = false,
        var driver_rated: Boolean = false
)

data class DeliveryTime(
        val date: String,
        val timezone: String,
        val timezone_type: Int
)