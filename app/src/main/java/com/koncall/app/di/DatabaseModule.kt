package com.koncall.app.di

import android.content.Context
import androidx.room.Room
import com.koncall.app.data.local.KonCallDatabase
import com.koncall.app.data.local.dao.CallLogDao
import com.koncall.app.data.local.dao.CallNoteDao
import com.koncall.app.data.local.dao.LeadDao
import com.koncall.app.data.local.dao.RecordingDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): KonCallDatabase {
        return Room.databaseBuilder(
            context,
            KonCallDatabase::class.java,
            KonCallDatabase.DATABASE_NAME
        ).fallbackToDestructiveMigration()
        .build()
    }

    @Provides
    @Singleton
    fun provideCallLogDao(database: KonCallDatabase): CallLogDao {
        return database.callLogDao()
    }

    @Provides
    @Singleton
    fun provideCallNoteDao(database: KonCallDatabase): CallNoteDao {
        return database.callNoteDao()
    }

    @Provides
    @Singleton
    fun provideLeadDao(database: KonCallDatabase): LeadDao {
        return database.leadDao()
    }

    @Provides
    @Singleton
    fun provideRecordingDao(database: KonCallDatabase): RecordingDao {
        return database.recordingDao()
    }
}
