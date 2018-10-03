package com.app.dagger.mvp.kotlin.network

import com.app.dagger.mvp.kotlin.model.CountriesResponse
import com.app.dagger.mvp.kotlin.model.CountryModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("all")
    fun getCountriesList() : Call<List<CountryModel>>
}