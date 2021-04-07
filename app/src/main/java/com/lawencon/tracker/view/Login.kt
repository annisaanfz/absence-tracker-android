package com.lawencon.tracker.view

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lawencon.tracker.api.RetrofitBuilder
import com.lawencon.tracker.api.UsersInterface
import com.lawencon.tracker.model.Users
import com.lawencon.tracker.repo.LoginRepository
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import okhttp3.ResponseBody

class Login() : AppCompatActivity() {
    private val repository : LoginRepository = LoginRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        repository.signin(user)
    }
}