package com.example.serializabledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.serializabledemo.model.Person
import com.example.serializabledemo.model.Person3
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initBtn()
    }

    private fun initBtn() {
        toSecBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val person = Person3("fage", 29)
            intent.putExtra("person_data", person)
            startActivity(intent)
        }
    }
}