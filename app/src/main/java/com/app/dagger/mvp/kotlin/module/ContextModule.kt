package com.app.dagger.demo.module

import android.content.Context
import com.app.dagger.demo.interfaces.ApplicationContext
import dagger.Module
import dagger.Provides


@Module
class ContextModule {

    var context: Context

    constructor(context: Context) {
        this.context = context
    }

    @ApplicationContext
    @Provides
    fun context(): Context {
        return context.applicationContext
    }
}