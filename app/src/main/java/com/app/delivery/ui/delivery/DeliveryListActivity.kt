package com.app.delivery.ui.delivery

import android.os.Bundle
import com.app.delivery.R
import com.app.delivery.ui.base.BaseActivity
import com.facebook.drawee.backends.pipeline.Fresco
import kotlinx.android.synthetic.main.activity_common_toolbar_fragment_holder.*

/**
 *
 * Created by Arun PS on 16-01-2019.
 */
class DeliveryListActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_common_toolbar_fragment_holder)
        addFragment(DeliveryListFragment.tag, DeliveryListFragment.newInstance(), R.id.cLBase)
        initializeToolBar(tool_common, "Thinks to Deliver")
        setToolBarHolder(tool_common, true)
        registerBackStackListener()

    }
}
