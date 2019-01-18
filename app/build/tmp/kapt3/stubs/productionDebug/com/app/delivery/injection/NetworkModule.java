package com.app.delivery.injection;

import java.lang.System;

/**
 * *
 * * Created by Arun PS on 16-01-2019.
 */
@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/app/delivery/injection/NetworkModule;", "", "()V", "providePostApi", "Lcom/app/delivery/api/ServiceAPI;", "retrofit", "Lretrofit2/Retrofit;", "providePostApi$app_productionDebug", "provideRetrofitInterface", "provideRetrofitInterface$app_productionDebug", "app_productionDebug"})
@dagger.Module()
public final class NetworkModule {
    public static final com.app.delivery.injection.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public static final com.app.delivery.api.ServiceAPI providePostApi$app_productionDebug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public static final retrofit2.Retrofit provideRetrofitInterface$app_productionDebug() {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}