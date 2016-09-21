package com.example.huawei.userformappaula04;




import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;


import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by huawei on 08/09/16.
 */
public class UserFormFragment extends Fragment {

    private EditText mName, mLogin, mPassword, mEmail, mBirthdate;
    private Button mButtonSave;
    private AppCompatActivity mActivity;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.form_user, container,false);

        mName = (EditText) view.findViewById(R.id.name);
        mLogin = (EditText) view.findViewById(R.id.login);
        mPassword = (EditText) view.findViewById(R.id.password);
        mEmail = (EditText) view.findViewById(R.id.email);
        mBirthdate = (EditText) view.findViewById(R.id.birthday);
        mButtonSave =(Button) view.findViewById(R.id.save);

        mButtonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserModel user = new UserModel(mName.getText().toString(),
                        mEmail.getText().toString(),
                        mLogin.getText().toString(),
                        mPassword.getText().toString(),
                        mBirthdate.getText().toString());
                try {
                    ((OnUserSavedListener) mActivity).onUserSaved(user);

                } catch (ClassCastException e) {
                    throw new ClassCastException(mActivity.toString()
                            + " must implement OnUserSavedListener");
                }

            }

        });




        return view;
    }

    public static UserFormFragment newInstance() {
        UserFormFragment fragment = new UserFormFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    public interface OnUserSavedListener {
        void onUserSaved(UserModel user);
    }
    public void onAttach(Context context) {
        super.onAttach(context);

        mActivity = (AppCompatActivity) context;
    }

}
