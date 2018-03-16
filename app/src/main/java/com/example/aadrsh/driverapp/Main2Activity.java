package com.example.aadrsh.driverapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText name2;
    private EditText bank_account_no;
    private EditText IFSC_code;
    private EditText phone_no;
    private EditText address;
    private EditText pin_code;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_profile2);

        name2 = (EditText)findViewById(R.id.etname2);
        bank_account_no = (EditText)findViewById(R.id.etaccountno);
        IFSC_code = (EditText)findViewById(R.id.etIFSCcode);
        phone_no = (EditText)findViewById(R.id.etphoneno);
        address = (EditText)findViewById(R.id.etaddress);
        pin_code = (EditText)findViewById(R.id.etpincode);
        save = (Button)findViewById(R.id.btnsave2);

    }
}
