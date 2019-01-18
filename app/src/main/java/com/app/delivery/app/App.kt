package com.app.delivery.app

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

/**
 *
 * Created by arun.ps on 17-01-2019.
 */
class App:Application() {

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }
}