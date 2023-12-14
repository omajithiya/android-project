package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OtpVarification extends AppCompatActivity {

    EditText inputnumber1,inputnumber2,inputnumber3,inputnumber4,inputnumber5,inputnumber6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_varification);

        Button verifybtnclick=findViewById(R.id.buttonotp);

        inputnumber1=findViewById(R.id.otp1);
        inputnumber2=findViewById(R.id.otp2);
        inputnumber3=findViewById(R.id.otp3);
        inputnumber4=findViewById(R.id.otp4);
        inputnumber5=findViewById(R.id.otp5);
        inputnumber6=findViewById(R.id.otp6);

        TextView textView=findViewById(R.id.textmobile_showNu);
        textView.setText(String.format(
                "+91-%s",getIntent().getStringExtra("mobile")
        ));

        verifybtnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputnumber1.getText().toString().trim().isEmpty() || inputnumber2.getText().toString().trim().isEmpty() || inputnumber3.getText().toString().trim().isEmpty() || inputnumber4.getText().toString().trim().isEmpty() || inputnumber5.getText().toString().trim().isEmpty() || inputnumber6.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "please enter all number", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Otp Verify", Toast.LENGTH_SHORT).show();
                }
            }
        });

        numberotpmove();
    }

    private void numberotpmove() {
        inputnumber1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!charSequence.toString().trim().isEmpty()) {
                    inputnumber2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        inputnumber2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!charSequence.toString().trim().isEmpty()) {
                    inputnumber3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        inputnumber3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!charSequence.toString().trim().isEmpty()) {
                    inputnumber4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        inputnumber4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!charSequence.toString().trim().isEmpty()) {
                    inputnumber5.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        inputnumber5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!charSequence.toString().trim().isEmpty()) {
                    inputnumber6.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}