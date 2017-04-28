package com.example.pulkit.testapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Important extends AppCompatActivity {

    Button donor,rev,inv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important);

        donor = (Button) findViewById(R.id.donor);
        rev = (Button) findViewById(R.id.rev);
        inv = (Button) findViewById(R.id.inv);

        donor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(Important.this,Donor.class);
                startActivity(d);
            }
        });

        rev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(Important.this,Receiver.class);
                startActivity(r);
            }
        });
    }
}
