package com.example.aadrsh.driverapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    private EditText password;
    private EditText confirm_password;
    private Button save3;
    // private EditText = password;
    //private EditText = confirm_password;
    //private Button = save3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_profile3);

        password = (EditText)findViewById(R.id.etpassword);
        confirm_password = (EditText)findViewById(R.id.etconfirmpassword);
        save3 = (Button)findViewById(R.id.btnsave3);

    }
}
