package com.codecaique.hiakk.pojo.response

import java.io.Serializable

data class PhoneResponse(
        var data: Phone,
        var error: Int,
        var message: String
)

data class Phone(
        var email: String,
        var first_name: String,
        var id: Int,
        var image: String,
        var passwords: String,
        var phone: String,
        var state: String,
        var user_token: String,
        var gender: String,
        var gender_name: String
) : Serializable