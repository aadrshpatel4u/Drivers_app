package com.example.aadrsh.driverapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity {

    private EditText name;
    private EditText bus_route_no;
    private EditText bus_registration_no;
    private EditText password;
    private EditText confirm_password;
    private EditText phone_no;
    private EditText enter_OTP;
    private EditText email;
    private EditText enter_EVP;

    private Button send_OTP;
    private Button send_EVP;
    private Button sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup1);

        name = (EditText)findViewById(R.id.editText);
        bus_route_no = (EditText)findViewById(R.id.editText3);
        bus_registration_no = (EditText)findViewById(R.id.editText4);
        password = (EditText)findViewById(R.id.editText5);
        confirm_password = (EditText)findViewById(R.id.editText6);
        phone_no = (EditText)findViewById(R.id.editText7);
        enter_OTP = (EditText)findViewById(R.id.editText9);
        email = (EditText)findViewById(R.id.editText8);
        enter_EVP = (EditText)findViewById(R.id.editText10);

        send_OTP = (Button)findViewById(R.id.button);
        send_EVP = (Button)findViewById(R.id.button2);
        sign_up =  (Button)findViewById(R.id.button3);


    }
}
