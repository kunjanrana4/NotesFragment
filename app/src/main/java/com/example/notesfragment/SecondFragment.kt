package com.example.notesfragment

import android.icu.text.CaseMap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {
    lateinit var txttitle: TextView
    lateinit var desc: TextView
    var idNote:Long = 0
    private lateinit var listViewNote : ListView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        txttitle = view.findViewById(R.id.txtTitle)
        desc = view.findViewById(R.id.txtDescription)

        listViewNote = view.findViewById(R.id.listNote)
        val noteAdapter = NoteAdapter(activity!!.baseContext, getNotes())
        listViewNote.adapter = noteAdapter
        return view
    }
    fun displayData(title: String, description: String) {
        txttitle.text = title
        desc.text = description
    }
    private fun getNotes():ArrayList<Notes> {
        val note : ArrayList<Notes> = ArrayList()
        idNote += 1
        note.add((Notes(idNote, txtTitle.text.toString(), txtDescription.text.toString())))
        return note
    }
}
