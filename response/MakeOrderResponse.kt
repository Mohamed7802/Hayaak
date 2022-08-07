package com.codecaique.hiakk.pojo.response

data class MakeOrderResponse(
        var data: MakeOrder,
        var details: Boolean,
        var error: Int,
        var message: String
)

data class MakeOrder(
    var copon: Any,
    var created_at: String,
    var delivery_address: String,
    var delivery_latitude: String,
    var delivery_longitude: String,
    var delivery_time: String,
    var delivery_type: String,
    var description: String,
    var id: Int,
    var payment_id: String,
    var receiving_address: Any,
    var receiving_latitude: String,
    var receiving_longitude: String,
    var shop_id: String,
    var state: String,
    var total_price: Any,
    var updated_at: String,
    var user_id: Int
)