package com.codecaique.hiakk.pojo.response

data class TurnNotificationResponse(
        var data: Data,
        var error: Int,
        var message: String
)

data class Data(
    var created_at: String,
    var id: Int,
    var language: String,
    var notification: String,
    var updated_at: String,
    var user_id: String
)