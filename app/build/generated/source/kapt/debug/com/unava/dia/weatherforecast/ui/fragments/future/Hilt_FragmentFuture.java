package com.unava.dia.weatherforecast.ui.fragments.future;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import com.unava.dia.weatherforecast.ui.fragments.base.BaseFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Override;
import java.lang.SuppressWarnings;
import javax.annotation.processing.Generated;

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
@Generated("dagger.hilt.android.processor.internal.androidentrypoint.FragmentGenerator")
public abstract class Hilt_FragmentFuture extends BaseFragment {
  private ContextWrapper componentContext;

  private boolean disableGetContextFix;

  private boolean injected = false;

  Hilt_FragmentFuture(int cf) {
    super(cf);
  }

  @Override
  @CallSuper
  public void onAttach(Context context) {
    super.onAttach(context);
    initializeComponentContext();
    inject();
  }

  @Override
  @SuppressWarnings("deprecation")
  @CallSuper
  @MainThread
  public void onAttach(Activity activity) {
    super.onAttach(activity);
    Preconditions.checkState(componentContext == null || FragmentComponentManager.findActivity(componentContext) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.");
    initializeComponentContext();
    inject();
  }

  private void initializeComponentContext() {
    if (componentContext == null) {
      // Note: The LayoutInflater provided by this componentContext may be different from super Fragment's because we getting it from base context instead of cloning from the super Fragment's LayoutInflater.
      componentContext = FragmentComponentManager.createContextWrapper(super.getContext(), this);
      disableGetContextFix = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
    }
  }

  @Override
  public Context getContext() {
    if (super.getContext() == null && !disableGetContextFix) {
      return null;
    }
    initializeComponentContext();
    return componentContext;
  }

  @Override
  public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
    LayoutInflater inflater = super.onGetLayoutInflater(savedInstanceState);
    return LayoutInflater.from(FragmentComponentManager.createContextWrapper(inflater, this));
  }

  protected void inject() {
    if (!injected) {
      injected = true;
      ((FragmentFuture_GeneratedInjector) UnsafeCasts.<GeneratedComponentManagerHolder>unsafeCast(this).generatedComponent()).injectFragmentFuture(UnsafeCasts.<FragmentFuture>unsafeCast(this));
    }
  }
}
