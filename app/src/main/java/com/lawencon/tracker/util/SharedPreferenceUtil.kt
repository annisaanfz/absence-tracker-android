package com.lawencon.tracker.util

import android.content.Context
import android.content.SharedPreferences


class SharedPreferenceUtil {
    fun sendParam(ctx: Context, key: String, save: Any) {
        val share: SharedPreferences = ctx.getSharedPreferences("share", 0)
        val prefEditor = share.edit()
        when (save) {
            is Int -> prefEditor.putInt(key, (save as Int)!!)
            is String -> prefEditor.putString(key, save as String)
        }
//        if (save is Int) {
//
//        } else if (save is String) {
//
//        }
        prefEditor.commit()
    }

    fun getParamStr(
        ctx: Context,
        key: String?,
        defValueStr: String?
    ): String? {
        val settings = ctx.getSharedPreferences("getShare", 0)
        return settings.getString(key, defValueStr)
    }

    fun getParamInt(
        ctx: Context,
        key: String?,
        defValueStr: Int?
    ): Int? {
        val settings = ctx.getSharedPreferences("getShare", 0)
        return settings.getInt(key, defValueStr!!)
    }

}