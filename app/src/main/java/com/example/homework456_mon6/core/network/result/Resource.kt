package com.example.homework456_mon6.core.network.result

import com.example.youtubeparcer.core.network.result.Status

data class Resource<out  T>(
    val status: com.example.homework456_mon6.core.network.result.Status, val data:T?, val message:String?,
    val code:Int?) {
    companion object{
        fun <T> success(data:T?): Resource<T>{
            return Resource(Status.SUCCESS, data, null, null)
        }

        fun <T> loading():Resource<T> {
            return Resource(Status.LOADING, null, null, null)
        }
        fun <T> error(msg: String?, data: T?, code: Int?  ):Resource<T>{
            return Resource(Status.ERROR, data, msg, code )
        }
    }
}