package com.example.tpexercice3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class FirstActivity extends AppCompatActivity {
    private CheckBox choix1;
    private CheckBox choix2;
    private CheckBox choix3;
    private CheckBox choix4;
    private RadioButton rd1;
    private RadioButton rd2;
    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_first);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        choix1 = findViewById(R.id.choix1);
        choix2 = findViewById(R.id.choix2);
        choix3 = findViewById(R.id.choix3);
        choix4 = findViewById(R.id.choix4);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        rd1 = findViewById(R.id.rd1);
        rd2 = findViewById(R.id.rd2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

                if (!choix1.isChecked() && !choix2.isChecked() && !choix3.isChecked() && !choix4.isChecked() ) {
                    Toast.makeText(FirstActivity.this, "Faites un choix", Toast.LENGTH_LONG).show();
                    return;
                }
                if ( !rd1.isChecked() && !rd2.isChecked()) {
                    Toast.makeText(FirstActivity.this, "Faites un choix", Toast.LENGTH_LONG).show();
                    return;
                }

                if (choix1.isChecked()) {
                    intent.putExtra("choix1", choix1.getText().toString());
                }
                if (choix2.isChecked()) {
                    intent.putExtra("choix2", choix2.getText().toString());
                }
                if (choix3.isChecked()) {
                    intent.putExtra("choix3", choix3.getText().toString());
                }
                if (choix4.isChecked()) {
                    intent.putExtra("choix4", choix4.getText().toString());
                }

                String chaine;
                if (rd1.isChecked()) {
                    chaine = "oui";
                } else if (rd2.isChecked()) {
                    chaine = "non";
                } else {
                    chaine = null;
                }

                if (chaine != null) {
                    intent.putExtra("chaine", chaine);
                }


                startActivity(intent);
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
}