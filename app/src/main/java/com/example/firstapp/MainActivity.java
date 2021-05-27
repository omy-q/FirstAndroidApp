package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.linearlayout);
        ToggleButton toggleButton = findViewById(R.id.black_theme);
        Button button = findViewById(R.id.btn);
        CheckBox checkBox1 = findViewById(R.id.yellow);
        CheckBox checkBox2 = findViewById(R.id.red);
        CheckBox checkBox3 = findViewById(R.id.blue);
        TextView result = findViewById(R.id.result);

        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                linearLayout.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.black_theme, null));
            } else {
                linearLayout.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.white_theme, null));
            }
        });


    }
}