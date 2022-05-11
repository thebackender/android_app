package com.unava.dia.weatherforecast.data.api;

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory;
import com.squareup.moshi.Moshi;
import com.unava.dia.weatherforecast.BuildConfig;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import okhttp3.logging.HttpLoggingInterceptor;
import java.util.*;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/unava/dia/weatherforecast/data/api/RetrofitFactory;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "interceptor", "Lokhttp3/Interceptor;", "lg", "Lokhttp3/logging/HttpLoggingInterceptor;", "kotlin.jvm.PlatformType", "api", "Lcom/unava/dia/weatherforecast/data/api/ApiInterface;", "connectionSpecs", "Lokhttp3/ConnectionSpec;", "retrofit", "Lretrofit2/Retrofit;", "app_debug"})
public final class RetrofitFactory {
    @org.jetbrains.annotations.NotNull()
    public static final com.unava.dia.weatherforecast.data.api.RetrofitFactory INSTANCE = null;
    
    /**
     * интерсептор который помогает передать апи ключ
     */
    private static okhttp3.Interceptor interceptor;
    private static final okhttp3.logging.HttpLoggingInterceptor lg = null;
    private static final okhttp3.OkHttpClient client = null;
    
    private RetrofitFactory() {
        super();
    }
    
    /**
     * возвращает объект ретрофита дл я запросов в сеть
     * для сереализации/десериализации используется Moshi
     */
    private final retrofit2.Retrofit retrofit() {
        return null;
    }
    
    /**
     * возвращает апи со всеми нужными функциями
     */
    @org.jetbrains.annotations.NotNull()
    public final com.unava.dia.weatherforecast.data.api.ApiInterface api() {
        return null;
    }
    
    /**
     * решает проблему с сертификатами
     */
    private final okhttp3.ConnectionSpec connectionSpecs() {
        return null;
    }
}