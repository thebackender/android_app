package com.unava.dia.weatherforecast.ui.fragments.current;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.unava.dia.weatherforecast.R;
import com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse;
import com.unava.dia.weatherforecast.ui.fragments.base.BaseFragment;
import com.unava.dia.weatherforecast.utils.GlideUtil;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/unava/dia/weatherforecast/ui/fragments/current/FragmentCurrent;", "Lcom/unava/dia/weatherforecast/ui/fragments/base/BaseFragment;", "()V", "btOk", "Landroid/widget/Button;", "ct", "", "etCity", "Landroid/widget/EditText;", "ivCondition", "Landroid/widget/ImageView;", "swTheme", "Lcom/google/android/material/switchmaterial/SwitchMaterial;", "tvCondition", "Landroid/widget/TextView;", "tvCurrentCountry", "tvTemp", "viewModel", "Lcom/unava/dia/weatherforecast/ui/fragments/current/CurrentViewModel;", "bindViewModel", "", "getWeather", "city", "initUi", "observeViewModel", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "updateView", "response", "Lcom/unava/dia/weatherforecast/data/model/curernt/CurrentWeatherResponse;", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FragmentCurrent extends com.unava.dia.weatherforecast.ui.fragments.base.BaseFragment {
    private java.lang.String ct = "London";
    private android.widget.Button btOk;
    private android.widget.TextView tvTemp;
    private android.widget.TextView tvCurrentCountry;
    private android.widget.TextView tvCondition;
    private android.widget.ImageView ivCondition;
    private android.widget.EditText etCity;
    private com.google.android.material.switchmaterial.SwitchMaterial swTheme;
    @org.jetbrains.annotations.NotNull()
    public static final com.unava.dia.weatherforecast.ui.fragments.current.FragmentCurrent.Companion Companion = null;
    private com.unava.dia.weatherforecast.ui.fragments.current.CurrentViewModel viewModel;
    
    public FragmentCurrent() {
        super(0);
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getWeather(java.lang.String city) {
    }
    
    @java.lang.Override()
    public void initUi() {
    }
    
    @java.lang.Override()
    public void bindViewModel() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void updateView(com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse response) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/unava/dia/weatherforecast/ui/fragments/current/FragmentCurrent$Companion;", "", "()V", "newInstance", "Lcom/unava/dia/weatherforecast/ui/fragments/current/FragmentCurrent;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.unava.dia.weatherforecast.ui.fragments.current.FragmentCurrent newInstance() {
            return null;
        }
    }
}