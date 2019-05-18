package com.example.myapplication;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.sendMail.SendMail;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SendMailActivity extends AppCompatActivity {
    //Declaring EditText
    private EditText mailRecipient;

    //Send button
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_mail);

        //Initializing the views
        mailRecipient = (EditText) findViewById(R.id.mailRecipient);
        buttonSend = (Button) findViewById(R.id.btnSend);

        //Adding click listener
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });
    }

    private void sendEmail() {
        //Getting content for email
        String email = mailRecipient.getText().toString().trim();

        if(isValidEmail(email)){
            //Creating SendMail object
            SendMail sm = new SendMail(this, email, "Danh sách kiểm diện", "Danh sách sinh viên:");
            //Executing sendmail to send email
            sm.execute();
        } else {
            Toast.makeText(getApplicationContext(), "Your email address is invalid", Toast.LENGTH_SHORT).show();
        }




    }

    public final static boolean isValidEmail(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

}
