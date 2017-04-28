package com.astronauts.astronaut.gui.fragment.impl;

import com.astronauts.astronaut.framework.SubscriptionManager;
import com.astronauts.astronaut.gui.fragment.SettingsFragmentType;
import com.astronauts.astronaut.gui.fragment.SettingsPresenterType;

/**
 * Created by another_throwaway23 on 28.04.17.
 */

public class SettingsPresenter extends SubscriptionManager implements SettingsPresenterType {

    private SettingsFragmentType mSettingsFragmentType;

    @Override
    public void setView(final SettingsFragmentType view) {
        mSettingsFragmentType = view;
    }

    @Override
    public void onPresentationEnd() {

    }

    @Override
    public boolean onBackPressed() {
        return false;
    }
}
