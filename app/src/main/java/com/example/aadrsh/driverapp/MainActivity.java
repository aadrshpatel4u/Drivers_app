package com.example.aadrsh.driverapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText password;
    private EditText bus_route_no;
    private EditText phone_no;
    private EditText email;
    private EditText bus_registration_no;
    private Button   save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_profile1);

        name     = (EditText)findViewById(R.id.etname);
        password = (EditText)findViewById(R.id.etpassword);
        bus_route_no = (EditText)findViewById(R.id.etbusrouteno);
        phone_no = (EditText)findViewById(R.id.etphoneno);
        email    = (EditText)findViewById(R.id.etemail);
        bus_registration_no = (EditText)findViewById(R.id.etbusregistrationno);
        save = (Button)findViewById(R.id.btnsave);

    }
}
