package com.enydea.burgergames.data.network

import android.net.DnsResolver
import android.util.Log
import com.enydea.burgergames.core.GetRetrofit.getRetrofit
import com.enydea.burgergames.data.models.dataa
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GetService {

    private val retrofit = getRetrofit()

    suspend fun getGeneralService(urlService: String, token: String, body: Any?, typePetition: String): Any?{
        var response: Any? = null
        when(typePetition){
            "AUTH_POST"-> response=getServicePost(urlService, body)
            "AUTH_POST_TOKEN"-> response=getServicePostWithToken(urlService, token, body)
            "AUTH_GET"-> response=getServiceGet(urlService, body)
            "AUTH_GET_TOKEN"-> response=getServiceGetWithToken(urlService, token, body)
        }

        return response

    }

    suspend fun getServicePost(urlService: String, body: Any?): Any{// Aqui se van a buscar los paises
        return withContext(Dispatchers.IO){
            val call=retrofit.create(ApiService::class.java)
            val result : Call<Any?> = call.getApiServicePost()
            result.enqueue(object : Callback<Any?>{
                override fun onResponse(call: Call<Any?>, response: Response<Any?>) {
                   response.body()
                }

                override fun onFailure(call: Call<Any?>, t: Throwable) {
                    Log.d("Error", "Error")
                }
            })
        }
    }

    suspend fun getServicePostWithToken(urlService: String, token: String, body: Any?): Any{// Aqui se van a buscar los paises
        return withContext(Dispatchers.IO){
            val call=retrofit.create(ApiService::class.java)
            val result : Call<Any?> = call.getApiServicePostToken()
            result.enqueue(object : Callback<Any?>{
                override fun onResponse(call: Call<Any?>, response: Response<Any?>) {
                    response.body()
                }

                override fun onFailure(call: Call<Any?>, t: Throwable) {
                    Log.d("Error", "Error")
                }
            })
        }
    }

    suspend fun getServiceGet(urlService: String, body: Any?): Any{// Aqui se van a buscar los paises
        return withContext(Dispatchers.IO){
            val call=retrofit.create(ApiService::class.java)
            val result : Call<Any?> = call.getApiServiceGet()
            result.enqueue(object : Callback<Any?>{
                override fun onResponse(call: Call<Any?>, response: Response<Any?>) {
                    response.body()
                }

                override fun onFailure(call: Call<Any?>, t: Throwable) {
                    Log.d("Error", "Error")
                }
            })
        }
    }

    suspend fun getServiceGetWithToken(urlService: String, token: String, body: Any?): Any{// Aqui se van a buscar los paises
        return withContext(Dispatchers.IO){
            val call=retrofit.create(ApiService::class.java)
            val result : Call<Any?> = call.getApiServiceGetToken()
            result.enqueue(object : Callback<Any?>{
                override fun onResponse(call: Call<Any?>, response: Response<Any?>) {
                    response.body()
                }

                override fun onFailure(call: Call<Any?>, t: Throwable) {
                    Log.d("Error", "Error")
                }
            })
        }
    }
}




