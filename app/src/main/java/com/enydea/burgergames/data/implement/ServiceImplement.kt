package com.enydea.burgergames.data.implement

import com.enydea.burgergames.data.network.GetService

class ServiceImplement {
    //Aquí va el seteo a una base de datos local
    private val apiService = GetService()

    suspend fun getResponse(urlService: String, token: String, body: Any?, typePetition: String):Any?{
        val response = apiService.getGeneralService(urlService, token, body, typePetition)
        return response
    }
}