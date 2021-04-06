package com.lawencon.tracker.model

class Location(latitude : Double, longitude : Double) {
    private var latitude : Double
    private var longitude : Double

    init {
        this.latitude = latitude
        this.longitude = longitude
    }

    fun getLatitude() : Double?{
        return latitude
    }

    fun setLatitude(latitude: Double?) {
        this.latitude = latitude!!
    }

    fun getLongitude() : Double?{
        return longitude
    }

    fun setLongitude(longitude: Double?) {
        this.longitude = longitude!!
    }
}