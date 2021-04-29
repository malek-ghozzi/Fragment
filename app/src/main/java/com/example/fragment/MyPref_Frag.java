package com.example.fragment;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.telephony.PreciseDataConnectionState;

import androidx.annotation.Nullable;

public class MyPref_Frag  extends PreferenceFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefernces);

    }
}
