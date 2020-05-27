package com.example.notesfragment

import android.icu.text.CaseMap

class Notes(var nNoteId:Long, var nNoteTitle: String, var nNoteDescription:String) {
    fun getNoteId():Long {
        return nNoteId
    }
    fun getNoteTitle():String {
        return nNoteTitle
    }
    fun getNoteDescription():String {
        return nNoteDescription
    }
}