package com.spring2018.cidm4385.mareveles.criminalintent;
//added android.app.Activity
import android.app.Activity;
//changed android.support.v4.app.Fragment to android.app.Fragment
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
//changed 'extends Fragment' to extends activity
public class CrimeActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        //changed getSupportFragmentManager() to getFragmentManager
        FragmentManager fm = getFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null){
            fragment = new CrimeFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container,fragment)
                    .commit();
        }
    }
}