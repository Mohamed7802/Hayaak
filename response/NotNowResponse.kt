package com.codecaique.hiakk.pojo.response

data class NotNowResponse(
        var data: NotNow,
        var error: Int,
        var message: String
)

data class NotNow(
    var first_name: String,
    var id: Int,
    var last_name: String,
    var state: String,
    var user_token: String
)