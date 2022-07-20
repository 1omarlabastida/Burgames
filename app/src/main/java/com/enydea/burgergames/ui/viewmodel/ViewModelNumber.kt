package com.enydea.burgergames.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.enydea.burgergames.data.models.dataa
import com.enydea.burgergames.domain.GetUseCase
import kotlinx.coroutines.launch

open class ViewModelNumber: ViewModel() {

    val parmNumerOneViewModel = MutableLiveData<Any?>()

    fun onCreate(){
        viewModelScope.launch {
            val data = GetUseCase()
            println("la lista de paises es $data")
            if(data == null){

            }
            else{
                parmNumerOneViewModel.postValue(data)
            }
        }
    }
}