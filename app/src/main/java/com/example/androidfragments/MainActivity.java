package com.example.androidfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeFragment(View view) {
        if (view == findViewById(R.id.btnFragOne)) {
            Toast.makeText(this, "Fragment One", Toast.LENGTH_SHORT).show();
            fragment = new Fragment1();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntDefault, fragment);
            ft.commit();
        } else if (view == findViewById(R.id.btnFragTwo)) {
            Toast.makeText(this, "Fragment Two", Toast.LENGTH_SHORT).show();
            fragment = new Fragment2();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntDefault, fragment);
            ft.commit();
        } else {
            Toast.makeText(this, "Outside", Toast.LENGTH_SHORT).show();
        }
    }

}