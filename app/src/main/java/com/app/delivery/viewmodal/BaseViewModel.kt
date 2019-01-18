package com.app.delivery.viewmodal

import android.arch.lifecycle.ViewModel
import com.app.delivery.injection.DaggerViewModelInjector
import com.app.delivery.injection.NetworkModule
import com.app.delivery.injection.ViewModelInjector

/**
 *
 * Created by Arun PS on 16-01-2019.
 */
abstract class BaseViewModel : ViewModel() {
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is DeliveryDetailsViewModal -> injector.inject(this)
        }
    }
}