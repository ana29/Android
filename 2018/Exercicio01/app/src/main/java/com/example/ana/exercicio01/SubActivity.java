package com.example.ana.exercicio01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

/**
 * Created by ana on 1/3/18.
 */

public class SubActivity extends Activity {


    protected static final int INITIAL_VALUE = 0;

    protected Button ok;
    protected Button cancel;
    protected EditText first_value ;
    protected EditText second_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        ok = (Button) findViewById(R.id.ok_button);
        cancel = (Button) findViewById(R.id.cancel_button);
        first_value = (EditText) findViewById(R.id.first_value);
        second_value = (EditText) findViewById(R.id.second_value);


        ok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int v1;
                int v2;
                String sum = Integer.toString(INITIAL_VALUE);


                if (!first_value.getText().toString().equals("") && !second_value.getText().toString().equals("")) {

                    v1 = Integer.parseInt(first_value.getText().toString());
                    v2 = Integer.parseInt(second_value.getText().toString());

                    sum = Integer.toString(v1 + v2);

                }else if(first_value.getText().toString().equals("") && !second_value.getText().toString().equals("")){

                    v2 = Integer.parseInt(second_value.getText().toString());
                    sum = Integer.toString(v2);


                } else if(!first_value.getText().toString().equals("") && second_value.getText().toString().equals("")){
                    v1 = Integer.parseInt(first_value.getText().toString());
                    sum = Integer.toString(v1);
                }




                Intent sub_i = new Intent(SubActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("sum",sum);
                sub_i.putExtra("sum", sum);

                setResult(MainActivity.SUB_ACTIVITY_REQUEST_CODE, sub_i);
                finish();


            }
        });


        cancel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent sub_i = new Intent(SubActivity.this, MainActivity.class);
                startActivity(sub_i);
                finish();
            }

        });

    }



}
