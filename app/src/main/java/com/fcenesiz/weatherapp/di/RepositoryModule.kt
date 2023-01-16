package com.fcenesiz.weatherapp.di

import com.fcenesiz.weatherapp.data.location.DefaultLocationTracker
import com.fcenesiz.weatherapp.data.repository.WeatherRepositoryImpl
import com.fcenesiz.weatherapp.domain.location.LocationTracker
import com.fcenesiz.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository

}