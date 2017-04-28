package com.astronauts.astronaut.di.module;

import com.astronauts.astronaut.framework.AppContextProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by another_throwaway23 on 28.04.17.
 */

@Module
public class AppContextModule {

    private AppContextProvider mAppContextProvider;

    public AppContextModule(final AppContextProvider contextProvider) {
        mAppContextProvider = contextProvider;
    }

    @Provides
    @Singleton
    public AppContextProvider provideAppContextProvider() {
        return mAppContextProvider;
    }

}
