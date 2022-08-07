package com.codecaique.hiakk.pojo.response

data class NotificationAgentResponse(
    var data: List<Notification2>,
    var error: Int,
    var message: String
)

data class Notification2(
    var body: String,
    var created_at: String,
    var id: Int,
    var title: String,
    var user_id: String,
    var user_image: String,
    var user_name: String
)