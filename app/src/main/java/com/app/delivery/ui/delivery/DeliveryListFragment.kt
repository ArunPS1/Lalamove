package com.app.delivery.ui.delivery

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.app.delivery.R
import com.app.delivery.adapter.DeliveryAdaptor
import com.app.delivery.api.data.Delivery
import com.app.delivery.extension.snack
import com.app.delivery.ui.base.BaseFragment
import com.app.delivery.viewmodal.DeliveryDetailsViewModal
import kotlinx.android.synthetic.main.fragment_delivery_list.*

/**
 *
 * Created by Arun PS on 16-01-2019.
 */
class DeliveryListFragment : BaseFragment() {

    private var currentContext: Context? = null
    private lateinit var viewModel: DeliveryDetailsViewModal


    companion object {
        const val tag: String = "DeliveryListFragment"
        fun newInstance(): DeliveryListFragment = DeliveryListFragment()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        currentContext = context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProviders.of(this).get(DeliveryDetailsViewModal::class.java)
        return container?.inflate(R.layout.fragment_delivery_list, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rVDeliveryDetails.layoutManager = LinearLayoutManager(currentContext, LinearLayout.VERTICAL, false)

        viewModel.getDeliveries()

        viewModel.deliveryDetails.observe(this, Observer {
            txtLoading.visibility = View.GONE
            if (it?.isNotEmpty()!!) {

                rVDeliveryDetails.adapter = DeliveryAdaptor(it, currentContext!!, callBack = object : callBack {

                    override fun position(position: Int, delivery: Delivery) {

                        val intent = Intent(activity, DeliveryDetailsActivity::class.java)
                        intent.putExtra("Delivery", delivery)
                        startActivity(intent)
                    }
                })
            }
        })

        viewModel.deliveryDetailsError.observe(this, Observer {
            txtLoading.visibility = View.GONE
            cLDelivery.snack(it)
        })
    }

    interface callBack {
        fun position(position: Int, delivery: Delivery)
    }


}