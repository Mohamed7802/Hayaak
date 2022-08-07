package com.codecaique.hiakk.pojo.request

data class MakeOrderRequest(
        var user_token: String,
        var shope_id: Int,
        var receive_place: String,
        var receiving_latitude: Double,
        var receiving_longitude: Double,
        var delivery_place: String,
        var delivery_latitude: Double,
        var delivery_longitude: Double,
        var delivery_time: String,
        var description: String,
        var image: String?,
        var copon: String,
        var payment_id: Int,
        var menu: List<MenuItem>,
        var total_price: Double
)

data class MenuItem(
        var product: String,
        var type: String,
        var amount: String,
        var price: String
)

data class MenuItemOrder(
        var productName: String,
        var product: String,
        var type: String,
        var amount: String,
        var price: String
)
