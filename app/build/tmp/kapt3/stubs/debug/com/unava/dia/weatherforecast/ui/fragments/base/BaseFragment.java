package com.unava.dia.weatherforecast.ui.fragments.base;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.unava.dia.weatherforecast.utils.Constants;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH&J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0012\u001a\u00020\fH&J\b\u0010\u0013\u001a\u00020\fH&J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u000e\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0010J\u000e\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0010J\u0016\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006%"}, d2 = {"Lcom/unava/dia/weatherforecast/ui/fragments/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "cf", "", "(I)V", "shared", "Landroid/content/SharedPreferences;", "getShared", "()Landroid/content/SharedPreferences;", "setShared", "(Landroid/content/SharedPreferences;)V", "bindViewModel", "", "getCityFromShared", "", "getCurrentIdFromShared", "", "getFutureIdFromShared", "initUi", "observeViewModel", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "saveCountryToShared", "country", "saveCurrentToShared", "id", "saveForecastToShared", "showError", "message", "appContext", "Landroid/content/Context;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    private final int cf = 0;
    public android.content.SharedPreferences shared;
    
    public BaseFragment(int cf) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getShared() {
        return null;
    }
    
    public final void setShared(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    public abstract void bindViewModel();
    
    public abstract void observeViewModel();
    
    public abstract void initUi();
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void showError(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.content.Context appContext) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCityFromShared() {
        return null;
    }
    
    public final long getCurrentIdFromShared() {
        return 0L;
    }
    
    public final long getFutureIdFromShared() {
        return 0L;
    }
    
    public final void saveForecastToShared(long id) {
    }
    
    public final void saveCurrentToShared(long id) {
    }
    
    public final void saveCountryToShared(@org.jetbrains.annotations.NotNull()
    java.lang.String country) {
    }
}