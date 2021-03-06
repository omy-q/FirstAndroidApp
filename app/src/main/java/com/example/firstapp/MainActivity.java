package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Switch;
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
        Switch switch_magic = findViewById(R.id.magic);
        Button reg = findViewById(R.id.reg);

        CompoundButton.OnCheckedChangeListener listener = (buttonView, isChecked) -> {
            if (switch_magic.isChecked()) {
                if (toggleButton.isChecked()) {
                    linearLayout.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.linearlayout_background_black, null));
                } else {
                    linearLayout.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.linearlayout_background_light, null));
                }
            } else {
                if (toggleButton.isChecked()) {
                    linearLayout.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.black_theme, null));
                } else {
                    linearLayout.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.white_theme, null));
                }
            }
        };

        switch_magic.setOnCheckedChangeListener(listener);
        toggleButton.setOnCheckedChangeListener(listener);

        button.setOnClickListener(v -> {
            if (checkBox1.isChecked() && checkBox2.isChecked() && !checkBox3.isChecked()) {
                result.setText(R.string.correct_result);
            } else {
                result.setText(R.string.incorrect_result);
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditTextActivity.class);
                startActivity(intent);

            }
        });


    }
}