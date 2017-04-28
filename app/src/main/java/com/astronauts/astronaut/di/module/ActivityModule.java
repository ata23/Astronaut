package com.astronauts.astronaut.di.module;

import com.astronauts.astronaut.gui.fragment.MikroblogPresenterType;
import com.astronauts.astronaut.gui.fragment.MojWykopPresenterType;
import com.astronauts.astronaut.gui.fragment.ProfilePresenterType;
import com.astronauts.astronaut.gui.fragment.SettingsPresenterType;
import com.astronauts.astronaut.gui.fragment.impl.MikroblogPresenter;
import com.astronauts.astronaut.gui.fragment.impl.MojWykopPresenter;
import com.astronauts.astronaut.gui.fragment.impl.ProfilePresenter;
import com.astronauts.astronaut.gui.fragment.impl.SettingsPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by another_throwaway23 on 28.04.17.
 */

@Module
public class ActivityModule {

    @Provides
    MikroblogPresenterType provideMikroblogPresenter() {
        return new MikroblogPresenter();
    }

    @Provides
    MojWykopPresenterType provideMojWykopPresenter() {
        return new MojWykopPresenter();
    }

    @Provides
    ProfilePresenterType provideProfilePresenter() {
        return new ProfilePresenter();
    }

    @Provides
    SettingsPresenterType provideSettingsPresenter() {
        return new SettingsPresenter();
    }

}
