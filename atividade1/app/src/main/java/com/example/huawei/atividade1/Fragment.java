package com.example.huawei.atividade1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by huawei on 06/09/16.
 */
public class Fragment extends android.support.v4.app.Fragment {

    private static final String TAG = "lifecycle";

    private static final String SAVED_INSTANCES = "savedInstances";

    private int savedInstances;

/*___________________________________inicio dos metodos do lifecycle______________________________*/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment, container, false);

        if(savedInstanceState != null) {

            savedInstances = savedInstanceState.getInt(SAVED_INSTANCES, 0);


            if(savedInstances > 0) {
                //TODO Executar todo o trabalho necessário que dependa do estado salvo
            }

        }

        Log.d(TAG, String.format("%s.%s | savedInstances = %d",
                getClassName(), "onCreateView()", savedInstances));


        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, String.format("%s.%s", getClassName(), "Fragment-> onCreate"));

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, String.format("%s.%s", getClassName(), "Fragment-> onResume"));
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, String.format("%s.%s", getClassName(), "Fragment-> onStart"));

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, String.format("%s.%s", getClassName(), "Fragment-> onPause"));
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, String.format("%s.%s", getClassName(), "Fragment-> onStop"));
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, String.format("%s.%s", getClassName(), "Fragment-> onDestroy"));
    }
    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, String.format("%s.%s", getClassName(), "Fragment-> onDetach"));
    }
    public String getClassName() {
        String className = getClass().getName();
        return (className.substring(className.lastIndexOf(".")));
    }


    /*___________________________________fim dos metodos do lifecycle_________________________________*/


}
