package com.codecaique.hiakk.pojo.response

data class ShowComplainReasonsResponse(
        var data: List<Reason>,
        var error: Int,
        var message: String
)

data class Reason(
    var created_at: String,
    var id: Int,
    var text: String,
    var updated_at: String
)