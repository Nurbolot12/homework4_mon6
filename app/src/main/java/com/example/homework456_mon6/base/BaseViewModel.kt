package com.example.homework456_mon6

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel: ViewModel(){
    val loading = MutableLiveData<Boolean>()
}