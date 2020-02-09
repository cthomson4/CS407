package com.e.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main2Activity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("currencyStr");
        Double britishAmt = Double.parseDouble(str) * 0.77;
        BigDecimal bd = new BigDecimal(britishAmt).setScale(1, RoundingMode.HALF_UP);
        textView2.setText("£ " + bd.doubleValue());
    }
}
