package com.astronauts.astronaut.framework;

import android.app.Application;
import android.content.Context;

import com.astronauts.astronaut.di.component.AppComponent;
import com.astronauts.astronaut.di.component.DaggerAppComponent;
import com.astronauts.astronaut.di.module.AppContextModule;

/**
 * Created by another_throwaway23 on 28.04.17.
 */

public class AstronautApplication extends Application implements AppContextProvider {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder().appContextModule(new AppContextModule(this)).build();

    }

    @Override
    public Context getAppContext() {
        return this;
    }

    @Override
    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}

