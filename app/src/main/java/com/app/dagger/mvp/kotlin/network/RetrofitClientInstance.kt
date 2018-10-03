package com.app.dagger.mvp.kotlin.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClientInstance {

    companion object {
        private lateinit var retrofit: Retrofit
        private val mBaseUrl = "https://restcountries.eu/rest/v2/"
        fun getRetrofitInstance(): Retrofit {

                retrofit = Retrofit.Builder()
                        .baseUrl(mBaseUrl)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            return retrofit
        }
    }
}