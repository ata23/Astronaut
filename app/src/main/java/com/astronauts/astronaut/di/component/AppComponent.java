package com.astronauts.astronaut.di.component;

import com.astronauts.astronaut.di.module.ActivityModule;
import com.astronauts.astronaut.di.module.AppContextModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by another_throwaway23 on 28.04.17.
 */

@Singleton
@Component(modules = {AppContextModule.class})
public interface AppComponent {

    ActivityComponent plus(final ActivityModule activityModule);

}
