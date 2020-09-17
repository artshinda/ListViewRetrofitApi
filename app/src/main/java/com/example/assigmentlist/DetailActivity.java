package com.example.assigmentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView textName, textEmail, textNumber;

    private void initializeWidgets(){
        textName   = findViewById(R.id.textName);
        textEmail  = findViewById(R.id.textEmail);
        textNumber = findViewById(R.id.textNumber);
    }

    private void receiveAndShowData(){
        Intent i = this.getIntent();
        String name  = i.getExtras().getString("NAME");
        String email = i.getExtras().getString("EMAIL");
        String phone = i.getExtras().getString("PHONE");

        textName.setText(name);
        textEmail.setText(email);
        textNumber.setText(phone);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initializeWidgets();
        receiveAndShowData();
    }
}