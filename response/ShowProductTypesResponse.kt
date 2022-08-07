package com.codecaique.hiakk.pojo.response

data class ShowProduceTypesResponse(
        var data: List<FoodType>,
        var error: Int,
        var message: String
)

data class FoodType(
    var id: Int,
    var name: String,
    var price: String
)