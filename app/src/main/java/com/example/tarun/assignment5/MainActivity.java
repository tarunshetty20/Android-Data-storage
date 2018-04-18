package com.example.tarun.assignment5;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button toinsert;
    Button isearch;
    Button closeapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Define buttons
        toinsert = (Button)findViewById(R.id.buttoninsert1);
        isearch = (Button)findViewById(R.id.buttonsearch1);
        closeapp=(Button)findViewById(R.id.buttoncloseapp);
        //go to another activity
        toinsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Insertheitem.class);
                startActivity(a);
            }
        });

        //goto another activity
        isearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getApplicationContext(), Searchtheitem.class);
                startActivity(b);
            }
        });
        closeapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Close App");
                alert.setCancelable(true);
                alert.setMessage("Application will be closed");
                alert.setPositiveButton("Close App", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                alert.show();
            }
        });
    }
}

