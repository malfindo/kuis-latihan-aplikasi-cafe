package com.malvin.p3_latcekbox_muhammad_malfin_tip_21_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ActivityCafe extends AppCompatActivity {
    TextView edHrgNao, edHrgNac, edHrgKenGo, edHrgSfDrink, edHrgAiMi, textTotal, textStatus, edTotal, textTotalBayar, edTotalBayar;
    CheckBox cbNao, cbNac, cbKenGo, cbSfDrink, cbAiMi;
    RadioGroup rgDiskon;
    RadioButton rbTdnol, rbCrdSep;
    Button btnPesan, btnKemCf;

    private boolean checked;
    private int hrgnao = 0;
    private int hrgnac = 0;
    private int hrgkengo = 0;
    private int hrgsfdrink = 0;
    private int hrgaimi = 0;
    private  int totalnd = 0;
    private double bsd = 0;
    private double totald = 0;

    private String hcb="";
    private String hrb="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);

        edHrgNao = (TextView) findViewById(R.id.edHrgNao);
        edHrgNac = (TextView) findViewById(R.id.edHrgNac);
        edHrgKenGo = (TextView) findViewById(R.id.edHrgKenGo);
        edHrgSfDrink = (TextView) findViewById(R.id.edHrgSfDrink);
        edHrgAiMi = (TextView) findViewById(R.id.edHrgAiMi);
        textTotal = (TextView) findViewById(R.id.textTotal);
        textStatus = (TextView) findViewById(R.id.textStatus);
        edTotal = (TextView) findViewById(R.id.edTotal);
        textTotalBayar = (TextView) findViewById(R.id.textTotalBayar);
        edTotalBayar = (TextView) findViewById(R.id.edTotalBayar);

        cbNao = (CheckBox) findViewById(R.id.cbNao);
        cbNac = (CheckBox) findViewById(R.id.cbNac);
        cbKenGo = (CheckBox) findViewById(R.id.cbKenGo);
        cbSfDrink = (CheckBox) findViewById(R.id.cbSfDrink);
        cbAiMi = (CheckBox) findViewById(R.id.cbAiMi);

        rgDiskon = (RadioGroup) findViewById(R.id.rgDiskon);
        rbTdnol = (RadioButton) findViewById(R.id.rbTdnol);
        rbCrdSep = (RadioButton) findViewById(R.id.rbCrdSep);

        btnPesan = (Button) findViewById(R.id.btnPesan);
        btnKemCf = (Button) findViewById(R.id.btnKemCf);


        cbNao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) { KlikCekBox(arg0); }
        });
        cbNac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) { KlikCekBox(arg0); }
        });
        cbKenGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) { KlikCekBox(arg0); }
        });
        cbSfDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) { KlikCekBox(arg0); }
        });
        cbAiMi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) { KlikCekBox(arg0); }
        });

        btnKemCf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent KemKeMenu = new Intent(getApplicationContext(), ActivityMenu.class);
                startActivity(KemKeMenu);
            }
        });




    }

    //ngide radio button

    public void KlikCekBox(View view) {
        checked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.cbNao:
                if (checked) {
                    hrgnao = 15000;
                    hcb = String.valueOf(hrgnao);
                    edHrgNao.setText(hcb);
                } else {
                    hrgnao = 0;
                    hcb = String.valueOf(hrgnao);
                    edHrgNao.setText(hcb);
                }
                break;
            case R.id.cbNac:
                if (checked) {
                    hrgnac = 12000;
                    hcb = String.valueOf(hrgnac);
                    edHrgNac.setText(hcb);
                } else {
                    hrgnac = 0;
                    hcb = String.valueOf(hrgnac);
                    edHrgNac.setText(hcb);
                }
                break;
            case R.id.cbKenGo:
                if (checked) {
                    hrgkengo = 10000;
                    hcb = String.valueOf(hrgkengo);
                    edHrgKenGo.setText(hcb);
                } else {
                    hrgkengo = 0;
                    hcb = String.valueOf(hrgkengo);
                    edHrgKenGo.setText(hcb);
                }
                break;
            case R.id.cbSfDrink:
                if (checked) {
                    hrgsfdrink = 5000;
                    hcb = String.valueOf(hrgsfdrink);
                    edHrgSfDrink.setText(hcb);
                } else {
                    hrgsfdrink = 0;
                    hcb = String.valueOf(hrgsfdrink);
                    edHrgSfDrink.setText(hcb);
                }
                break;
            case R.id.cbAiMi:
                if (checked) {
                    hrgaimi = 3000;
                    hcb = String.valueOf(hrgaimi);
                    edHrgAiMi.setText(hcb);
                } else {
                    hrgaimi = 0;
                    hcb = String.valueOf(hrgaimi);
                    edHrgAiMi.setText(hcb);
                }
                break;
        }
    }

    public void KlikRb(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.rbTdnol:
                if (checked) {
                    totalnd = hrgnao + hrgnac + hrgkengo + hrgsfdrink + hrgaimi;
                    hrb = String.valueOf(totalnd);
                    edTotal.setText(hrb);
                    textStatus.setText("Status : Pembayaran Tunai");
                }
                break;
            case R.id.rbCrdSep:
                if (checked) {
                    totalnd = hrgnao + hrgnac + hrgkengo + hrgsfdrink + hrgaimi;
                    bsd = totalnd * 0.1;
                    totald = totalnd - bsd;
                    hrb = String.valueOf(totalnd);
                    edTotal.setText(hrb);
                    textStatus.setText("Status : Pembayaran Credit Card");
                }
                break;
        }
    }

    public void KlikPesan(View view) {
        if (rbTdnol.isChecked()) {
            totalnd = hrgnao + hrgnac + hrgkengo + hrgsfdrink + hrgaimi;
            hrb = String.valueOf(totalnd);
            edTotalBayar.setText(hrb);
        } else {
            totalnd = hrgnao + hrgnac + hrgkengo + hrgsfdrink + hrgaimi;
            bsd = totalnd * 0.1;
            totald = totalnd - bsd;
            hrb = String.valueOf(totald);
            edTotalBayar.setText(hrb);
        }
    }













}