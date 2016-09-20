package com.example.huawei.userformappaula04;



import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
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

    private EditText mNome, mLogin, mSenha, mEmail, mDataNascimento;
    private Button mButtonSave;
    private AppCompatActivity mActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.form_user, container,false);

        mNome = (EditText) view.findViewById(R.id.nome);
        mLogin = (EditText) view.findViewById(R.id.login);
        mSenha = (EditText) view.findViewById(R.id.senha);
        mEmail = (EditText) view.findViewById(R.id.email);
        mDataNascimento = (EditText) view.findViewById(R.id.dataNascimento);
        mButtonSave =(Button) view.findViewById(R.id.salvar);

        mButtonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserModel user = new UserModel(mNome.getText().toString(),
                        mEmail.getText().toString(),
                        mLogin.getText().toString(),
                        mSenha.getText().toString(),
                        mDataNascimento.getText().toString());

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



}
