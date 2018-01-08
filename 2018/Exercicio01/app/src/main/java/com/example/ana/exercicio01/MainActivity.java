package com.example.ana.exercicio01;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected static final int SUB_ACTIVITY_REQUEST_CODE = 100;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b = (Button) findViewById(R.id.sum_button);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,
                        SubActivity.class);
                startActivityForResult(i, SUB_ACTIVITY_REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == SUB_ACTIVITY_REQUEST_CODE){

            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            SumFragment sumFragment =  new SumFragment();

            fragmentTransaction.replace(R.id.frame, sumFragment);
            fragmentTransaction.commit();

            fragmentManager.executePendingTransactions();

            Bundle bundle = data.getExtras();

            if(bundle!=null){
             SumFragment sFragment = (SumFragment) fragmentManager.findFragmentById(R.id.frame);
                if (sFragment != null) {
                    View fragment_view = sFragment.getView();
                    TextView t = fragment_view.findViewById(R.id.sum_result);
                    t.setText((bundle.getString("sum")));
                }
            }

            }


        }
    }
