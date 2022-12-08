package com.malvin.p3_latcekbox_muhammad_malfin_tip_21_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityNkn extends AppCompatActivity {
    Button btnKemNkn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nkn);

        btnKemNkn = (Button) findViewById(R.id.btnKemNkn);

        btnKemNkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent KemKeMenu = new Intent(getApplicationContext(), ActivityMenu.class);
                startActivity(KemKeMenu);
            }
        });
    }
}