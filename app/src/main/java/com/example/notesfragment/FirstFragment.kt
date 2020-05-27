package com.example.notesfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class FirstFragment : Fragment() {

    interface GetData{
        fun sendData(title:String, description:String)
    }
    lateinit var get : GetData
    lateinit var send : Button
    lateinit var title : EditText
    lateinit var desc : EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        send = view.findViewById(R.id.btnSend)
        title = view.findViewById(R.id.edtTitle)
        desc = view.findViewById(R.id.edtDescription)

        send.setOnClickListener(View.OnClickListener {
            get.sendData(title.text.toString(), desc.text.toString())
        })
        return view
    }
}