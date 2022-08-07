package com.codecaique.hiakk.pojo.response

data class RegistrationResponse(
        var data: UserData,
        var error: Int,
        var message: String
)

data class UserData(
    var email: String,
    var firebase_token: String,
    var first_name: String,
    var id: Int,
    var image: String,
    var last_name: String,
    var latitude: String,
    var longitude: String,
    var passwods: String,
    var phone: String,
    var state: String,
    var user_token: String,
    var gender: String,
    var whats_phone: String
)