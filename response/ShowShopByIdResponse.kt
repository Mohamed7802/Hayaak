package com.codecaique.hiakk.pojo.response

data class ShowShopByIdResponse(
        var data: Shop,
        var error: Int,
        var menu: List<Menu>,
        var branches:List<Branche>,
        var i_agent:Int,
        var message: String
)

data class Shop(
    var agent_num: Int,
    var description: String,
    var id: Int,
    var latitude: String,
    var longitude: String,
    var name: String
)

data class Menu(
    var created_at: String,
    var id: Int,
    var image: String,
    var price: String,
    var product: String,
    var shop_id: String,
    var updated_at: String
)
data class Branche(
    var id: Int,
    var latitude: String,
    var longitude: String,
    var name: String
)