package com.codecaique.hiakk.pojo.response

data class ShowShopsResponse(
        var data: List<Shops>,
        var error: Int,
        var message: String
)

data class Shops(
    var address: String,
    var cat_id: String,
    var created_at: String,
    var description: String,
    var id: Int,
    var image: String,
    var latitude: String,
    var longitude: String,
    var name: String,
    var updated_at: String
)