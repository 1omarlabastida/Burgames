package com.enydea.burgergames.data.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST
    suspend fun getApiServicePost(

    ): Call<Any?>

    @POST
    suspend fun getApiServicePostToken(

    ): Call<Any?>

    @GET
    suspend fun getApiServiceGet(

    ): Call<Any?>

    @GET
    suspend fun getApiServiceGetToken(

    ): Call<Any?>

}