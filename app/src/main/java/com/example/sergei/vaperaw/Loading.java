package com.example.sergei.vaperaw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        Toast.makeText(Loading.this, "Ошибка соединения",Toast.LENGTH_LONG).show();
    }
}
