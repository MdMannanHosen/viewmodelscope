package com.mannanhosen.viewmodelscope
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel(){
    init {
        viewModelScope.launch {
            while (true){
                delay(1000)
                Log.d("MainViewModel","Hello from viewModelScope")
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("MainViewModel", "ViewModel cleared")
    }
}