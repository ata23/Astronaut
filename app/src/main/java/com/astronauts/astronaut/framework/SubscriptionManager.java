package com.astronauts.astronaut.framework;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by another_throwaway23 on 28.04.17.
 */
public class SubscriptionManager implements LifecycleAwareObject {

    private CompositeDisposable mCompositeDisposable;

    @Override
    public void onCreate() {
        mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    public void onStart() {
        //no-op
    }

    @Override
    public void onResume() {
        //no-op
    }

    @Override
    public void onPause() {
        //no-op
    }

    @Override
    public void onStop() {
        mCompositeDisposable.clear();
    }

    @Override
    public void onDestroy() {
        mCompositeDisposable.dispose();
    }

    public void addDisposable(final Disposable disposable) {
        mCompositeDisposable.add(disposable);
    }

    public void removeDisposable(final Disposable disposable) {
        mCompositeDisposable.remove(disposable);
    }
}
