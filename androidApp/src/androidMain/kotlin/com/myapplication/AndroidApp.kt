package com.myapplication

import android.app.Application
import di.initKoin

class AndroidApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}