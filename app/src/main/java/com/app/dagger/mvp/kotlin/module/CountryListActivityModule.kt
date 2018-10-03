package com.app.dagger.mvp.kotlin.module

import com.app.dagger.mvp.kotlin.adapter.CountryListAdapter
import com.app.dagger.mvp.kotlin.presenter.CountryListPresenter
import dagger.Module
import dagger.Provides

@Module
class CountryListActivityModule {


    @Provides
    fun provideCountryListAdapter(): CountryListAdapter {
        return CountryListAdapter()
    }

    @Provides
    fun provideCountryListPresenter(): CountryListPresenter {
        return CountryListPresenter()
    }

}