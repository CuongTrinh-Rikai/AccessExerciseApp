package com.rikai.exercise.apiservice

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UserApiModule {
    @Provides
    @Singleton
    fun provideApi(builder:Retrofit.Builder): UserApi {
        return builder
            .build()
            .create(UserApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit.Builder{
        return Retrofit.Builder()
            .baseUrl(ApiConfig.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
    }



}