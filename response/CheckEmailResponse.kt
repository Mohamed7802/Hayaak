package com.codecaique.hiakk.pojo.response

data class CheckEmailResponse(
    var data: CheckEmail,
    var error: Int,
    var message: String
)

data class CheckEmail(
    var email: String,
    var first_name: String,
    var gender: String,
    var id: Int,
    var image: String,
    var last_name: String,
    var passwords: String,
    var phone: String,
    var state: String,
    var user_token: String
)