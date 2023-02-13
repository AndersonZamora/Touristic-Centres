package com.touristiccentres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.touristiccentres.view.ScreenMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.login);
        button.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ScreenMainActivity.class)));
    }
}