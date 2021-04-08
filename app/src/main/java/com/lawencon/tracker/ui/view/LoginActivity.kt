package com.lawencon.tracker.ui.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText
import com.lawencon.tracker.R
import com.lawencon.tracker.data.constant.Role
import com.lawencon.tracker.data.model.Users
import com.lawencon.tracker.ui.viewmodel.LoginViewModel
import com.lawencon.tracker.util.SharedPreferenceUtil

class LoginActivity : AppCompatActivity() {
    var loginViewModel: LoginViewModel? = null
    var sharedPreferenceUtil = SharedPreferenceUtil()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val imageView: ImageView = findViewById(R.id.imageView)
        val drawable = ResourcesCompat.getDrawable(resources, R.drawable.logo, null)

        val username = findViewById<TextInputEditText>(R.id.inputUsername)
        val password = findViewById<TextInputEditText>(R.id.inputPassword)
        val btn = findViewById<Button>(R.id.buttonLogin)
        var user = Users()

        imageView.setImageDrawable(drawable)

        loginViewModel = ViewModelProvider(this)[LoginViewModel::class.java]
        btn.setOnClickListener() {
            user.username = username.text.toString()
            user.password = password.text.toString()
            loginViewModel?.loginResponse(user)?.observe(this, Observer {
//                Log.i("ResponLogin", it.token)
                if (it != null) {
                    if(it.token != null){
                        sharedPreferenceUtil.sendParam(this, "token", it.token)
                    }
                    if(it.profile != null) {
                        if(it.profile?.roleCode != null) {
                            sharedPreferenceUtil.sendParam(this, "roleCode", it.profile?.roleCode!!)
                            when (it.profile?.roleCode) {
                                Role.MANAGER.code -> {
                                    val intent = Intent(this, MenuActivity::class.java)
                                    startActivity(intent)
                                }
                                Role.EMPLOYEE.code -> {
                                    val intent = Intent(this, AbsenceActivity::class.java)
                                    startActivity(intent)
                                }
                            }
                        }
                    }
                }
            })
        }
    }
}