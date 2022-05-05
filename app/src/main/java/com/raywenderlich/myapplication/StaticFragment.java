package com.raywenderlich.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

/**
 * Example about replacing fragments inside a ViewPager. I'm using
 * android-support-v7 to maximize the compatibility.
 *
 * @author Dani Lao (@dani_lao)
 */
public class StaticFragment extends Fragment {

    private static final String TAG = "StaticFragment";
    private int number;

    public StaticFragment(int number) {
        this.number = number;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e("hahaha","onAttach " +number);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("hahaha","onDetach " +number);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("hahaha","onCreateView " + number);
        // Inflate the layout for this fragment
        View view = inflater
                .inflate(R.layout.static_fragment, container, false);

        TextView tv1 = view.findViewById(R.id.tv1);
        tv1.setText(number + "");
        tv1.setBackground(getColor(number));

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("hahaha","onDestroy " +number);
    }

    private Drawable getColor(int number) {
        switch (number) {
            case 0:
                return getResources().getDrawable(R.color.purple_200, null);
            case 1:
                return getResources().getDrawable(R.color.purple_500, null);
            case 2:
                return getResources().getDrawable(R.color.purple_700, null);
            case 3:
                return getResources().getDrawable(R.color.teal_200, null);
            case 4:
                return getResources().getDrawable(R.color.teal_700, null);
            case 5:
                return getResources().getDrawable(R.color.black, null);
            case 6:
                return getResources().getDrawable(R.color.white, null);
            case 7:
                return getResources().getDrawable(R.color.yellow, null);
            case 8:
                return getResources().getDrawable(R.color.orange, null);
            case 9:
                return getResources().getDrawable(R.color.blue, null);
            case 10:
                return getResources().getDrawable(R.color.pink, null);
            default:
                return getResources().getDrawable(R.color.green, null);
        }
    }

}
