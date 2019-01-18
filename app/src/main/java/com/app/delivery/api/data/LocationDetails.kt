package com.app.delivery.api.data

import android.os.Parcel
import android.os.Parcelable

/**
 *
 * Created by Arun PS on 16-01-2019.
 */
data class LocationDetails(
    val lat: Double?,
    val lng: Double?,
    val address: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(lat)
        parcel.writeValue(lng)
        parcel.writeString(address)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<LocationDetails> {
        override fun createFromParcel(parcel: Parcel): LocationDetails {
            return LocationDetails(parcel)
        }

        override fun newArray(size: Int): Array<LocationDetails?> {
            return arrayOfNulls(size)
        }
    }
}

