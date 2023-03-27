package com.example.lab1_bt3;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     final Button mButton = (Button) findViewById(R.id.xemtime);
     final AlertDialog ad=new AlertDialog.Builder(this).create();
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Date t = new Date();
                String message="Time is: "+t.toLocaleString();
                ad.setMessage(message);
                ad.show();
            }
        });
    }
}

