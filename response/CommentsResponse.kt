package com.codecaique.hiakk.pojo.response

data class CommentsResponse(
        var data: List<Comment>,
        var error: Int,
        var message: String
)

data class Comment(
    var comment: String,
    var created_at: String,
    var first_name: String,
    var image: String,
    var rate: String
)