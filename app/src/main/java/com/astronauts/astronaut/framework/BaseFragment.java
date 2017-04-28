package com.astronauts.astronaut.framework;

import android.app.Fragment;
import android.os.Bundle;

import com.astronauts.astronaut.di.component.AppComponent;

/**
 * Created by another_throwaway23 on 28.04.17.
 */

public abstract class BaseFragment<K extends ViewType, V extends Presenter<K>> extends Fragment {

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        performInjection(((AppContextProvider) getActivity().getApplication()).getAppComponent());
        getPresenter().onCreate();
    }

    @Override
    public void onStart() {
        super.onStart();
        getPresenter().onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        getPresenter().onResume();
    }

    @Override
    public void onPause() {
        getPresenter().onPause();
        super.onPause();
    }

    @Override
    public void onStop() {
        getPresenter().onStop();
        super.onStop();
    }

    @Override
    public void onDestroy() {
        getPresenter().onDestroy();
        super.onDestroy();
    }

    public abstract V getPresenter();

    public boolean onBackPressed() {
        return getPresenter().onBackPressed();
    }

    protected abstract void performInjection(final AppComponent appComponent);
}

