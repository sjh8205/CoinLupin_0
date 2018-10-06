package com.example.sonhyejin.coinlupin_0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home_ChooseCountry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__choose_country);

        Button gotoEurope = (Button)findViewById(R.id.Home_euro);
        Button gotoJapan = (Button)findViewById(R.id.Home_yen);

        gotoEurope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_ChooseCountry.this, MoneySet_Euro.class);
                startActivity(intent);

                SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = shared.edit();

                editor.putInt("cent1",0);
                editor.putInt("cent2",0);
                editor.putInt("cent5",0);
                editor.putInt("cent10",0);
                editor.putInt("cent20",0);
                editor.putInt("cent50",0);
                editor.putInt("cent100",0);
                editor.putInt("cent200",0);
                editor.putInt("cent500",0);
                editor.putInt("cent1000",0);
                editor.putInt("cent2000",0);
                editor.putInt("cent5000",0);
                editor.putInt("cent10000",0);
                editor.putInt("cent20000",0);
                editor.putInt("cent50000",0);
                editor.apply();
            }
        });

        gotoJapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_ChooseCountry.this, MoneySet_Yen.class);
                startActivity(intent);

                SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = shared.edit();

                editor.putInt("yen1", 0);
                editor.putInt("yen5", 0);
                editor.putInt("yen10", 0);
                editor.putInt("yen50", 0);
                editor.putInt("yen100", 0);
                editor.putInt("yen500", 0);
                editor.putInt("yen1000", 0);
                editor.putInt("yen5000", 0);
                editor.putInt("yen10000", 0);
                editor.putInt("yen20000", 0);
                editor.apply();
            }
        });
    }
}
