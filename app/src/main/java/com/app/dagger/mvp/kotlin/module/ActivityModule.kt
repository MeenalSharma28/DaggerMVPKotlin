package com.app.dagger.demo.module

import android.app.Activity
import android.content.Context
import com.app.dagger.mvp.kotlin.interfaces.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {
    val context: Context

    constructor(context: Activity) {
        this.context = context
    }

    @ActivityContext
    @Provides
    fun getActivityContext(): Context {
        return context
    }
}