package com.example.newappsw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this,SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("user",new UserModel(1,"name",new Post(2,"post")));
        intent.putExtras(bundle);
        startActivity(intent);

        // in test branch



    }
}