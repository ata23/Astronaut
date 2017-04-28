package com.astronauts.astronaut.di.component;

import com.astronauts.astronaut.gui.MainActivity;
import com.astronauts.astronaut.di.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class})
public interface NetworkComponent {
    void inject(MainActivity mainActivity); //declare where it will be injected (later in presenter)
}