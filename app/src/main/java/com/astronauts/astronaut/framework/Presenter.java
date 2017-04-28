package com.astronauts.astronaut.framework;

/**
 * Created by another_throwaway23 on 28.04.17.
 */
public interface Presenter<T extends ViewType> extends LifecycleAwareObject {

    void setView(T view);

    void onPresentationEnd();

    boolean onBackPressed();
}
