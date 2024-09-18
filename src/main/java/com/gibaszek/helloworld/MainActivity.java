package com.gibaszek.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        TextView counterText = findViewById(R.id.counter);
        btn1.setOnClickListener(v -> {
            btn1.setClickable(false);
            counter++;
            counterText.setText(String.valueOf(counter));
        });
        btn2.setOnClickListener(v -> {
            btn1.setClickable(true);
        });
    }
}