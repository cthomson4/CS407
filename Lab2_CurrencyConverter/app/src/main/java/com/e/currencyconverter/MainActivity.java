package com.e.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickConvertCurrencyUSDtoPounds(View view) {
        EditText currencyTextField = (EditText) findViewById(R.id.myTextField);
        String str = currencyTextField.getText().toString();
        goToActivity2(str);

    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("currencyStr",s);
        startActivity(intent);
    }
}
