package com.example.tpexercice3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SecondActivity extends AppCompatActivity {
    private TextView rep1;
    private TextView rep2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        rep1 = findViewById(R.id.rep1);
        rep2 = findViewById(R.id.rep2);


        String choix1Value = getIntent().getStringExtra("choix1");
        String choix2Value = getIntent().getStringExtra("choix2");
        String choix3Value = getIntent().getStringExtra("choix3");
        String choix4Value = getIntent().getStringExtra("choix4");

        StringBuilder result1 = new StringBuilder();
        if (choix1Value != null) result1.append(choix1Value).append("\n");
        if (choix2Value != null) result1.append(choix2Value).append("\n");
        if (choix3Value != null) result1.append(choix3Value).append("\n");
        if (choix4Value != null) result1.append(choix4Value).append("\n");


        rep1.setText(result1.toString());


        rep2.setText(this.getIntent().getStringExtra("chaine"));
    }
}