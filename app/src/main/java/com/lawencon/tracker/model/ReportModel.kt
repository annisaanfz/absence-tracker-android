package com.lawencon.tracker.model

class ReportModel(nama : String) {
    private  var nama : String

    init {
        this.nama = nama
    }

    fun getNama() : String?{
        return nama
    }

    fun setNama(nama : String?) {
        this.nama = nama!!
    }
}