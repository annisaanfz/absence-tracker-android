package com.lawencon.tracker.repo

import com.lawencon.tracker.api.RetrofitBuilder
import com.lawencon.tracker.api.UsersInterface
import com.lawencon.tracker.model.Users

class LoginRepository {
    val retIn = RetrofitBuilder.getRetrofitInstance().create(UsersInterface::class.java)
    suspend fun signin(user : Users) = retIn.signin(user)
}