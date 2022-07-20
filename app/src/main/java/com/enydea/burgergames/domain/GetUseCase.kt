package com.enydea.burgergames.domain

import android.app.Service
import com.enydea.burgergames.data.implement.ServiceImplement

class GetUseCase {

    private val repository = ServiceImplement()

    suspend operator fun invoke(urlService: String, token: String, body: Any?, typePetition: String): Any?{
        return repository.getResponse(urlService, token, body, typePetition)
    }
}