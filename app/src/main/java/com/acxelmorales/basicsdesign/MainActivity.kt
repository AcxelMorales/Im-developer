package com.acxelmorales.basicsdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSend = findViewById<Button>(R.id.btnSend)
        val etName = findViewById<EditText>(R.id.etName)
        val cbDeveloper = findViewById<CheckBox>(R.id.cbDeveloper)

        btnSend.setOnClickListener {
            if (validData(etName) && cbDeveloper.isChecked) {
                Toast.makeText(this, etName.text.toString() + " you are great", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "You need to put a name and be a developer", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validData(name: EditText): Boolean {
        if (name.text.isNullOrEmpty()) return false
        return true
    }

}
