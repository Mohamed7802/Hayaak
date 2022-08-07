package com.codecaique.hiakk.pojo.response

data class EditProfileResponse(
        var data: Profile,
        var error: Int,
        var message: String
)

data class Profile(
    var email: String,
    var first_name: String,
    var id: Int,
    var image: String,
    var last_name: String,
    var gender: String,
    var passwords: String,
    var phone: String,
    var state: String,
    var user_token: String
)