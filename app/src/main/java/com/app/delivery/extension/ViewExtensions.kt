package com.app.delivery.extension

import android.content.Context
import android.graphics.Color
import android.support.annotation.LayoutRes
import android.support.design.widget.Snackbar
import android.support.v7.widget.RecyclerView
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import java.util.regex.Pattern

/**
 * Created by Arun PS on 16-01-2019.
 *
 */

fun View.hideKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(windowToken, 0)
}

fun View.showKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
    imm!!.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY)
}

fun <T : RecyclerView.ViewHolder> T.listen(event: (position: Int, type: Int) -> Unit): T {
    itemView.setOnClickListener {
        event.invoke(getAdapterPosition(), getItemViewType())
    }
    return this
}

fun View.snack(message: String?, length: Int = Snackbar.LENGTH_LONG) {


    this.takeIf { null != message }?.apply {
        val snack = Snackbar.make(this, message!!, length)
        snack.duration = 5000;// 5 sec
        val layout = snack.view as Snackbar.SnackbarLayout
        val textView = layout.findViewById(android.support.design.R.id.snackbar_text) as TextView
        textView.maxLines = 10;

        snack.show()
    }
}