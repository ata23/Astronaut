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
import com.astronauts.astronaut.gui.fragment.MikroblogFragmentType;
import com.astronauts.astronaut.gui.fragment.MikroblogPresenterType;

import javax.inject.Inject;

public class MikroblogFragment extends BaseFragment<MikroblogFragmentType, MikroblogPresenterType> implements MikroblogFragmentType {

    @Inject
    MikroblogPresenterType mMikroblogPresenterType;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.mikroblog_view, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mMikroblogPresenterType.setView(this);
    }

    @Override
    public void showError(int errorId) {

    }

    @Override
    public void endPresentation() {

    }

    @Override
    public MikroblogPresenterType getPresenter() {
        return mMikroblogPresenterType;
    }

    @Override
    protected void performInjection(AppComponent appComponent) {
        appComponent.plus(new ActivityModule()).inject(this);
    }
}