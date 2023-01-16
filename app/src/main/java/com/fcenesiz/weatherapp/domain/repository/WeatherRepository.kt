package com.fcenesiz.weatherapp.domain.repository

import com.fcenesiz.weatherapp.domain.util.Resource
import com.fcenesiz.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, long : Double): Resource<WeatherInfo>

}