package com.astronauts.astronaut.network.component;

import com.astronauts.astronaut.gui.MainActivity;
import com.astronauts.astronaut.network.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class})
public interface NetworkComponent {
    void inject(MainActivity mainActivity); //declare where it will be injected (later in presenter)
}