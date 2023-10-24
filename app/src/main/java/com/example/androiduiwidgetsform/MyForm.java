package com.example.androiduiwidgetsform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MyForm extends AppCompatActivity {

    EditText et_name,et_password,et_phone;
    RadioButton rb_male,rb_female;
    CheckBox cb_android,cb_java,cb_python;
    Spinner sp_cities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_form);

        et_name=findViewById(R.id.et_name);
        et_password=findViewById(R.id.et_password);
        et_phone=findViewById(R.id.et_phone);

        rb_male=findViewById(R.id.rb_male);
        rb_female=findViewById(R.id.rb_female);

        cb_android=findViewById(R.id.cb_android);
        cb_java=findViewById(R.id.cb_java);
        cb_python=findViewById(R.id.cb_python);

        sp_cities=findViewById(R.id.sp_cities);
    }

    public void getAllValues(View view)
    {
        //get values from EditText

        String name=et_name.getText().toString();
        String password=et_password.getText().toString();
        String phoneno=et_phone.getText().toString();

        //get values from RadioButton

        String gender="";
        if(rb_male.isChecked())
        {
            gender=rb_male.getText().toString();
        }

        if(rb_female.isChecked())
        {
            gender=rb_female.getText().toString();
        }

        //get values from CHeckBox

        String interest="";

        if(cb_android.isChecked())
        {
            interest +=cb_android.getText().toString()+"\n";
        }

        if(cb_java.isChecked())
        {
            interest +=cb_java.getText().toString()+"\n";
        }

        if(cb_python.isChecked())
        {
            interest +=cb_python.getText().toString();
        }

        //get values from Spinner
        String city=sp_cities.getSelectedItem().toString();


        // Printing all data using toast

        String result=name+"\n"+phoneno+"\n"+password+"\n"+gender+"\n"+interest+"\n"+city;

        Toast.makeText(this,result, Toast.LENGTH_LONG).show();
    }
}