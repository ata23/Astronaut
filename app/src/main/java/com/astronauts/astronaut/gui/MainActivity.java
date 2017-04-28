package com.astronauts.astronaut.gui;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.IdRes;

import com.astronauts.astronaut.R;
import com.astronauts.astronaut.di.component.AppComponent;
import com.astronauts.astronaut.di.module.ActivityModule;
import com.astronauts.astronaut.framework.BaseActivity;
import com.astronauts.astronaut.gui.fragment.impl.MikroblogFragment;
import com.astronauts.astronaut.gui.fragment.impl.MojWykopFragment;
import com.astronauts.astronaut.gui.fragment.impl.ProfileFragment;
import com.astronauts.astronaut.gui.fragment.impl.SettingsFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity {
    @BindView(R.id.bottomBar)
    BottomBar bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //Prevent fragments from accidental overlapping
        if (savedInstanceState != null) {
            return;
        }

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                if (tabId == R.id.tab_mirkoblog) {
                    MikroblogFragment fragment = new MikroblogFragment();
                    transaction.replace(R.id.contentContainer, fragment);
                }
                if (tabId == R.id.tab_moj_wykop) {
                    MojWykopFragment fragment = new MojWykopFragment(

                    );
                    transaction.replace(R.id.contentContainer, fragment);
                }
                if (tabId == R.id.tab_profile) {
                    ProfileFragment fragment = new ProfileFragment();
                    transaction.replace(R.id.contentContainer, fragment);
                }
                if (tabId == R.id.tab_settings) {
                    SettingsFragment fragment = new SettingsFragment();
                    transaction.replace(R.id.contentContainer, fragment);
                }
                transaction.commit();
            }
        });

    }

    @Override
    public int getContainer() {
        return R.id.contentContainer;
    }

    @Override
    protected void performInjection(AppComponent appComponent) {
        appComponent.plus(new ActivityModule()).inject(this);
    }
}

