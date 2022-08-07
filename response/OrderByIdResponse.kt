package com.codecaique.hiakk.pojo.response

data class OrderByIdResponse(
        var data: List<Order>,
        var details: List<Detail>,
        var error: Int,
        var message: String
)

data class Order(
    var agent_shope_distance: String,
    var client_latitude: String,
    var client_longitude: String,
    var client_shope_distance: String,
    var created_at: String,
    var delivery_time: String,
    var description: String,
    var first_name: String,
    var id: String,
    var image: String,
    var name: String,
    var phone: String,
    var receiving_latitude: String,
    var receiving_longitude: String,
    var shop_id: String,
    var state: String,
    var user_id: String
)

data class Detail(
    var amount: String,
    var id: Int,
    var price: String,
    var product: String,
    var type: String
)