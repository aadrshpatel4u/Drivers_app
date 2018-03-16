package com.example.aadrsh.driverapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {

    private EditText phone_no;
    private EditText OTP;
    private Button save4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_profile4);

        phone_no = (EditText)findViewById(R.id.etphoneno);
        OTP = (EditText)findViewById(R.id.etotp);
        save4 = (Button)findViewById(R.id.btnsave4);

    }
}
