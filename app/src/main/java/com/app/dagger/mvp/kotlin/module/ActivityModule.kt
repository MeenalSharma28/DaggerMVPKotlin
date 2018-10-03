package com.app.dagger.demo.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ActivityModule {
    val context: Context

    constructor(context: Activity) {
        this.context = context
    }

    @Named("activity_context")
    @Provides
    fun getActivityContext(): Context {
        return context
    }
}