package com.ideatecnologia.simuladospmmg

import android.app.Application
import com.ideatecnologia.simuladospmmg.di.KoinModuleInitializer
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.workmanager.koin.workManagerFactory
import org.koin.core.context.startKoin


/**
 * [Application]
 */
class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@AppApplication)
            workManagerFactory()
            modules(KoinModuleInitializer.modules())
        }
    }
}