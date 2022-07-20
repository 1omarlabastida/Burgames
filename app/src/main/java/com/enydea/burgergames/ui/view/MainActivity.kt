package com.enydea.burgergames.ui.view

import android.os.Bundle
import android.util.Log
import com.enydea.burgergames.databinding.ActivityMainBinding
import com.enydea.burgergames.ui.viewmodel.ViewModelNumber
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: ViewModelNumber by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.parmNumerOneViewModel.observe(this, Observer {
            Log.d("IT ES", "$it")
        })


    }
}






































































































































































