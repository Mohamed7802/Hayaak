package com.codecaique.hiakk.pojo.response

data class ProblemDetailsResponse(
    var answers: List<Answer>,
    var data: ProblemDetails,
    var error: Int,
    var images: List<Image>,
    var message: String
)

data class Answer(
    var answer: String,
    var name: String
)

data class ProblemDetails(
    var answer: String?,
    var content: String,
    var created_at: String,
    var details: String,
    var id: Int,
    var order_id: String,
    var shope_name: String,
    var state: String
)

data class Image(
    var complain_id: String,
    var created_at: String,
    var id: Int,
    var image: String,
    var updated_at: String
)