package com.example.pokedex

import com.facebook.stetho.Stetho
import android.app.Application

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        if(BuildConfig.DEBUG)
            Stetho.initializeWithDefaults(this)
    }
}