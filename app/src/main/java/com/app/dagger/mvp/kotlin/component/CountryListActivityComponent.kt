package com.app.dagger.mvp.kotlin.component

import com.app.dagger.demo.module.ActivityModule
import com.app.dagger.mvp.kotlin.adapter.CountryListAdapter
import com.app.dagger.mvp.kotlin.module.CountryListActivityModule
import com.app.dagger.mvp.kotlin.module.CountryListPresenterModule
import com.app.dagger.mvp.kotlin.presenter.CountryListPresenter
import dagger.Component

@Component(modules = [ActivityModule::class,CountryListActivityModule::class, CountryListPresenterModule::class])
interface CountryListActivityComponent {

    fun getCountryListAdapter(): CountryListAdapter

    fun getCountryPresenter(): CountryListPresenter

}