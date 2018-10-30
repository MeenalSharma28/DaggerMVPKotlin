package com.app.dagger.mvp.kotlin.module

import android.content.Context
import com.app.dagger.demo.module.ActivityModule
import com.app.dagger.mvp.kotlin.adapter.CountryListAdapter
import com.app.dagger.mvp.kotlin.interfaces.ActivityContext
import com.app.dagger.mvp.kotlin.interfaces.CountryListView
import com.app.dagger.mvp.kotlin.interfaces.CountryListViewContext
import com.app.dagger.mvp.kotlin.network.ApiInterface
import com.app.dagger.mvp.kotlin.presenter.CountryListPresenter
import dagger.Module
import dagger.Provides

@Module
class CountryListActivityModule {

    @Provides
    fun provideCountryListAdapter(@ActivityContext context: Context): CountryListAdapter {
        return CountryListAdapter(context)
    }

    @Provides
    fun provideCountryListPresenter(@CountryListViewContext countryListView: CountryListView, apiInterface: ApiInterface): CountryListPresenter {
        return CountryListPresenter(countryListView, apiInterface)
    }

}