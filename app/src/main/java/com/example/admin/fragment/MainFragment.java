package com.example.admin.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.fragmentdemo.R;

/**
 * Created by Admin on 8/23/2017.
 */

public class MainFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("States:", "onCreate");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("States:", "onAttach");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.e("States:", "onCreateView");
        return inflater.inflate(R.layout.fragment_layout, container, false);
    }

    @Override
    public void onStart() {
        Log.e("States:", "onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("States:", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("States:", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("States:", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("States:", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("States:", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("States:", "onDetach");
    }
}
