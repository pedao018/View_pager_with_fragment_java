package com.raywenderlich.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * Example about replacing fragments inside a ViewPager. I'm using
 * android-support-v7 to maximize the compatibility.
 *
 * @author Dani Lao (@dani_lao)
 */
public class StaticFragment extends Fragment {

    private static final String TAG = "StaticFragment";
    //private int number;

    /*public StaticFragment(int number) {
        this.number = number;
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater
                .inflate(R.layout.static_fragment, container, false);

        //TextView tv1 = view.findViewById(R.id.tv1);
        //tv1.setText(number + "");

        return view;
    }

}
