package com.astronauts.astronaut.framework;

/**
 * Created by another_throwaway23 on 28.04.17.
 */
public interface LifecycleAwareObject {

    void onCreate();

    void onStart();

    void onPause();

    void onResume();

    void onStop();

    void onDestroy();
}
