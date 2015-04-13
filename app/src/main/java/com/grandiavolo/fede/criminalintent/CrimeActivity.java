package com.grandiavolo.fede.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        System.out.println("#### main activity on create!!!");

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragmentContainer); // super weird that I have to uase the ResourceID of its container view

        // can I also do this?
        // Instead of the previous "Fragment fragment ...."line, this:
        // Fragment fragment = new CrimeFragment();
        // and then...
//        if (fragment != null){
//            System.out.println("#### fragment: " + fragment);
//            manager.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
//        } else {
//            System.out.println("#### fragment e' null?");
//        }


        if (fragment == null) {
            fragment = new CrimeFragment();
            // the following means:
            // 1. create a new Fragment Transaction (fm.beginTransaction() returns an instance of FragmentTransaction
            // 2. add an add operation in it and then commit
            manager.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
            System.out.println("##### here");
        }
    }
}

