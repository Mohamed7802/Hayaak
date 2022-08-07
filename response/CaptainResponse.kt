package com.codecaique.hiakk.pojo.response

data class CaptainResponse(
        var data: Captain,
        var error: Int,
        var message: String
)

data class Captain(
    var id: Int,
    var first_name: String,
    var last_name: String,
    var email: String,
    var passwods: String,
    var phone: String,
    var state: String,
    var image: String,
    var gender: String,
    var latitude: String,
    var longitude: String,
    var firebase_token: String,
    var user_token: String
)