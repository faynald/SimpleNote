package com.farhanrv.juaraandroid.simplenote.ui.update

import android.app.Application
import android.provider.ContactsContract
import androidx.lifecycle.ViewModel
import com.farhanrv.juaraandroid.simplenote.data.MyRepository
import com.farhanrv.juaraandroid.simplenote.data.local.NoteEntity

class UpdateViewModel(app: Application) : ViewModel() {

    private val mNoteRepository = MyRepository(app)

    fun insertNote(note: NoteEntity) {
        mNoteRepository.insertNote(note)
    }

    fun updateNote(note: NoteEntity) {
        mNoteRepository.updateNote(note)
    }

    fun deleteNote(note: NoteEntity) {
        mNoteRepository.deleteNote(note)
    }

}