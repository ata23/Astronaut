package com.astronauts.astronaut.gui.fragment.impl;

import com.astronauts.astronaut.framework.SubscriptionManager;
import com.astronauts.astronaut.gui.fragment.MikroblogFragmentType;
import com.astronauts.astronaut.gui.fragment.MikroblogPresenterType;

/**
 * Created by another_throwaway23 on 28.04.17.
 */

public class MikroblogPresenter extends SubscriptionManager implements MikroblogPresenterType {

    private MikroblogFragmentType mMikroblogFragmentType;

    @Override
    public void setView(final MikroblogFragmentType view) {
        mMikroblogFragmentType = view;
    }

    @Override
    public void onPresentationEnd() {

    }

    @Override
    public boolean onBackPressed() {
        return false;
    }
}
