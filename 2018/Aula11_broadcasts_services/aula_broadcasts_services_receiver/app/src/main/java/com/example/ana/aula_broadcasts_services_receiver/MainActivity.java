package com.example.ana.aula_broadcasts_services_receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Receiver rc;
    private IntentFilter itf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rc = new Receiver();
        itf = new IntentFilter("isa.TESTE");
        registerReceiver(rc, itf);
    }



    private class Receiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            TextView bm = findViewById(R.id.broadcast_receiver);

            bm.setText("Recebido " + intent.getAction());
            Log.d(intent.getAction().toString(), "onReceive: ");
        }

    }
}
