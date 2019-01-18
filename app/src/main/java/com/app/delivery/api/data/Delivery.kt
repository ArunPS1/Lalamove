package com.app.delivery.api.data

import android.os.Parcel
import android.os.Parcelable

/**
 *
 * Created by Arun PS on 16-01-2019.
 */
data class Delivery(
    val id: Int?,
    val description: String?,
    val imageUrl: String?,
    val location: LocationDetails?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readParcelable(LocationDetails::class.java.classLoader)
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(description)
        parcel.writeString(imageUrl)
        parcel.writeParcelable(location, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Delivery> {
        override fun createFromParcel(parcel: Parcel): Delivery {
            return Delivery(parcel)
        }

        override fun newArray(size: Int): Array<Delivery?> {
            return arrayOfNulls(size)
        }
    }
}