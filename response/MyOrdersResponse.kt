package com.codecaique.hiakk.pojo.response

data class MyOrdersResponse(
        var data: List<MyOrder>,
        var error: Int,
        var message: String
)

data class MyOrder(
    var created_at: String,
    var delivery_time: String,
    var description: String,
    var first_name: String,
    var id: String,
    var image: String,
    var name: String,
    var phone: String,
    var shop_id: String,
    var state: String,
    var user_id: String,
    var shope_image: String,
    var rate_state:String
)