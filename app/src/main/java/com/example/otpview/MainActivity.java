package com.example.otpview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et1=findViewById(R.id.et1);
        final EditText et2=findViewById(R.id.et2);
        final EditText et3=findViewById(R.id.et3);
        final EditText et4=findViewById(R.id.et4);
        final EditText et5=findViewById(R.id.et5);


       et1.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {

           }

           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {



           }

           @Override
           public void afterTextChanged(Editable s) {

               if (et1.getText().toString().length()==1){
                   et2.requestFocus();
               }

           }
       });


        et2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (before==1){
                    et1.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (et2.getText().toString().length()==1){
                    et3.requestFocus();
                }

            }
        });



        et3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (before==1){
                    et2.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (et3.getText().toString().length()==1){
                    et4.requestFocus();
                }

            }
        });



        et4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (before==1){
                    et3.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (et4.getText().toString().length()==1){
                    et5.requestFocus();
                }

            }
        });


        et5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {

                if (et5.getText().toString().length()==0){
                    et4.requestFocus();
                }



            }
        });



    }
}
