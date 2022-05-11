package com.unava.dia.weatherforecast.ui.fragments.future;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unava.dia.weatherforecast.R;
import com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse;
import com.unava.dia.weatherforecast.ui.fragments.base.BaseFragment;
import com.unava.dia.weatherforecast.utils.MarginItemDecoration;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/unava/dia/weatherforecast/ui/fragments/future/FragmentFuture;", "Lcom/unava/dia/weatherforecast/ui/fragments/base/BaseFragment;", "()V", "adapter", "Lcom/unava/dia/weatherforecast/ui/fragments/future/MounthAdapter;", "city", "", "rvMonth", "Landroidx/recyclerview/widget/RecyclerView;", "viewModel", "Lcom/unava/dia/weatherforecast/ui/fragments/future/FragmentFutureViewModel;", "bindViewModel", "", "getForecast", "initUi", "observeViewModel", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "setupRecyclerView", "updateView", "response", "Lcom/unava/dia/weatherforecast/data/model/future/FutureWeatherResponse;", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FragmentFuture extends com.unava.dia.weatherforecast.ui.fragments.base.BaseFragment {
    private com.unava.dia.weatherforecast.ui.fragments.future.FragmentFutureViewModel viewModel;
    private java.lang.String city = "London";
    private androidx.recyclerview.widget.RecyclerView rvMonth;
    private com.unava.dia.weatherforecast.ui.fragments.future.MounthAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    public static final com.unava.dia.weatherforecast.ui.fragments.future.FragmentFuture.Companion Companion = null;
    
    public FragmentFuture() {
        super(0);
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getForecast() {
    }
    
    @java.lang.Override()
    public void bindViewModel() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    @java.lang.Override()
    public void initUi() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void updateView(com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse response) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/unava/dia/weatherforecast/ui/fragments/future/FragmentFuture$Companion;", "", "()V", "newInstance", "Lcom/unava/dia/weatherforecast/ui/fragments/future/FragmentFuture;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.unava.dia.weatherforecast.ui.fragments.future.FragmentFuture newInstance() {
            return null;
        }
    }
}