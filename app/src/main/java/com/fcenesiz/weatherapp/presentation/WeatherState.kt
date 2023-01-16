package com.fcenesiz.weatherapp.presentation

import com.fcenesiz.weatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error : String? = null
)
