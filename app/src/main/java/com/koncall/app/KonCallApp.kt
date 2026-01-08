package com.koncall.app

import android.app.Application
import androidx.hilt.work.HiltWorkerFactory
import androidx.work.Configuration
import androidx.work.Constraints
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.NetworkType
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.koncall.app.service.SyncWorker
import com.koncall.app.service.WorkerTags
import com.google.firebase.crashlytics.FirebaseCrashlytics
import dagger.hilt.android.HiltAndroidApp
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@HiltAndroidApp
class KonCallApp : Application(), Configuration.Provider {

    @Inject
    lateinit var workerFactory: HiltWorkerFactory

    override val workManagerConfiguration: Configuration
        get() = Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .build()
    
    override fun onCreate() {
        super.onCreate()
        
        // Initialize Crashlytics
        initializeCrashlytics()
        
        scheduleSyncWorker()
    }
    
    private fun scheduleSyncWorker() {
        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()
        
        val syncRequest = PeriodicWorkRequestBuilder<SyncWorker>(
            15, TimeUnit.MINUTES  // Minimum interval for periodic work
        )
            .setConstraints(constraints)
            .addTag(com.koncall.app.service.WorkerTags.TAG_USER_DATA_SYNC)
            .addTag(com.koncall.app.service.WorkerTags.TAG_BACKGROUND_SYNC)
            .addTag(com.koncall.app.service.WorkerTags.TAG_SYNC_WORKER)
            .build()
        
        WorkManager.getInstance(this).enqueueUniquePeriodicWork(
            SyncWorker.WORK_NAME,
            ExistingPeriodicWorkPolicy.KEEP,
            syncRequest
        )
    }
    
    /**
     * Initialize Firebase Crashlytics.
     * Collects crash reports automatically.
     */
    private fun initializeCrashlytics() {
        val crashlytics = FirebaseCrashlytics.getInstance()
        
        // Enable in both debug and release for testing
        crashlytics.setCrashlyticsCollectionEnabled(true)
        
        // Set custom keys for better debugging
        crashlytics.setCustomKey("app_version", BuildConfig.VERSION_NAME)
        crashlytics.setCustomKey("version_code", BuildConfig.VERSION_CODE)
    }
}
