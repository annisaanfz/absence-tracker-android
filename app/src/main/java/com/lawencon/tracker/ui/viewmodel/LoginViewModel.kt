package com.lawencon.tracker.ui.viewmodel

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.google.android.material.textfield.TextInputEditText
import com.lawencon.tracker.R
import com.lawencon.tracker.data.model.Users
import com.lawencon.tracker.data.repo.LoginRepository
import kotlinx.coroutines.Dispatchers

class LoginViewModel : ViewModel() {

    //        val respon = liveData(Dispatchers.IO) {
//            val res = loginRepository.signin(user)
//            emit(res)
//        }
//        respon.observe(this, Observer {
//            Log.i("ResponLogin", respon.value!!.token)
//        })
    val loginRepository = LoginRepository()
    fun loginResponse(user: Users) = liveData(Dispatchers.IO) {
        emit(loginRepository.signin(user))
    }

//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)

}