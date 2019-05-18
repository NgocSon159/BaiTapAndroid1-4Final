package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*TableRow row=findViewById(R.id.tablerow1);
        row.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView txt=findViewById(R.id.textView1);
                txt.setText("aksdghakjsdh");
            }
        });*/


        sukienclick1();
        sukienclick2();
        sukienclick3();
        sukienclick4();
        sukienclick5();
        sukienclick6();
        sukienclick7();
        sukienclick8();
        sukienclick9();









    }

    public void sukienclick1()
    {
        TableRow rowclicked = findViewById(R.id.tablerow1);
        LinearLayout get=(LinearLayout)rowclicked.getChildAt(0);
        TextView textmonan=(TextView) get.getChildAt(1);
        final String asd=textmonan.getText().toString();
        Log.d("count",asd);
        rowclicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textgui="abcccc";
                Intent myintent=new Intent(MainActivity.this,Main2Activity.class);
                myintent.putExtra("monan",asd);
                startActivity(myintent);
            }
        });
    }
    public void sukienclick2()
    {
        TableRow rowclicked = findViewById(R.id.tablerow2);
        LinearLayout get=(LinearLayout)rowclicked.getChildAt(0);
        TextView textmonan=(TextView) get.getChildAt(1);
        final String asd=textmonan.getText().toString();
        Log.d("count",asd);
        rowclicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textgui="abcccc";
                Intent myintent=new Intent(MainActivity.this,Main2Activity.class);
                myintent.putExtra("monan",asd);
                startActivity(myintent);
            }
        });
    }
    public void sukienclick3()
    {
        TableRow rowclicked = findViewById(R.id.tablerow3);
        LinearLayout get=(LinearLayout)rowclicked.getChildAt(0);
        TextView textmonan=(TextView) get.getChildAt(1);
        final String asd=textmonan.getText().toString();
        Log.d("count",asd);
        rowclicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textgui="abcccc";
                Intent myintent=new Intent(MainActivity.this,Main2Activity.class);
                myintent.putExtra("monan",asd);
                startActivity(myintent);
            }
        });
    }
    public void sukienclick4()
    {
        TableRow rowclicked = findViewById(R.id.tablerow4);
        LinearLayout get=(LinearLayout)rowclicked.getChildAt(0);
        TextView textmonan=(TextView) get.getChildAt(1);
        final String asd=textmonan.getText().toString();
        Log.d("count",asd);
        rowclicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textgui="abcccc";
                Intent myintent=new Intent(MainActivity.this,Main2Activity.class);
                myintent.putExtra("monan",asd);
                startActivity(myintent);
            }
        });
    }
    public void sukienclick5()
    {
        TableRow rowclicked = findViewById(R.id.tablerow5);
        LinearLayout get=(LinearLayout)rowclicked.getChildAt(0);
        TextView textmonan=(TextView) get.getChildAt(1);
        final String asd=textmonan.getText().toString();
        Log.d("count",asd);
        rowclicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textgui="abcccc";
                Intent myintent=new Intent(MainActivity.this,Main2Activity.class);
                myintent.putExtra("monan",asd);
                startActivity(myintent);
            }
        });
    }
    public void sukienclick6()
    {
        TableRow rowclicked = findViewById(R.id.tablerow6);
        LinearLayout get=(LinearLayout)rowclicked.getChildAt(0);
        TextView textmonan=(TextView) get.getChildAt(1);
        final String asd=textmonan.getText().toString();
        Log.d("count",asd);
        rowclicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textgui="abcccc";
                Intent myintent=new Intent(MainActivity.this,Main2Activity.class);
                myintent.putExtra("monan",asd);
                startActivity(myintent);
            }
        });
    }
    public void sukienclick7()
    {
        TableRow rowclicked = findViewById(R.id.tablerow7);
        LinearLayout get=(LinearLayout)rowclicked.getChildAt(0);
        TextView textmonan=(TextView) get.getChildAt(1);
        final String asd=textmonan.getText().toString();
        Log.d("count",asd);
        rowclicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textgui="abcccc";
                Intent myintent=new Intent(MainActivity.this,Main2Activity.class);
                myintent.putExtra("monan",asd);
                startActivity(myintent);
            }
        });
    }
    public void sukienclick8()
    {
        TableRow rowclicked = findViewById(R.id.tablerow8);
        LinearLayout get=(LinearLayout)rowclicked.getChildAt(0);
        TextView textmonan=(TextView) get.getChildAt(1);
        final String asd=textmonan.getText().toString();
        Log.d("count",asd);
        rowclicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textgui="abcccc";
                Intent myintent=new Intent(MainActivity.this,Main2Activity.class);
                myintent.putExtra("monan",asd);
                startActivity(myintent);
            }
        });
    }
    public void sukienclick9()
    {
        TableRow rowclicked = findViewById(R.id.tablerow9);
        LinearLayout get=(LinearLayout)rowclicked.getChildAt(0);
        TextView textmonan=(TextView) get.getChildAt(1);
        final String asd=textmonan.getText().toString();
        Log.d("count",asd);
        rowclicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textgui="abcccc";
                Intent myintent=new Intent(MainActivity.this,Main2Activity.class);
                myintent.putExtra("monan",asd);
                startActivity(myintent);
            }
        });
    }

}
