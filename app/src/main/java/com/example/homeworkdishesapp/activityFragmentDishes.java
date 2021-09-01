package com.example.homeworkdishesapp;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class activityFragmentDishes extends Fragment {
    private static final String ARG_PARAM1 = "name";
    private static final String ARG_PARAM2 = "price";
    private static final String ARG_PARAM3 = "ingredient";

    private String mName;
    private String mPrice;
    private String mIngredient;

    public activityFragmentDishes(){}


    public static activityFragmentDishes newInstance(String mName, String mPrice , String mIngredient) {
        activityFragmentDishes fragment = new activityFragmentDishes();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, mName);
        args.putString(ARG_PARAM2, mPrice);
        args.putString(ARG_PARAM3, mIngredient);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mName = getArguments().getString(ARG_PARAM1);
            mPrice = getArguments().getString(ARG_PARAM2);
            mIngredient = getArguments().getString(ARG_PARAM3);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment_dishes, container, false);
    }
}