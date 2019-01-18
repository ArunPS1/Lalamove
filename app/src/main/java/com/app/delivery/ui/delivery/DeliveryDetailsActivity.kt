package com.app.delivery.ui.delivery

import android.os.Bundle
import com.app.delivery.R
import com.app.delivery.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_common_toolbar_fragment_holder.*

/**
 *
 * Created by arun.ps on 17-01-2019.
 */
class DeliveryDetailsActivity : BaseActivity() {

    val deliveryDetailsFragment: DeliveryDetailsFragment = DeliveryDetailsFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_common_toolbar_fragment_holder)
        deliveryDetailsFragment.arguments = intent.extras
        addFragment(DeliveryDetailsFragment.tag, deliveryDetailsFragment, R.id.cLBase)
        initializeToolBar(tool_common, "Details")
        setToolBarHolder(tool_common, true)
        registerBackStackListener()
        enableBackButton()
    }
}