package com.app.dagger.mvp.kotlin.component

import com.app.dagger.demo.module.ActivityModule
import com.app.dagger.mvp.kotlin.activity.CountryListActivity
import com.app.dagger.mvp.kotlin.module.CountryListActivityModule
import dagger.Component

@Component(modules = [ActivityModule::class,CountryListActivityModule::class], dependencies = [NetComponent::class])
interface CountryListActivityComponent {

    fun inject(activity: CountryListActivity)

}