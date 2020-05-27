package com.example.notesfragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class NoteAdapter(private  val context: Context, private val Datasource:ArrayList<Notes>):BaseAdapter() {
    private val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val listNoteView : View = layoutInflater.inflate(R.layout.notes_list,parent,false)
        val notes:Notes = getItem(position)
        listNoteView.findViewById<TextView>(R.id.title).setText(notes.nNoteTitle)
        listNoteView.findViewById<TextView>(R.id.description).setText(notes.nNoteDescription)
        return listNoteView
    }

    override fun getItem(position: Int): Notes {
        return Datasource[position]
    }

    override fun getItemId(position: Int): Long {
        return Datasource[position].getNoteId()
    }

    override fun getCount(): Int {
        return Datasource.size
    }
}