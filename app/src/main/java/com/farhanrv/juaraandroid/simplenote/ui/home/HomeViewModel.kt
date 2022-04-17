package com.farhanrv.juaraandroid.simplenote.ui.home

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.farhanrv.juaraandroid.simplenote.data.MyRepository
import com.farhanrv.juaraandroid.simplenote.data.local.NoteEntity

class HomeViewModel(app: Application) : ViewModel() {
    private val mNoteRepository = MyRepository(app)
    fun getAllNotes(): LiveData<List<NoteEntity>> = mNoteRepository.getAllNotes()
}