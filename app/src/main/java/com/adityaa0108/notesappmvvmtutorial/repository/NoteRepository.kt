package com.adityaa0108.notesappmvvmtutorial.repository

import androidx.room.Query
import com.adityaa0108.notesappmvvmtutorial.db.NoteDatabase
import com.adityaa0108.notesappmvvmtutorial.model.Note

class NoteRepository(private val db:NoteDatabase) {

    fun getNote() = db.getNoteDao().getAllNote()
    fun searchNote(query: String) = db.getNoteDao().searchNote(query)
    suspend fun addNote(note: Note) = db.getNoteDao().addNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().delete(note)




}