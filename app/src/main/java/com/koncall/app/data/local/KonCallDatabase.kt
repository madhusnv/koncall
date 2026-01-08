package com.koncall.app.data.local

import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.RoomDatabase
import com.koncall.app.data.local.dao.CallLogDao
import com.koncall.app.data.local.dao.CallNoteDao
import com.koncall.app.data.local.dao.LeadDao
import com.koncall.app.data.local.dao.RecordingDao
import com.koncall.app.data.local.entity.CallLogEntity
import com.koncall.app.data.local.entity.CallNoteEntity
import com.koncall.app.data.local.entity.LeadEntity
import com.koncall.app.data.local.entity.RecordingEntity

@Database(
    entities = [
        CallLogEntity::class,
        CallNoteEntity::class,
        LeadEntity::class,
        RecordingEntity::class
    ],
    version = 5,
    exportSchema = true
)
abstract class KonCallDatabase : RoomDatabase() {
    abstract fun callLogDao(): CallLogDao
    abstract fun callNoteDao(): CallNoteDao
    abstract fun leadDao(): LeadDao
    abstract fun recordingDao(): RecordingDao
    
    companion object {
        const val DATABASE_NAME = "koncall_database"
    }
}
