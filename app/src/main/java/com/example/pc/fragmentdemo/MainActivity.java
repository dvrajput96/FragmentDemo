package com.example.pc.fragmentdemo;

import android.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends FragmentActivity {

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStackImmediate();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.flmainactivity) != null) {
            if (savedInstanceState != null) {
                return;
            }
            FramentOne framentOne = new FramentOne();
            getSupportFragmentManager().beginTransaction().add(R.id.flmainactivity, framentOne).commit();

        }
    }
}
