package com.app.dagger.mvp.kotlin.component

import com.app.dagger.mvp.kotlin.module.RetrofitModule
import com.app.dagger.mvp.kotlin.network.ApiInterface
import dagger.Component


@Component(modules = [RetrofitModule::class])
interface NetComponent {

    fun getRetrofitApi(): ApiInterface
}