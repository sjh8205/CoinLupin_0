package com.example.sonhyejin.coinlupin_0;

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

    private int mSelectionDividerColor = DEFAULT_DIVIDER_COLOR;
    private static final int DEFAULT_DIVIDER_COLOR = 0xFF000000;
    private Drawable mSelectionDivider;
    ArrayList<Storage> data;
    Storage store;
    int Y1,Y5,Y10,Y50,Y100,Y500,Y1000,Y2000,Y5000,Y10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_set_euro);
        Button submit = findViewById(R.id.SubmitBudget);

        NumberPicker e1 = findViewById(R.id.yen_1);
        Y1 = e1.getValue();
        NumberPicker e2 = findViewById(R.id.yen_5);
        Y5 = e2.getValue();
        NumberPicker e5 = findViewById(R.id.yen_10);
        Y10 = e5.getValue();
        NumberPicker e10 = findViewById(R.id.yen_50);
        Y50 = e10.getValue();
        NumberPicker e20 = findViewById(R.id.yen_100);
        Y100 = e20.getValue();
        NumberPicker e50 = findViewById(R.id.yen_500);
        Y500 = e50.getValue();
        NumberPicker e200 = findViewById(R.id.yen_1000);
        Y1000 = e200.getValue();
        NumberPicker e500 = findViewById(R.id.yen_2000);
        Y2000 = e500.getValue();
        NumberPicker e1000 = findViewById(R.id.yen_5000);
        Y5000 = e1000.getValue();
        NumberPicker e2000 = findViewById(R.id.yen_10000);
        Y10000 = e2000.getValue();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = new Storage(0,0,0,0,0,
                        0,0,0,0,0,
                        0,0,0,0,0,
                        Y1,Y5,Y10,Y50,Y100,
                        Y500,Y1000,Y2000,Y5000,Y10000);
                data.add(store);
            }
        });
    }
}

        /*
        // Set fading edge enabled
        numberPicker.setFadingEdgeEnabled(false);

        // OnClickListener
        numberPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click on current value");
            }
        });

        // OnValueChangeListener
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                Log.d(TAG, String.format(Locale.US, "oldVal: %d, newVal: %d", oldVal, newVal));
            }
        });*/