package com.codecaique.hiakk.pojo.response

data class ShowOrderResponse(
        var data: List<OrderData>,
        var details: List<Any>,
        var error: Int,
        var message: String
)

data class OrderData(
    var agent_shope_distance: String,
    var client_latitude: String,
    var client_longitude: String,
    var client_shope_distance: String,
    var created_at: String,
    var delivery_time: String,
    var deliveryTime: String?,
    var accepted_time: String?,
    var description: String,
    var first_name: String,
    var shope_image: String,
    var id: String,
    var image: String,
    var name: String,
    var phone: String,
    var receiving_latitude: String,
    var receiving_longitude: String,
    var shop_id: String,
    var state: String,
    var delivery_address:String,
    var receiving_address:String,
    var user_id: String,
    var payment_id:String,
    var is_bill:String,
    var rate_state: String,
    var offer_price:String
)