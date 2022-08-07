package com.codecaique.hiakk.pojo.response

data class UserRateResponse(
        var data: List<UserRate>,
        var error: Int,
        var message: String
)

data class UserRate(
    var comment: String,
    var created_at: String,
    var first_name: String,
    var image: String,
    var rate: String
)