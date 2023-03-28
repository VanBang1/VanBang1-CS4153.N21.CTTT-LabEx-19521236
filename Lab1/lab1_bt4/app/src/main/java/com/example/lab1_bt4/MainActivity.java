package com.example.lab1_bt4;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNumber.setOnKeyListener(new View.OnKeyListener(){
            public boolean onKey(View v, int keyCode, KeyEvent event){
                if(event.getAction()== KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_DPAD_CENTER)
                {

                    Context context = getApplicationContext();
                    int dura = Toast.LENGTH_LONG;
                    try {
                        String contact_number=phoneNumber.getText().toString();
                        Toast.makeText(context,contact_number,dura).show();
                        Log.e("chuong trinh out",contact_number);
                    } catch (Exception e) {
                        // no activity to handle intent. show error dialog/toast whatever
                    }
                    return true;
                }
                    return false;
            }

        });
    }

        final Button callButton = (Button) findViewById(R.id.callButton);

        final EditText phoneNumber = (EditText) findViewById(R.id.phoneNumber);

}