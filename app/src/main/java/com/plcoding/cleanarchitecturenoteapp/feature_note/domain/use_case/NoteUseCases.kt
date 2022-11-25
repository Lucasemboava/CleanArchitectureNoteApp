package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote
)
// wrapper class where we create a variable for each of our useCases to inject this class on DI