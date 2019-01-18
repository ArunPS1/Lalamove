package com.app.delivery.viewmodal;

import java.lang.System;

/**
 * *
 * * Created by Zco Engineer on 16-01-2019.
 */
@android.annotation.SuppressLint(value = {"CheckResult"})
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014R\'\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lcom/app/delivery/viewmodal/DeliveryDetailsViewModal;", "Lcom/app/delivery/viewmodal/BaseViewModel;", "()V", "deliveryDetails", "Landroid/arch/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/app/delivery/api/data/Delivery;", "Lkotlin/collections/ArrayList;", "getDeliveryDetails", "()Landroid/arch/lifecycle/MutableLiveData;", "deliveryDetailsError", "", "getDeliveryDetailsError", "postApi", "Lcom/app/delivery/api/ServiceAPI;", "getPostApi", "()Lcom/app/delivery/api/ServiceAPI;", "setPostApi", "(Lcom/app/delivery/api/ServiceAPI;)V", "getDeliveries", "", "app_productionDebug"})
public final class DeliveryDetailsViewModal extends com.app.delivery.viewmodal.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.util.ArrayList<com.app.delivery.api.data.Delivery>> deliveryDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> deliveryDetailsError = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.app.delivery.api.ServiceAPI postApi;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.util.ArrayList<com.app.delivery.api.data.Delivery>> getDeliveryDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getDeliveryDetailsError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.delivery.api.ServiceAPI getPostApi() {
        return null;
    }
    
    public final void setPostApi(@org.jetbrains.annotations.NotNull()
    com.app.delivery.api.ServiceAPI p0) {
    }
    
    public final void getDeliveries() {
    }
    
    public DeliveryDetailsViewModal() {
        super();
    }
}