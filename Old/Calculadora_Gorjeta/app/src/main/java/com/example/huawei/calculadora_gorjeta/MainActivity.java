package com.example.huawei.calculadora_gorjeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private EditText  editTextValorConta ;
    private TextView  textViewTip,textViewResult ;
    private Button buttonCalculaTip, buttonCalculaTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();



        textViewTip.setText(seekBar.getProgress()+"%");
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           int progress=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                progress=progressValue;
                textViewTip.setText(progressValue+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        buttonCalculaTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextValorConta.getText().toString().equals("")){
                    textViewResult.setText("R$ 0.00");

                }else {

                    Float valorConta = Float.parseFloat(String.valueOf(editTextValorConta.getText()));
                    Float tipPorcentagem = Float.parseFloat(String.valueOf(seekBar.getProgress()));
                    Float result= (valorConta*tipPorcentagem)/100;
                   // textViewResult.setText("R$ "+result.toString());
                    textViewResult.setText("R$ "+String.format("%.2f", result));
                }
            }
        });
        buttonCalculaTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextValorConta.getText().toString().equals("")){
                    textViewResult.setText("R$ 0.00");

                }else {

                    Float valorConta = Float.parseFloat(String.valueOf(editTextValorConta.getText()));
                    Float tipPorcentagem = Float.parseFloat(String.valueOf(seekBar.getProgress()));
                    Float valorTip= (valorConta*tipPorcentagem)/100;
                    Float result= valorConta+valorTip;

                   // textViewResult.setText("R$ "+result.toString());
                    textViewResult.setText("R$ "+String.format("%.2f", result));
                }


            }
        });


    }

    protected void initializeVariables() {
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        editTextValorConta= (EditText) findViewById(R.id.valorConta);
        textViewTip= (TextView) findViewById(R.id.textViewTip);
        textViewResult= (TextView) findViewById(R.id.textViewResult);
        buttonCalculaTip=(Button) findViewById(R.id.button_calcula_tip);
        buttonCalculaTotal=(Button) findViewById(R.id.button_calcula_total);

    }






}
