package com.codecaique.hiakk.pojo.response

data class BillPriceResponse(
        val data: Data,
        val error: Int,
        val message: String
) {
    data class Data(
            val price: String,
            val taxs: String,
            val total_price: String
    )
}