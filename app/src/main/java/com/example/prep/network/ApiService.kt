package com.example.prep.network

import com.example.prep.model.data.Item
import retrofit2.http.GET

interface ApiService {
    @GET("items")
    suspend fun getItems(): List<Item>
}