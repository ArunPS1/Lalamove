package com.app.delivery.ui.delivery

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.delivery.R
import com.app.delivery.api.data.Delivery
import com.app.delivery.ui.base.BaseFragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.row_deliveries.*

/**
 *
 * Created by Arun PS on 17-01-2019.
 */
class DeliveryDetailsFragment : BaseFragment(), OnMapReadyCallback {

    private var currentContext: Context? = null
    private lateinit var map: GoogleMap
    private var delivery: Delivery? = null

    companion object {
        const val tag: String = "DeliveryDetailsFragment"
        fun newInstance(): DeliveryDetailsFragment = DeliveryDetailsFragment()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        currentContext = context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        delivery = arguments?.get("Delivery") as Delivery?

        return container?.inflate(R.layout.fragment_delivery_details, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtDeliveryDetails.text = delivery?.description
        sWProfilePic.setImageURI(delivery?.imageUrl, context)
        val mapFragment = fragmentManager?.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        if (googleMap != null) {
            map = googleMap
            if (delivery != null && delivery?.location != null) {
                val sydney = LatLng(delivery?.location?.lat!!, delivery?.location?.lng!!)
                map.addMarker(MarkerOptions().position(sydney).title("Test"))
                map.moveCamera(CameraUpdateFactory.newLatLng(sydney))
                map.animateCamera(
                    CameraUpdateFactory.newLatLngZoom(
                        LatLng(
                            delivery?.location?.lat!!,
                            delivery?.location?.lng!!
                        ), 15.0f
                    )
                )
            }
        }

    }

}