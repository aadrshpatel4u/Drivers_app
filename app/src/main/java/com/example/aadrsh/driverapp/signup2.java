package com.example.aadrsh.driverapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class signup2 extends AppCompatActivity {

    private EditText name;
    private EditText account_no;
    private EditText IFSC_code;
    private EditText address_line1;
    private EditText address_line2;
    private EditText address_line3;
    private EditText contact_no;
    private EditText pin_code;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup2);

        name = (EditText)findViewById(R.id.editText2);
        account_no = (EditText)findViewById(R.id.editText12);
        IFSC_code = (EditText)findViewById(R.id.editText14);
        address_line1 = (EditText)findViewById(R.id.editText11);
        address_line2 = (EditText)findViewById(R.id.editText13);
        address_line3 = (EditText)findViewById(R.id.editText15);
        contact_no = (EditText)findViewById(R.id.editText16);
        pin_code = (EditText)findViewById(R.id.editText17);

        save = (Button)findViewById(R.id.button4);

    }
}
