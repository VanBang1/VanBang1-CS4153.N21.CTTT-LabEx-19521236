package com.example.lab2_bt5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSend = (Button)findViewById(R.id.sendMail);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent si = new Intent(Intent.ACTION_SEND);
                si.setType("message/rfc822");
                si.putExtra(Intent.EXTRA_EMAIL, new String[]{"19521236@gm.uit.edu.vn"});
                si.putExtra(Intent.EXTRA_SUBJECT, "Hello Bang");
                si.putExtra(Intent.EXTRA_TEXT, "Le Do Van Bang - 19521236 - Student UIT");
                startActivity(Intent.createChooser(si,"Choose Mail App"));
            }
        });
    }
}