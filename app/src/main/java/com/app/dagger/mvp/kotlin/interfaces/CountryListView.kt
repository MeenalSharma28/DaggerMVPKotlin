package com.app.dagger.mvp.kotlin.interfaces

import com.app.dagger.mvp.kotlin.model.CountryModel
import retrofit2.Response

interface CountryListView {

    fun onSuccess(response: Response<List<CountryModel>>)
    fun onFailure()
    fun showProgressDialog()
    fun dismissProgressDialog()
}