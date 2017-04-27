package com.astronauts.astronaut.gui;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.astronauts.astronaut.R;
import com.astronauts.astronaut.gui.fragment.MirkoblogFragment;
import com.astronauts.astronaut.gui.fragment.MojWykopFragment;
import com.astronauts.astronaut.gui.fragment.ProfileFragment;
import com.astronauts.astronaut.gui.fragment.SettingsFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
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
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                if (tabId == R.id.tab_mirkoblog) {
                    MirkoblogFragment fragment = new MirkoblogFragment();
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
}

