package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
        MyPref_Frag myPref_frag=new MyPref_Frag();
        fragmentTransaction.replace(android.R.id.content,myPref_frag);
        fragmentTransaction.commit();



    }
}