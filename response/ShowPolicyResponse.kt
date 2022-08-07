package com.codecaique.hiakk.pojo.response

data class ShowPolicyResponse(
    var data: List<Policy>,
    var error: Int,
    var message: String
)

data class Policy(
    var created_at: String,
    var id: Int,
    var text: String,
    var updated_at: String
)