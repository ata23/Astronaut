package com.astronauts.astronaut.framework;

import android.content.Context;

import com.astronauts.astronaut.di.component.AppComponent;

/**
 * Created by another_throwaway23 on 28.04.17.
 */

public interface AppContextProvider {

    Context getAppContext();

    AppComponent getAppComponent();
}
