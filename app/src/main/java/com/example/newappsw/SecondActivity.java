package com.example.newappsw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        UserModel user = (UserModel) getIntent().getExtras().getSerializable("user");

        Log.d("dddddd", "onCreate: " + user);

    }
}