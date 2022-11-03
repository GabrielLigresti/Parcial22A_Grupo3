package com.challenge.parcial22a_grupo3.clases

import android.os.Parcel
import android.os.Parcelable

class Alumno(name:String, surname: String, bio: String, urlImage: String?):Parcelable {

    var name: String = ""
    var surname: String = ""
    var bio: String = ""
    var urlImage: String = ""

    constructor(parcel: Parcel) : this(
        TODO("name"),
        TODO("surname"),
        TODO("bio"),
        TODO("urlImage")
    ) {
        name = parcel.readString().toString()
        surname = parcel.readString().toString()
        bio = parcel.readString().toString()
        urlImage = parcel.readString().toString()
    }

    init {
        this.name = name
        this.surname = surname
        this.bio = bio
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(surname)
        parcel.writeString(bio)
        parcel.writeString(urlImage)
    }

    companion object CREATOR : Parcelable.Creator<Alumno> {
        override fun createFromParcel(parcel: Parcel): Alumno {
            return Alumno(parcel)
        }

        override fun newArray(size: Int): Array<Alumno?> {
            return arrayOfNulls(size)
        }
    }

}