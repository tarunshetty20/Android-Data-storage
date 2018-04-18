package com.example.tarun.assignment5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Insertheitem extends AppCompatActivity {

    Button madd;
    Button mcancel;
    EditText iname;
    EditText idescrip;
    EditText iprice;
    EditText ireview;

    public static int id = 1;
    public Newdatabase db =new Newdatabase(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inserttheitem);

        madd = (Button) findViewById(R.id.buttonaddditem2);
        mcancel = (Button) findViewById(R.id.buttoncancelitem);
        iname = (EditText) findViewById(R.id.textiname);
        idescrip = (EditText) findViewById(R.id.textidescription);
        iprice = (EditText) findViewById(R.id.textiprice);
        ireview = (EditText) findViewById(R.id.textireview);

        madd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Item additem = new Item (id, iname.getText().toString(), idescrip.getText().toString(), iprice.getText().toString(), ireview.getText().toString());
                id++;
                db.addItem(additem);

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        mcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}