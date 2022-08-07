package com.codecaique.hiakk.pojo.response

data class ProblemsResponse(
        var data: List<Problem>,
        var error: Int,
        var message: String
)

data class Problem(
        var content: String,
        var created_at: String,
        var id: Int,
        var order_id: String,
        var shope_name: String,
        var state: String
)