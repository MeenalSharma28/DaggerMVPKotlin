package com.app.dagger.mvp.kotlin.module

import android.content.Context
import com.app.dagger.mvp.kotlin.adapter.CountryListAdapter
import com.app.dagger.mvp.kotlin.interfaces.CountryListView
import com.app.dagger.mvp.kotlin.presenter.CountryListPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class CountryListActivityModule @Inject constructor(val context: Context, val countryListView: CountryListView) {


    @Provides
    fun provideCountryListAdapter(): CountryListAdapter {
        return CountryListAdapter(context)
    }

    @Provides
    fun provideCountryListPresenter(): CountryListPresenter {
        return CountryListPresenter(countryListView)
    }

}