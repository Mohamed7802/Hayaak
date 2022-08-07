package com.codecaique.hiakk.pojo.request

import okhttp3.MultipartBody

class SentShakwayRequest (
        var user_token :String,
        var user_id:Int,
        var comment:String,
        var reason:Int,
        var image:MultipartBody.Part,
        var notes:String,
        var details:String
)