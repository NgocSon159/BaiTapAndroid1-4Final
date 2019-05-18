package com.example.myapplication;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.app.Dialog;
import java.util.ArrayList;
import android.net.Uri;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;
    ListView l;
    Dialog dialog;
    ArrayList<String> arrayList;
    String[] arrayLink = {"http://www.hcmut.edu.vn/vi","https://www.hcmus.edu.vn/","http://hcmute.edu.vn/","https://sgu.edu.vn/","https://www.tdtu.edu.vn/"};
    double[][] arrayAddress = {{10.773328, 106.659437},{10.762894, 106.682194},{10.851027, 106.772011},{10.759881, 106.682266},{10.732634, 106.699777}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l =  findViewById(R.id.listView);
        arrayList = new ArrayList<>();
        arrayList.add("Trường Đại Học Bách Khoa");
        arrayList.add("Trường Đại Học Khoa Học Tự Nhiên");
        arrayList.add("Trường Đại Học Sư Phạm Kỹ Thuật");
        arrayList.add("Trường Đại Học Sài Gòn");
        arrayList.add("Trường Đại Học Tôn Đức Thắng");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        l.setAdapter(arrayAdapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openDialog(position);
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
    public void openDialog(final int position) {
            dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Customer's Choices");
            dialog.setContentView(R.layout.layout_dialog);
            dialog.show();
            Button buttonClick1 = dialog.findViewById(R.id.button1);
            Button buttonClick2= dialog.findViewById(R.id.button2);
            buttonClick1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String label = arrayList.get(position);
                    Intent myWebLink = new Intent(getApplicationContext(),LayoutMapActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putDouble("lat",arrayAddress[position][0]);
                    bundle.putDouble("longatt",arrayAddress[position][1]);
                    bundle.putString("title", label);
                    myWebLink.putExtras(bundle);
                    startActivity(myWebLink);
                    dialog.dismiss();
                }
            });
            buttonClick2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                    myWebLink.setData(Uri.parse(arrayLink[position]));
                    startActivity(myWebLink);
                    dialog.dismiss();
                }
            });
        }

}
