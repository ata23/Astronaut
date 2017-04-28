package com.astronauts.astronaut.gui.fragment.impl;

import com.astronauts.astronaut.framework.SubscriptionManager;
import com.astronauts.astronaut.gui.fragment.MojWykopFragmentType;
import com.astronauts.astronaut.gui.fragment.MojWykopPresenterType;

/**
 * Created by another_throwaway23 on 28.04.17.
 */

public class MojWykopPresenter extends SubscriptionManager implements MojWykopPresenterType {

    private MojWykopFragmentType mMojWykopFragmentType;

    @Override
    public void setView(final MojWykopFragmentType view) {
        mMojWykopFragmentType = view;
    }

    @Override
    public void onPresentationEnd() {

    }

    @Override
    public boolean onBackPressed() {
        return false;
    }
}
