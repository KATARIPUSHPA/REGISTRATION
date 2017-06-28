package com.example.mlrit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText et1,et2,et3,et4;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.et11);
        et2=(EditText) findViewById(R.id.et12);
        et3=(EditText) findViewById(R.id.et13);
        et4=(EditText) findViewById(R.id.et4);
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String s1 = et1.getText().toString();
                String s2 = et2.getText().toString();
                String s3 = et3.getText().toString();
                String s4 = et4.getText().toString();
                if (s1.isEmpty()) {
                    et1.setError("empty");
                } else if (s2.isEmpty()) {
                    et2.setError("empty");
                } else if (s3.isEmpty()) {
                    et3.setError("empty");
                } else if (s4.isEmpty()) {
                    et4.setError("empty");

                }
else if(s3.equals(s4))

                    Toast.makeText(MainActivity.this, "REGISTERED", Toast.LENGTH_LONG).show();
                else
                    et4.setError("PASSWORD MISMATCH");
            }


                    });


    }


}
