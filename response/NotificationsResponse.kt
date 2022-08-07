package com.codecaique.hiakk.pojo.response

data class NotificationsResponse(
        var data: List<Notification>,
        var error: Int,
        var message: String
)

data class Notification(
    var body: String,
    var request_id: Int,
    var created_at: String,
    var id: Int,
    var offer_id: String,
    var title: String,
    var user_id: String,
    var user_image: String,
    var user_name: String,
    var click_action:String
)