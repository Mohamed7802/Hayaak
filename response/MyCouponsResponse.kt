package com.codecaique.hiakk.pojo.response

data class MyCouponsResponse(
        var data: List<Coupon>,
        var error: Int,
        var message: String
)

data class Coupon(
    var copon: String,
    var created_at: String,
    var id: Int
)