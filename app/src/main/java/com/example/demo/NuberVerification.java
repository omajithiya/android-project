package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class NuberVerification extends AppCompatActivity {

    EditText enternumber;
    Button getotpbuttone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuber_verification);

        enternumber = findViewById(R.id.input_mo_no);
        getotpbuttone = findViewById(R.id.btn_getotp);

        ProgressBar progressBar = findViewById(R.id.progressbar_sending_otp);

        getotpbuttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!enternumber.getText().toString().trim().isEmpty()) {
                    if ((enternumber.getText().toString().trim()).length() == 10) {

                        progressBar.setVisibility(View.VISIBLE);
                        getotpbuttone.setVisibility(View.INVISIBLE);

                        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                                "+91" + enternumber.getText().toString(),
                                60,
                                TimeUnit.SECONDS,
                                NuberVerification.this,
                                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                                    @Override
                                    public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                                        progressBar.setVisibility(View.GONE);
                                        getotpbuttone.setVisibility(View.VISIBLE);
                                    }

                                    @Override
                                    public void onVerificationFailed(@NonNull FirebaseException e) {
                                        progressBar.setVisibility(View.GONE);
                                        getotpbuttone.setVisibility(View.VISIBLE);
                                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void onCodeSent(@NonNull String backendotp, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                                        progressBar.setVisibility(View.GONE);
                                        getotpbuttone.setVisibility(View.VISIBLE);
                                        Intent intent = new Intent(getApplicationContext(), OtpVarification.class);
                                        intent.putExtra("mobile", enternumber.getText().toString());
                                        intent.putExtra("backendotp",backendotp);
                                        startActivity(intent);
                                    }
                                }
                        );

//                        Intent intent=new Intent(getApplicationContext(), OtpVarification.class );
//                        intent.putExtra("mobile",enternumber.getText().toString());
//                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Please enter corect number", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Please enter number", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
