package com.example.MembacaEBook

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize

data class Book (
    var nama:String,
    var petikan:String,
    var url:String,
    var gambar:Int
) : Parcelable