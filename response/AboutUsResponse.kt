package com.codecaique.hiakk.pojo.response

data class AboutUsResponse(
        var data: AboutUs,
        var error: Int,
        var message: String
)

data class AboutUs(
    var address: String,
    var details: String,
    var id: Int,
    var name: String
)