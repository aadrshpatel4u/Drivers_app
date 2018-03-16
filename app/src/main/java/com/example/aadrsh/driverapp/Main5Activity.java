package com.example.aadrsh.driverapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {


    private EditText email;
    private EditText EVP;
    private Button save5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_profile5);

        email = (EditText)findViewById(R.id.etemail);
        EVP   = (EditText)findViewById(R.id.etevp);
        save5 = (Button)findViewById(R.id.btnsave5);

    }
}
