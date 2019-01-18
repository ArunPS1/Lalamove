package com.app.delivery.injection

import com.app.delivery.viewmodal.DeliveryDetailsViewModal
import dagger.Component
import javax.inject.Singleton

/**
 *
 * Created by Arun PS on 16-01-2019.
 */
@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {
    fun inject(postListViewModel: DeliveryDetailsViewModal)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}