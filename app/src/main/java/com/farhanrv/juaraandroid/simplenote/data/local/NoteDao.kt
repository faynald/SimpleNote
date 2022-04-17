package com.farhanrv.juaraandroid.simplenote.data.local

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertNote(note: NoteEntity)

    @Delete
    fun deleteNote(note: NoteEntity)

    @Update
    fun updateNote(note: NoteEntity)

    @Query("SELECT * from note ORDER BY id ASC")
    fun getAllNotes(): LiveData<List<NoteEntity>>
}