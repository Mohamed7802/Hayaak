package com.codecaique.hiakk.pojo.response

import java.io.Serializable

data class ShowUserOfOrderResponse(
        var data: List<User>,
        var error: Int,
        var message: String
)

data class User(
        var first_name: String="",
        var id: Int=0,
        var image: String="",
        var phone: String="",
        var requestes_count: Int=0,
        val distance: String = "",
        val state: String = "",
        var rate: String="",
        var offer_price: String?="",
        var user_comments: Int=0
) : Serializable