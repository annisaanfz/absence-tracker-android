package com.lawencon.tracker.data.repo

import com.lawencon.tracker.data.api.RetrofitBuilder
import com.lawencon.tracker.data.api.UsersInterface
import com.lawencon.tracker.data.model.Users

class LoginRepository {
    val retIn = RetrofitBuilder.getRetrofitInstance().create(UsersInterface::class.java)
    suspend fun signin(user : Users) = retIn.signin(user)
}