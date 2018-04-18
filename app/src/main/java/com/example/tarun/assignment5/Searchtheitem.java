package com.example.tarun.assignment5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Searchtheitem extends AppCompatActivity {

    Button msearch;
    Button mcancel;
    public Newdatabase db =new Newdatabase(this);
    EditText entertext;
    EditText textdisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchtheitem);
        msearch = (Button) findViewById(R.id.buttonsearchitem2);
        mcancel = (Button) findViewById(R.id.buttoncnacelitem1);
        textdisplay = (EditText) findViewById(R.id.textdisplayresult);
        entertext = (EditText) findViewById(R.id.textserach2);
        msearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Item getitem = db.getItem(entertext.getText().toString());
                String storedetails = " Item Name : "+getitem.getIname3()+"\n Item Description : "+getitem.getIdescrip3()+"\n Item Price : "+getitem.getIprice3()+"\n Item Review : "+getitem.getIreview3();
                textdisplay.setText(storedetails);
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
