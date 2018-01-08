package com.example.ana.aoo_aula10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView textView = (TextView) findViewById(R.id.text);

        if (BuildConfig.PAID_VERSION) {// this is the flag configured in build.gradle
            textView.setText("Is Paid Version");
        } else {
            textView.setText("Is Free Version");
        }

    }
}
