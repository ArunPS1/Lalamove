package com.app.delivery.injection;

import java.lang.System;

/**
 * *
 * * Created by Arun PS on 16-01-2019.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/app/delivery/injection/ViewModelInjector;", "", "inject", "", "postListViewModel", "Lcom/app/delivery/viewmodal/DeliveryDetailsViewModal;", "Builder", "app_productionDebug"})
@dagger.Component(modules = {com.app.delivery.injection.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface ViewModelInjector {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.app.delivery.viewmodal.DeliveryDetailsViewModal postListViewModel);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/app/delivery/injection/ViewModelInjector$Builder;", "", "build", "Lcom/app/delivery/injection/ViewModelInjector;", "networkModule", "Lcom/app/delivery/injection/NetworkModule;", "app_productionDebug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.app.delivery.injection.ViewModelInjector build();
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.app.delivery.injection.ViewModelInjector.Builder networkModule(@org.jetbrains.annotations.NotNull()
        com.app.delivery.injection.NetworkModule networkModule);
    }
}