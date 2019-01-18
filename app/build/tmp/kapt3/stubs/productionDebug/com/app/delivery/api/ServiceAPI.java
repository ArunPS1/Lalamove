package com.app.delivery.api;

import java.lang.System;

/**
 * *
 * * Created by Arun PS on 16-01-2019.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/app/delivery/api/ServiceAPI;", "", "getDeliveries", "Lio/reactivex/Observable;", "Ljava/util/ArrayList;", "Lcom/app/delivery/api/data/Delivery;", "Lkotlin/collections/ArrayList;", "app_productionDebug"})
public abstract interface ServiceAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/deliveries")
    public abstract io.reactivex.Observable<java.util.ArrayList<com.app.delivery.api.data.Delivery>> getDeliveries();
}