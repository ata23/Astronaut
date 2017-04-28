package com.astronauts.astronaut.di.component;

import com.astronauts.astronaut.di.module.ActivityModule;
import com.astronauts.astronaut.gui.MainActivity;
import com.astronauts.astronaut.gui.fragment.impl.MikroblogFragment;
import com.astronauts.astronaut.gui.fragment.impl.MojWykopFragment;
import com.astronauts.astronaut.gui.fragment.impl.ProfileFragment;
import com.astronauts.astronaut.gui.fragment.impl.SettingsFragment;

import dagger.Subcomponent;

/**
 * Created by another_throwaway23 on 28.04.17.
 */

@Subcomponent(modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(final MainActivity mainActivity);

    void inject(final MikroblogFragment mikroblogFragment);

    void inject(final MojWykopFragment mojWykopFragment);

    void inject(final ProfileFragment profileFragment);

    void inject(final SettingsFragment settingsFragment);
}
