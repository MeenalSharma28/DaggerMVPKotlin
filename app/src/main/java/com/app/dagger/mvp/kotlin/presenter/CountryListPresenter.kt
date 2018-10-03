package com.app.dagger.mvp.kotlin.presenter

import com.app.dagger.mvp.kotlin.interfaces.CountryListView
import com.app.dagger.mvp.kotlin.model.CountryModel
import com.app.dagger.mvp.kotlin.network.ApiInterface
import com.app.dagger.mvp.kotlin.network.RetrofitClientInstance
import retrofit2.Call
import retrofit2.Response

class CountryListPresenter {

    var countryListView: CountryListView? = null


    fun attach(countryListView: CountryListView) {
        this.countryListView = countryListView
    }

    fun getCountryData() {

        countryListView?.showProgressDialog()
        var apiInterface = RetrofitClientInstance.getRetrofitInstance().create(ApiInterface::class.java)

        var callToGetCountryList = apiInterface.getCountriesList()
        callToGetCountryList.enqueue(object : retrofit2.Callback<List<CountryModel>> {
            override fun onFailure(call: Call<List<CountryModel>>?, t: Throwable?) {
                countryListView?.onFailure()
            }

            override fun onResponse(call: Call<List<CountryModel>>?, response: Response<List<CountryModel>>?) {
                if (response != null && response.code() == 200) {
                    countryListView?.onSuccess(response)
                } else {
                    countryListView?.dismissProgressDialog()
                }
            }

        })
    }

}