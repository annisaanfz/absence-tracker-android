package com.lawencon.tracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lawencon.tracker.data.constant.Role
import com.lawencon.tracker.ui.view.AbsenceActivity
import com.lawencon.tracker.ui.view.LoginActivity
import com.lawencon.tracker.ui.view.MenuActivity
import com.lawencon.tracker.util.SharedPreferenceUtil

class MainActivity : AppCompatActivity() {
    var sharedPreferenceUtil = SharedPreferenceUtil()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        var token = sharedPreferenceUtil?.getParamStr(this, "token", "")
        val roleCode = sharedPreferenceUtil.getParamStr(this, "roleCode", "")
        when (roleCode) {
            "" -> {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
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