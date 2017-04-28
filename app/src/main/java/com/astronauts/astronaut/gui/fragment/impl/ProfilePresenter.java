package com.astronauts.astronaut.gui.fragment.impl;

import com.astronauts.astronaut.framework.SubscriptionManager;
import com.astronauts.astronaut.gui.fragment.ProfileFragmentType;
import com.astronauts.astronaut.gui.fragment.ProfilePresenterType;

/**
 * Created by another_throwaway23 on 28.04.17.
 */

public class ProfilePresenter extends SubscriptionManager implements ProfilePresenterType {

    private ProfileFragmentType mProfilePresenterType;

    @Override
    public void setView(final ProfileFragmentType view) {
        mProfilePresenterType = view;
    }

    @Override
    public void onPresentationEnd() {

    }

    @Override
    public boolean onBackPressed() {
        return false;
    }
}
