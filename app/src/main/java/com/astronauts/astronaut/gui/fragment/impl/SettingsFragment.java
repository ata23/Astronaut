package com.astronauts.astronaut.gui.fragment.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astronauts.astronaut.R;
import com.astronauts.astronaut.di.component.AppComponent;
import com.astronauts.astronaut.di.module.ActivityModule;
import com.astronauts.astronaut.framework.BaseFragment;
import com.astronauts.astronaut.gui.fragment.SettingsFragmentType;
import com.astronauts.astronaut.gui.fragment.SettingsPresenterType;

import javax.inject.Inject;

public class SettingsFragment extends BaseFragment<SettingsFragmentType, SettingsPresenterType> implements SettingsFragmentType {

    @Inject
    SettingsPresenterType mSettingsPresenterType;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.settings_view, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mSettingsPresenterType.setView(this);
    }

    @Override
    public void showError(int errorId) {

    }

    @Override
    public void endPresentation() {

    }

    @Override
    public SettingsPresenterType getPresenter() {
        return mSettingsPresenterType;
    }

    @Override
    protected void performInjection(AppComponent appComponent) {
        appComponent.plus(new ActivityModule()).inject(this);
    }
}