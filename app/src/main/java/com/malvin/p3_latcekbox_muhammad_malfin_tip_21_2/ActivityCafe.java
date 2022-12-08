package com.malvin.p3_latcekbox_muhammad_malfin_tip_21_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class ActivityCafe extends AppCompatActivity {
    TextView edHrgNao, edHrgNac, edHrgKenGo, edHrgSfDrink, edHrgAiMi;
    CheckBox cbNao, cbNac, cbKenGo, cbSfDrink, cbAiMi;

    private boolean checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);

        edHrgNao = (TextView) findViewById(R.id.edHrgNao);
        edHrgNac = (TextView) findViewById(R.id.edHrgNac);
        edHrgKenGo = (TextView) findViewById(R.id.edHrgKenGo);
        edHrgSfDrink = (TextView) findViewById(R.id.edHrgSfDrink);
        edHrgAiMi = (TextView) findViewById(R.id.edHrgAiMi);

        cbNao = (CheckBox) findViewById(R.id.cbNao);
        cbNac = (CheckBox) findViewById(R.id.cbNac);
        cbKenGo = (CheckBox) findViewById(R.id.cbKenGo);
        cbSfDrink = (CheckBox) findViewById(R.id.cbSfDrink);
        cbAiMi = (CheckBox) findViewById(R.id.cbAiMi);

    }

    public void KlikCekBox(View view) {
        checked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.cbNao:
                if (checked)
                    edHrgNao.setText("15.000");
                else
                    edHrgNao.setText("0");
                break;
            case R.id.cbNac:
                if (checked)
                    edHrgNac.setText("12.000");
                else
                    edHrgNac.setText("0");
                break;
            case R.id.cbKenGo:
                if (checked)
                    edHrgKenGo.setText("10.000");
                else
                    edHrgKenGo.setText("0");
                break;
            case R.id.cbSfDrink:
                if (checked)
                    edHrgSfDrink.setText("5.000");
                else
                    edHrgSfDrink.setText("0");
                break;
            case R.id.cbAiMi:
                if (checked)
                    edHrgAiMi.setText("3.000");
                else
                    edHrgAiMi.setText("0");
                break;
        }
    }











}