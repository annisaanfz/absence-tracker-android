package com.lawencon.tracker.api

import com.lawencon.tracker.model.Users
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface UsersInterface {
//    @Header("Content-Type:application/json")
    @POST("login")
    fun signin(@Body info: Users): retrofit2.Call<ResponseBody>


}