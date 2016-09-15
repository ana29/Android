package com.example.huawei.atividade1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class Activity extends AppCompatActivity {

    private static final String TAG = "lifecycle";

/*___________________________________inicio dos metodos do lifecycle______________________________*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        Log.d(TAG, String.format("%s.%s", getClassName(), "onCreate"));
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, String.format("%s.%s", getClassName(), "onResume"));
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, String.format("%s.%s", getClassName(), "onStart"));

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, String.format("%s.%s", getClassName(), "onPause"));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, String.format("%s.%s", getClassName(), "onStop"));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, String.format("%s.%s", getClassName(), "onRestart"));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, String.format("%s.%s", getClassName(), "onDestroy"));
    }
    public String getClassName() {
        String className = getClass().getName();
        return (className.substring(className.lastIndexOf(".")));
    }
/*___________________________________fim dos metodos do lifecycle_________________________________*/




}
