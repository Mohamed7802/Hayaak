package com.codecaique.hiakk.pojo.response

data class ShowOffersResponse(
        var data: List<Offer>,
        var error: Int,
        var message: String
)

data class Offer(
        var agent_Recivingdistance: String,
        var delivery_id: String,
        var away_distance: String,
        var client_Recivingdistance: String,
        var delivery_time: String,
        var first_name: String,
        var image: String,
        var last_name: String,
        var offer_id: String,
        var request_id: String,
        var price: String,
        var rate: String,
        var payment:String
)