package com.app.delivery.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.delivery.R
import com.app.delivery.api.data.Delivery
import com.app.delivery.extension.listen
import com.app.delivery.ui.delivery.DeliveryListFragment
import kotlinx.android.synthetic.main.row_deliveries.view.*

/**
 *
 * Created by Arun PS on 17-01-2019.
 */
class DeliveryAdaptor(
    val items: ArrayList<Delivery>,
    val context: Context,
    val callBack: DeliveryListFragment.callBack
) :
    RecyclerView.Adapter<DeliveryAdaptor.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        val view = LayoutInflater.from(context).inflate(R.layout.row_deliveries, parent, false)
        return ViewHolder(view).listen { pos, type ->
            val item = items.get(pos)
            callBack.position(pos, item )
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.profileImage?.setImageURI(items.get(position).imageUrl, context)
        holder.deliveryDescription.text = items.get(position).description

    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val profileImage = view.sWProfilePic
        val deliveryDescription = view.txtDeliveryDetails

    }
}