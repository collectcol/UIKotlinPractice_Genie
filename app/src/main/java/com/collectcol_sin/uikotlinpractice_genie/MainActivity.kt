package com.collectcol_sin.uikotlinpractice_genie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okBtn.setOnClickListener{
            val inputContent: String = contentEdt.text.toString()
            resultTxt.text = inputContent
        }
    }
}