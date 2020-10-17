package com.example.serializabledemo.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Person3(var name: String, var age: Int) : Parcelable