package com.codecaique.hiakk.pojo.response

data class NearPlaces_Response
(
    var category: List<Categories>,
    var data: List<NearStores>,
    var error: Int,
    var message: String
    )

    data class Categories(
            var id: Int,
            var image: String,
            var name: String
    )

    data class NearStores(
            var address: String,
            var category_name: String,
            var distance: String,
            var discount:String,
            var id: String,
            var image: String,
            var name: String
    )
