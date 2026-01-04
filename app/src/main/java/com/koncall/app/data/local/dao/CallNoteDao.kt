package com.koncall.app.data.local.dao

import androidx.room.*
import com.koncall.app.data.local.entity.CallNoteEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CallNoteDao {
    
    @Query("SELECT * FROM call_notes WHERE callLogId = :callLogId ORDER BY createdAt DESC")
    fun getNotesByCallLogId(callLogId: String): Flow<List<CallNoteEntity>>
    
    @Query("SELECT * FROM call_notes WHERE callLogId = :callLogId ORDER BY createdAt DESC")
    suspend fun getNotesForCallLog(callLogId: String): List<CallNoteEntity>
    
    @Query("SELECT * FROM call_notes WHERE id = :id")
    suspend fun getNoteById(id: String): CallNoteEntity?
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: CallNoteEntity): Long
    
    @Update
    suspend fun updateNote(note: CallNoteEntity)
    
    @Delete
    suspend fun deleteNote(note: CallNoteEntity)
    
    @Query("DELETE FROM call_notes WHERE id = :noteId")
    suspend fun deleteNoteById(noteId: String)
}

