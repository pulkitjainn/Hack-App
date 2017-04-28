package com.example.pulkit.testapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class User_Info extends AppCompatActivity {

    EditText name,aadhar,contact,age,bgrp;
    Button next,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__info);

        name = (EditText) findViewById(R.id.name);
        contact = (EditText) findViewById(R.id.contact);
        age = (EditText) findViewById(R.id.age);
        aadhar = (EditText) findViewById(R.id.aadhar);
        bgrp = (EditText) findViewById(R.id.bgrp);

        next = (Button) findViewById(R.id.next);
        back = (Button) findViewById(R.id.back);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(User_Info.this,Important.class);
                startActivity(i);
            }
        });
    }
}
