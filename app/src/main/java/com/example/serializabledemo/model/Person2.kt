package com.example.serializabledemo.model

import android.os.Parcel
import android.os.Parcelable

class Person2 : Parcelable {
    var name: String = ""
    var age: Int = 0
    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
        dest.writeInt(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Person> {
        override fun createFromParcel(source: Parcel): Person {
            val person = Person()
            person.name = source.readString() ?: "" // 读取name
            person.age = source.readInt() // 读取age
            return person
        }

        override fun newArray(size: Int): Array<Person?> {
            return arrayOfNulls(size)
        }

    }
}