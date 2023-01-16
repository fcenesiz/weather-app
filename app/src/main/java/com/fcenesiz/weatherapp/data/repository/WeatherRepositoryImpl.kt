package com.fcenesiz.weatherapp.data.repository

import com.fcenesiz.weatherapp.data.mappers.toWeatherInfo
import com.fcenesiz.weatherapp.data.remote.WeatherApi
import com.fcenesiz.weatherapp.domain.repository.WeatherRepository
import com.fcenesiz.weatherapp.domain.util.Resource
import com.fcenesiz.weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long,
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }

}