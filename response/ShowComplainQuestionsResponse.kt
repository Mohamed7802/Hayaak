package com.codecaique.hiakk.pojo.response

data class ShowComplainQuestionsResponse(
    var data: List<Question>,
    var error: Int,
    var message: String
)

data class Question(
    var id: Int,
    var name: String
)