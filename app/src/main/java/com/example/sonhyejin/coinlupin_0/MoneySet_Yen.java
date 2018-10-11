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

import com.shawnlin.numberpicker.NumberPicker;

import java.util.ArrayList;
import java.util.Locale;



public class MoneySet_Yen extends AppCompatActivity {

    private static String TAG = "NumberPicker";
    //ArrayList<Storage> data;
    //Storage store;
    int Y1,Y5,Y10,Y50,Y100,Y500,Y1000,Y2000,Y5000,Y10000;

    public void Update_CoinCount(int Y1,int Y5,int Y10, int Y50, int Y100,
                                 int Y500, int Y1000, int Y2000, int Y5000,int Y10000){
        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = shared.edit();

        editor.putInt("yen1", Y1);
        editor.putInt("yen5", Y5);
        editor.putInt("yen10", Y10);
        editor.putInt("yen50", Y50);
        editor.putInt("yen100", Y100);
        editor.putInt("yen500", Y500);
        editor.putInt("yen1000", Y1000);
        editor.putInt("yen2000", Y2000);
        editor.putInt("yen5000", Y5000);
        editor.putInt("yen10000", Y10000);
        editor.commit();

        //Toast.makeText(MoneySet_Yen.this, "score : " + shared.getInt("yen1",-1), Toast.LENGTH_LONG).show();
        //Toast.makeText(MoneySet_Yen.this, "score : " + Y1, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_set_yen);

        Button submit = (Button)findViewById(R.id.SubmitBudget_yen);

        NumberPicker e1 = findViewById(R.id.yen_1);
        NumberPicker e2 = findViewById(R.id.yen_5);
        NumberPicker e5 = findViewById(R.id.yen_10);
        NumberPicker e10 = findViewById(R.id.yen_50);
        NumberPicker e20 = findViewById(R.id.yen_100);
        NumberPicker e50 = findViewById(R.id.yen_500);
        NumberPicker e200 = findViewById(R.id.yen_1000);
        NumberPicker e500 = findViewById(R.id.yen_2000);
        NumberPicker e1000 = findViewById(R.id.yen_5000);
        NumberPicker e2000 = findViewById(R.id.yen_10000);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* store = new Storage(0,0,0,0,0,
                        0,0,0,0,0,
                        0,0,0,0,0,
                        Y1,Y5,Y10,Y50,Y100,
                        Y500,Y1000,Y2000,Y5000,Y10000);
                data.add(store);} */

                Y1 = e1.getValue();
                Y5 = e2.getValue();
                Y10 = e5.getValue();
                Y50 = e10.getValue();
                Y100 = e20.getValue();
                Y500 = e50.getValue();
                Y1000 = e200.getValue();
                Y2000 = e500.getValue();
                Y5000 = e1000.getValue();
                Y10000 = e2000.getValue();

                Update_CoinCount(Y1,Y5,Y10,Y50,Y100,
                        Y500,Y1000,Y2000,Y5000,Y10000);

                Intent intent = new Intent(MoneySet_Yen.this, ShowMeTheMoney_Yen.class);
                startActivity(intent);
            }
        });
    }
}