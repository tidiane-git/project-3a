package com.example.project3a


import android.R
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var label: TextView? = null
    var rvalue: EditText? = null
    var gvalue: EditText? = null
    var bvalue: EditText? = null
    var rval = 0
    var gval = 0
    var bval = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        label = findViewById<View>(R.id.label) as TextView
        rvalue = findViewById<View>(R.id.rvalue) as EditText
        gvalue = findViewById<View>(R.id.gvalue) as EditText
        bvalue = findViewById<View>(R.id.bvalue) as EditText
        rvalue!!.addTextChangedListener(object : TextWatcher {
            fun before(charSequence: CharSequence?, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                if (charSequence.length > 0 && charSequence[0] == '-' && charSequence.length >= 2) {
                    rval = charSequence.toString().toInt()
                    if (rval > 255) rval = 255
                    if (rval < 0) rval = 0
                }
                if (charSequence.length > 0 && charSequence[0] != '-') {
                    rval = charSequence.toString().toInt()
                    if (rval > 255) rval = 255
                    if (rval < 0) rval = 0
                }
                if (rval >= 0 && rval <= 255 && gval >= 0 && gval <= 255 && bval >= 0 && bval <= 255) label!!.setBackgroundColor(Color.rgb(rval, gval, bval))
            }

            override fun afterTextChanged(editable: Editable) {}
        })
        gvalue!!.addTextChangedListener(object : TextWatcher {
            fun before(charSequence: CharSequence?, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                if (charSequence.length > 0 && charSequence[0] == '-' && charSequence.length >= 2) {
                    gval = charSequence.toString().toInt()
                    if (gval > 255) gval = 255
                    if (gval < 0) gval = 0
                }
                if (charSequence.length > 0 && charSequence[0] != '-') {
                    if (!charSequence.toString().equals("", ignoreCase = true)) {
                        gval = charSequence.toString().toInt()
                        if (gval > 255) gval = 255
                        if (gval < 0) gval = 0
                    }
                }
                if (rval >= 0 && rval <= 255 && gval >= 0 && gval <= 255 && bval >= 0 && bval <= 255) label!!.setBackgroundColor(Color.rgb(rval, gval, bval))
            }

            override fun afterTextChanged(editable: Editable) {}
        })
        bvalue!!.addTextChangedListener(object : TextWatcher {
            fun before(charSequence: CharSequence?, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                if (charSequence.length > 0 && charSequence[0] == '-' && charSequence.length >= 2) {
                    bval = charSequence.toString().toInt()
                    if (bval > 255) bval = 255
                    if (bval < 0) bval = 0
                }
                if (charSequence.length > 0 && charSequence[0] != '-') {
                    bval = charSequence.toString().toInt()
                    if (bval > 255) bval = 255
                    if (bval < 0) bval = 0
                }
                if (rval >= 0 && rval <= 255 && gval >= 0 && gval <= 255 && bval >= 0 && bval <= 255) label!!.setBackgroundColor(Color.rgb(rval, gval, bval))
            }

            fun afterTextChanged() {}
        })
    }
}
