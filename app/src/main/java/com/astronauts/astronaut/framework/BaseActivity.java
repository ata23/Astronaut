package com.astronauts.astronaut.framework;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;

import com.astronauts.astronaut.di.component.AppComponent;

/**
 * Created by another_throwaway23 on 28.04.17.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        performInjection(((AstronautApplication) getApplication()).getAppComponent());
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        if (getContainer() == 0) {
            super.onBackPressed();
        } else {
            final Fragment fragment = getFragmentManager().findFragmentById(getContainer());
            if (fragment instanceof BaseFragment) {
                if (!((BaseFragment) fragment).onBackPressed()) {
                    super.onBackPressed();
                }
            }
        }
    }

    @IdRes
    public abstract int getContainer();

    protected abstract void performInjection(final AppComponent appComponent);
}
