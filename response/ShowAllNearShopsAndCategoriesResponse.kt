package com.codecaique.hiakk.pojo.response

data class ShowAllNearShopsAndCategoriesResponse(
        var category: List<Category>,
        var data: List<NearStore>,
        var error: Int,
        var message: String
)

data class Category(
    var id: Int,
    var image: String,
    var name: String
)

data class NearStore(
    var address: String,
    var category_name: String,
    var distance: String,
    var discount:String,
    var id: String,
    var image: String,
    var name: String,
    var lat: Double,
    var lng: Double

)