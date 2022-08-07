package com.codecaique.hiakk.pojo.response

data class ConditionsResponse(
        var data: List<Conditions>,
        var error: Int,
        var message: String
)

data class Conditions(
    var A_text: String,
    var E_text: String,
    var created_at: String,
    var id: Int,
    var updated_at: String
)