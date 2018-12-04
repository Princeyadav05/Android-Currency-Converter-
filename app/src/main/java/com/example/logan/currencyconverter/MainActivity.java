package com.example.logan.currencyconverter;

import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        Log.i("Info","Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editText2);

        String amountInDollars = editText.getText().toString();

        double dollars = Double.parseDouble(amountInDollars);

        double INR = dollars * 70;

        String amountInInr = String.format("%.2f", INR);

        Toast.makeText(this, amountInDollars + " Dollars is " + amountInInr + " RS.", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
