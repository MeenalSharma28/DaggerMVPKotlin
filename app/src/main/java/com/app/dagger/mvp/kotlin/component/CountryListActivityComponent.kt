package com.app.dagger.mvp.kotlin.component

import com.app.dagger.mvp.kotlin.adapter.CountryListAdapter
import com.app.dagger.mvp.kotlin.module.CountryListActivityModule
import com.app.dagger.mvp.kotlin.module.CountryListPresenterModule
import com.app.dagger.mvp.kotlin.presenter.CountryListPresenter
import dagger.Component

@Component(modules = [CountryListActivityModule::class, CountryListPresenterModule::class])
interface CountryListActivityComponent {

    fun getCountryListAdapter(): CountryListAdapter

    fun getCountryPresenter(): CountryListPresenter

}