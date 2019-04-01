package com.example.day4;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Privateactivity extends AppCompatActivity
{
private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privateactivity);
        sharedPreferences = getPreferences(MODE_PRIVATE);

        SharedPreferences.Editor mEditor = sharedPreferences.edit();
        mEditor.putString("test", "Lambton College in Toronto");
        mEditor.apply();



    }
}
