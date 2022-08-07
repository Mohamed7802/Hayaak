package com.codecaique.hiakk.pojo.response

data class SentMessageResponse(
    var data: MSG,
    var error: Int,
    var message: String
)

data class MSG(
    var created_at: String,
    var id: Int,
    var image: String,
    var message: String,
    var receiver_id: String,
    var request_id: String,
    var sender_id: Int,
    var updated_at: String,
    var voice: String
)