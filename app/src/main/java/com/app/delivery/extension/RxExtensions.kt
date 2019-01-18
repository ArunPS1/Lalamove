package com.app.delivery.extension

import android.view.View
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.net.ConnectException
import java.net.SocketTimeoutException

/**
 * Created by Arun PS on 16-01-2019.
 *
 */

fun <T> Single<T>.runOnBackgroundObserveOnMain(): Single<T> {
    return this.subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread())
}

fun <T> Observable<T>.runOnBackgroundObserveOnMain(): Observable<T> {
    return this.subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread())
}

fun <T> Single<T>.onStart(onSubscribe: () -> Unit): Single<T> {
    return this.doOnSubscribe { onSubscribe() }
}

fun <T> Observable<T>.onStart(onSubscribe: () -> Unit): Observable<T> {
    return this.doOnSubscribe { onSubscribe() }
}

fun Throwable.handleError(view: View){
    view.snack(this.getMessage())
}

fun showSnack(view: View, message:String ){
    view.snack(message)
}

fun Throwable.getMessage(): String{
    return when(this){
        is ConnectException -> "Internet connectivity is not available."
        is SocketTimeoutException -> "Cannot contact server, please try again later."
        else ->  "An error occurred, please try again later."

    }
}