package com.app.delivery.viewmodal

import android.annotation.SuppressLint
import android.arch.lifecycle.MutableLiveData
import com.app.delivery.api.ServiceAPI
import com.app.delivery.api.data.Delivery
import com.app.delivery.extension.getMessage
import com.app.delivery.extension.onStart
import com.app.delivery.extension.runOnBackgroundObserveOnMain
import javax.inject.Inject

/**
 *
 * Created by Zco Engineer on 16-01-2019.
 */
@SuppressLint("CheckResult")
class DeliveryDetailsViewModal : BaseViewModel() {

    val deliveryDetails: MutableLiveData<ArrayList<Delivery>> = MutableLiveData()
    val deliveryDetailsError: MutableLiveData<String> = MutableLiveData()

    @Inject
    lateinit var postApi: ServiceAPI


    fun getDeliveries() {
        postApi.getDeliveries()
            .runOnBackgroundObserveOnMain()
            .onStart { }
            .subscribe({ result ->
                deliveryDetails.value = result

            }, {
                deliveryDetailsError.value = it.getMessage()
            })
    }


}