package com.app.dagger.mvp.kotlin

import android.app.Application
import com.app.dagger.mvp.kotlin.component.DaggerNetComponent
import com.app.dagger.mvp.kotlin.component.NetComponent
import com.app.dagger.mvp.kotlin.module.RetrofitModule


class MyApplication : Application() {

    private var mNetComponent: NetComponent? = null


    override fun onCreate() {
        super.onCreate()
        mNetComponent = DaggerNetComponent.builder()
                .retrofitModule(RetrofitModule())
                .build()
    }

    fun getNetComponent(): NetComponent? {
        return mNetComponent
    }

}