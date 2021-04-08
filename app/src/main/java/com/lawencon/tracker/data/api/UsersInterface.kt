package com.lawencon.tracker.data.api

import com.lawencon.tracker.data.dto.LoginDto
import com.lawencon.tracker.data.model.Users
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface UsersInterface {
    @Headers("Content-Type:application/json")
    @POST("login")
//    fun signin(@Body user: Users): retrofit2.Call<ResponseBody>
    suspend fun signin(@Body user: Users): LoginDto
}