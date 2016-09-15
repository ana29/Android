package com.example.huawei.userformappaula04;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by huawei on 08/09/16.
 */
public class UserFormFragment extends android.support.v4.app.Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.form_user, container,false);
        return view;

    }


    public static UserFormFragment newInstance() {

        UserFormFragment fragment = new UserFormFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
}
