package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    static int telescopePrice = 14_000;
    static int accountMoney = 1000;
    static int scholarship = 2500;
    static double moneyBankPercent = 0.05;

    static int count = 0;

//  подсчет кол-во месяцев
    public int countPriceWithPercent() {
        while (accountMoney <= telescopePrice) {
            accountMoney = (int) (accountMoney + scholarship + (accountMoney * 0.05 /12));
            count++;
        }
        return count;
    }

    private TextView countOut; // поле вывода потраценных месяцев на накопление


//    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countOut = findViewById(R.id.countOut);

        countOut.setText("Месяев будет потраченно на сбережение " + countPriceWithPercent());
    }
}