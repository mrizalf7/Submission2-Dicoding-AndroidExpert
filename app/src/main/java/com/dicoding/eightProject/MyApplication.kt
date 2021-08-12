package com.dicoding.eightProject

import android.app.Application
import com.dicoding.eightProject.core.di.databaseModule
import com.dicoding.eightProject.core.di.networkModule
import com.dicoding.eightProject.core.di.repositoryModule
import com.dicoding.eightProject.di.useCaseModule
import com.dicoding.eightProject.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}