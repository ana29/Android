package com.example.huawei.userformappaula04;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.Serializable;

/**
 * Created by huawei on 21/09/16.
 */
public class UserDetailFragment extends Fragment implements UserFormFragment.OnUserSavedListener{
    private TextView mName, mLogin, mPassword, mEmail, mBirthDate;

    private static final String USER_PARAM = "user_param";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.detail_user,container, false);

        mName = (TextView) view.findViewById(R.id.full_name);
        mBirthDate = (TextView) view.findViewById(R.id.birthdate);
        mPassword = (TextView) view.findViewById(R.id.password);
        mLogin = (TextView) view.findViewById(R.id.login);
        mEmail = (TextView) view.findViewById(R.id.email);

        if(getArguments() != null && !getArguments().isEmpty()) {
            Bundle args = getArguments();
            Serializable user = args.getSerializable("user_param");
            setViewValues((UserModel) user);
        }
        return view;
    }

    public static UserDetailFragment newInstance() {
        UserDetailFragment fragment = new UserDetailFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }


    public static UserDetailFragment newInstance(UserModel user) {
        UserDetailFragment fragment = new UserDetailFragment();
        Bundle args = new Bundle();
        args.putSerializable(USER_PARAM, user);
        fragment.setArguments(args);

        return fragment;
    }


    @Override
    public void onUserSaved(UserModel user) {
        Log.d("user", user.toString());

        setViewValues(user);

    }

    public void setViewValues(UserModel user) {
        if(user != null) {
            mName.setText(user.getName());
            mEmail.setText(user.getEmail());
            mPassword.setText(user.getPassword());
            mBirthDate.setText(user.getBirthdate());

        }
    }
}
