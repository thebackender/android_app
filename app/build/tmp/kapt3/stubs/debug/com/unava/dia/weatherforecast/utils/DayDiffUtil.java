package com.unava.dia.weatherforecast.utils;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import com.unava.dia.weatherforecast.data.model.future.Forecastday;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/unava/dia/weatherforecast/utils/DayDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/unava/dia/weatherforecast/data/model/future/Forecastday;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "getNewList$app_debug", "()Ljava/util/List;", "setNewList$app_debug", "(Ljava/util/List;)V", "getOldList$app_debug", "setOldList$app_debug", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getChangePayload", "", "getNewListSize", "getOldListSize", "app_debug"})
public final class DayDiffUtil extends androidx.recyclerview.widget.DiffUtil.Callback {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.unava.dia.weatherforecast.data.model.future.Forecastday> oldList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.unava.dia.weatherforecast.data.model.future.Forecastday> newList;
    
    public DayDiffUtil(@org.jetbrains.annotations.NotNull()
    java.util.List<com.unava.dia.weatherforecast.data.model.future.Forecastday> oldList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.unava.dia.weatherforecast.data.model.future.Forecastday> newList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.unava.dia.weatherforecast.data.model.future.Forecastday> getOldList$app_debug() {
        return null;
    }
    
    public final void setOldList$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.unava.dia.weatherforecast.data.model.future.Forecastday> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.unava.dia.weatherforecast.data.model.future.Forecastday> getNewList$app_debug() {
        return null;
    }
    
    public final void setNewList$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.unava.dia.weatherforecast.data.model.future.Forecastday> p0) {
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }
    
    @java.lang.Override()
    public int getNewListSize() {
        return 0;
    }
    
    @java.lang.Override()
    public int getOldListSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @java.lang.Override()
    public java.lang.Object getChangePayload(int oldItemPosition, int newItemPosition) {
        return null;
    }
}