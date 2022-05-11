package com.unava.dia.weatherforecast.ui.fragments.future;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.unava.dia.weatherforecast.R;
import com.unava.dia.weatherforecast.data.model.future.Forecastday;
import com.unava.dia.weatherforecast.utils.DayDiffUtil;
import com.unava.dia.weatherforecast.utils.GlideUtil;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\fJ\b\u0010\u0014\u001a\u00020\fH\u0016J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0017J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/unava/dia/weatherforecast/ui/fragments/future/MounthAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/unava/dia/weatherforecast/ui/fragments/future/MounthAdapter$CustomViewHolder;", "response", "", "Lcom/unava/dia/weatherforecast/data/model/future/Forecastday;", "(Ljava/util/List;)V", "addWeather", "", "newWeather", "", "countRGB", "", "avg", "", "countRGBStroke", "fib", "n", "getItem", "position", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CustomViewHolder", "app_debug"})
public final class MounthAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.unava.dia.weatherforecast.ui.fragments.future.MounthAdapter.CustomViewHolder> {
    private final java.util.List<com.unava.dia.weatherforecast.data.model.future.Forecastday> response = null;
    
    public MounthAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.unava.dia.weatherforecast.data.model.future.Forecastday> response) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.unava.dia.weatherforecast.ui.fragments.future.MounthAdapter.CustomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.unava.dia.weatherforecast.ui.fragments.future.MounthAdapter.CustomViewHolder holder, int position) {
    }
    
    private final int fib(int n) {
        return 0;
    }
    
    private final int countRGBStroke(float avg) {
        return 0;
    }
    
    private final int countRGB(float avg) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unava.dia.weatherforecast.data.model.future.Forecastday getItem(int position) {
        return null;
    }
    
    public final void addWeather(@org.jetbrains.annotations.NotNull()
    java.util.List<com.unava.dia.weatherforecast.data.model.future.Forecastday> newWeather) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/unava/dia/weatherforecast/ui/fragments/future/MounthAdapter$CustomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "date", "Landroid/widget/TextView;", "getDate", "()Landroid/widget/TextView;", "day", "getDay", "ivCondition", "Landroid/widget/ImageView;", "getIvCondition", "()Landroid/widget/ImageView;", "mc", "Lcom/google/android/material/card/MaterialCardView;", "getMc", "()Lcom/google/android/material/card/MaterialCardView;", "night", "getNight", "app_debug"})
    public static final class CustomViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView date = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivCondition = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView day = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView night = null;
        @org.jetbrains.annotations.NotNull()
        private final com.google.android.material.card.MaterialCardView mc = null;
        
        public CustomViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvCondition() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDay() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNight() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.material.card.MaterialCardView getMc() {
            return null;
        }
    }
}