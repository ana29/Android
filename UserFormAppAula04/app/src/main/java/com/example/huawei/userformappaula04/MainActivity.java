package com.example.huawei.userformappaula04;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;

/**
 * Created by Ana on 08/09/16.
 */
public class MainActivity extends AppCompatActivity implements  UserFormFragment.OnUserSavedListener{
    private static final String FRAGMENT_USER_EDIT = "fragment_form";
    private static final String FRAGMENT_USER_DETAIL = "fragment_detail";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getFragmentManager().beginTransaction().replace(R.id.form_fragment,
                UserFormFragment.newInstance(), FRAGMENT_USER_EDIT).commit();


        if(isTablet()) {
            getFragmentManager().beginTransaction().replace(R.id.form_fragment,
                    UserDetailFragment.newInstance(), FRAGMENT_USER_DETAIL).commit();
        }

    }

    public boolean isTablet() {
        return getResources().getBoolean(R.bool.tablet);
    }
    @Override
    public void onUserSaved(UserModel user) {

        if(isTablet()) {
            UserFormFragment.OnUserSavedListener callback =
                    (UserFormFragment.OnUserSavedListener)getSupportFragmentManager()
                            .findFragmentByTag(FRAGMENT_USER_DETAIL);


            callback.onUserSaved(user);
        } else {

            UserDetailFragment fragment = UserDetailFragment.newInstance(user);

            getFragmentManager().beginTransaction()
                    .replace(R.id.form_fragment, fragment)
                    .addToBackStack(null)
                    .commit();




        }







    }

}

