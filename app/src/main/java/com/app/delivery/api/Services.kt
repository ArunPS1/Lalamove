package com.app.delivery.api

import com.app.delivery.api.data.Delivery
import io.reactivex.Observable
import retrofit2.http.GET

/**
 *
 * Created by Arun PS on 16-01-2019.
 */
interface ServiceAPI {

    @GET("/deliveries")
    fun getDeliveries(): Observable<ArrayList<Delivery>>
}