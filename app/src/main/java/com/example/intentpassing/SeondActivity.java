package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeondActivity extends AppCompatActivity {


    Button btnMoveBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seond);

        btnMoveBack = findViewById(R.id.btnMoveBack);

        btnMoveBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}