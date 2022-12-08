package com.malvin.p3_latcekbox_muhammad_malfin_tip_21_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMenu extends AppCompatActivity {
    Button btNkn, btCafe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btNkn = (Button) findViewById(R.id.btNkn);
        btCafe = (Button)  findViewById(R.id.btCafe);

        btNkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukaNkn = new Intent(getApplicationContext(), ActivityNkn.class);
                startActivity(bukaNkn);
            }
        });

        btCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukaCafe = new Intent(getApplicationContext(), ActivityCafe.class);
                startActivity(bukaCafe);
            }
        });
    }
}