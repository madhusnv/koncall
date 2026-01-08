package com.koncall.app.di

import android.content.Context
import androidx.room.Room
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
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
        )
        .addMigrations(MIGRATION_4_5)
        .fallbackToDestructiveMigration()
        .build()
    }
    
    /**
     * Migration from v4 to v5: Add unique constraint on recording URI
     * Prevents duplicate recordings from being inserted for the same file
     */
    private val MIGRATION_4_5 = object : Migration(4, 5) {
        override fun migrate(database: SupportSQLiteDatabase) {
            // Step 1: Remove any existing duplicate recordings (keep oldest match)
            database.execSQL("""
                DELETE FROM recordings
                WHERE id NOT IN (
                    SELECT MIN(id)
                    FROM recordings
                    GROUP BY uri
                )
            """)
            
            // Step 2: Create unique index on uri column
            database.execSQL(
                "CREATE UNIQUE INDEX IF NOT EXISTS index_recordings_uri ON recordings(uri)"
            )
        }
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
