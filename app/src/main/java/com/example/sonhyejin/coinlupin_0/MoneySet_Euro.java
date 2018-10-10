package com.example.sonhyejin.coinlupin_0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.shawnlin.numberpicker.NumberPicker;

import java.util.ArrayList;
import java.util.Locale;


public class MoneySet_Euro extends AppCompatActivity {

    private static String TAG = "NumberPicker";
    //ArrayList<Storage> data;
    //Storage store;
    int E1,E2,E5,E10,E20,E50,E100,E200,E500,E1000,E2000,E5000,E10000,E20000,E50000;

    public void Update_CoinCount(int E1, int E2, int E5, int E10, int E20,
                                 int E50, int E100, int E200, int E500, int E1000,
                                 int E2000, int E5000, int E10000, int E20000, int E50000){
        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = shared.edit();

        editor.putInt("cent1",E1);
        editor.putInt("cent2",E2);
        editor.putInt("cent5",E5);
        editor.putInt("cent10",E10);
        editor.putInt("cent20",E20);
        editor.putInt("cent50",E50);
        editor.putInt("cent100",E100);
        editor.putInt("cent200",E200);
        editor.putInt("cent500",E500);
        editor.putInt("cent1000",E1000);
        editor.putInt("cent2000",E2000);
        editor.putInt("cent5000",E5000);
        editor.putInt("cent10000",E10000);
        editor.putInt("cent20000",E20000);
        editor.putInt("cent50000",E50000);
        editor.commit();

        //Toast.makeText(MoneySet_Euro.this, "score : " + shared.getInt("cent1",-1), Toast.LENGTH_LONG).show();
        //Toast.makeText(MoneySet_Euro.this, "score : " + E1, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_set_euro);

        Button submit = findViewById(R.id.SubmitBudget_euro);

        NumberPicker e1 = (NumberPicker)findViewById(R.id.cent_1);
        /*E1 = e1.getValue();
        e1.setValue(0);
        E1 = 4;
        E1 = e1.getMaxValue(); */
        NumberPicker e2 = (NumberPicker)findViewById(R.id.cent_2);
        NumberPicker e5 = (NumberPicker)findViewById(R.id.cent_5);
        NumberPicker e10 = (NumberPicker)findViewById(R.id.cent_10);
        NumberPicker e20 = (NumberPicker)findViewById(R.id.cent_20);
        NumberPicker e50 = (NumberPicker)findViewById(R.id.cent_50);
        NumberPicker e100 = (NumberPicker)findViewById(R.id.euro_1);
        NumberPicker e200 = (NumberPicker)findViewById(R.id.euro_2);
        NumberPicker e500 = (NumberPicker)findViewById(R.id.euro_5);
        NumberPicker e1000 = (NumberPicker)findViewById(R.id.euro_10);
        NumberPicker e2000 = (NumberPicker)findViewById(R.id.euro_20);
        NumberPicker e5000 = (NumberPicker)findViewById(R.id.euro_50);
        NumberPicker e10000 = (NumberPicker)findViewById(R.id.euro_100);
        NumberPicker e20000 = (NumberPicker)findViewById(R.id.euro_200);
        NumberPicker e50000 = (NumberPicker)findViewById(R.id.euro_500);

       submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                store = new Storage(E1,E2,E5,E10,E20,
                        E50,E100,E200,E500,E1000,
                        E2000,E5000,E10000,E20000,E50000,
                        0,0,0,0,0,
                        0,0,0,0,0);
                data.add(store);
                */

                E1 = e1.getValue();
                E2 = e2.getValue();
                E5 = e5.getValue();
                E10 = e10.getValue();
                E20 = e20.getValue();
                E50 = e50.getValue();
                E100 = e100.getValue();
                E200 = e200.getValue();
                E500 = e500.getValue();
                E1000 = e1000.getValue();
                E2000 = e2000.getValue();
                E5000 = e5000.getValue();
                E10000 = e10000.getValue();
                E20000 = e20000.getValue();
                E50000 = e50000.getValue();

                Update_CoinCount(E1,E2,E5,E10,E20,
                        E50,E100,E200,E500,E1000,
                        E2000,E5000,E10000,E20000,E50000);

                Intent intent = new Intent(MoneySet_Euro.this, ShowMeTheMoney_Euro.class);
                startActivity(intent);
            }
        });
    }
}