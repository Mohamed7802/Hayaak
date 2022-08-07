package com.codecaique.hiakk.pojo.response

data class BillResponse(
        val data: Data,
        val error: Int,
        val message: String
) {
    data class Data(
            val delivery_price: Int,
            val id: Int,
            val image: String,
            val order_price: Int,
            val tax: Int,
            val total_price: Int
    )
}