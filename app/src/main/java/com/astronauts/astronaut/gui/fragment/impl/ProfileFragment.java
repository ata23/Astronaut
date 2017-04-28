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
import com.astronauts.astronaut.gui.fragment.ProfileFragmentType;
import com.astronauts.astronaut.gui.fragment.ProfilePresenterType;

import javax.inject.Inject;

public class ProfileFragment extends BaseFragment<ProfileFragmentType, ProfilePresenterType> implements ProfileFragmentType {

    @Inject
    ProfilePresenterType mpProfilePresenterType;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.profile_view, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mpProfilePresenterType.setView(this);
    }

    @Override
    public void showError(int errorId) {

    }

    @Override
    public void endPresentation() {

    }

    @Override
    public ProfilePresenterType getPresenter() {
        return mpProfilePresenterType;
    }

    @Override
    protected void performInjection(AppComponent appComponent) {
        appComponent.plus(new ActivityModule()).inject(this);
    }
}