package com.app.dagger.demo.module

import android.app.Activity
import android.content.Context
import com.app.dagger.mvp.kotlin.interfaces.ActivityContext
import com.app.dagger.mvp.kotlin.interfaces.CountryListView
import com.app.dagger.mvp.kotlin.interfaces.CountryListViewContext
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {
    val context: Context

    val countryListViews: CountryListView

    constructor(context: Activity, countryListView: CountryListView) {
        this.context = context
        this.countryListViews = countryListView
    }

    @ActivityContext
    @Provides
    fun getActivityContext(): Context {
        return context
    }

    @CountryListViewContext
    @Provides
    fun getCountryListView(): CountryListView {
        return countryListViews
    }
}