package com.example.huawei.userformappaula04;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Ana on 08/09/16.
 */
public class MainActivity extends AppCompatActivity {
    private static final String FRAGMENT_USER_EDIT = "fragment_form";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       getSupportFragmentManager().beginTransaction().replace(R.id.form_fragment, UserFormFragment.newInstance(),FRAGMENT_USER_EDIT);





    }


























}
