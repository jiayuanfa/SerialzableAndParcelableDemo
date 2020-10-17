package com.example.serializabledemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.serializabledemo.model.Person3

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val person = intent.getParcelableExtra("person_data") as Person3
        Log.d("Person is ", person.age.toString())
    }
}