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



public class MoneySet_Euro extends AppCompatActivity {

    private static String TAG = "NumberPicker";

    private int mSelectionDividerColor = DEFAULT_DIVIDER_COLOR;
    private static final int DEFAULT_DIVIDER_COLOR = 0xFF000000;
    private Drawable mSelectionDivider;
    ArrayList<Storage> data;
    Storage store;
    int E1,E2,E5,E10,E20,E50,E100,E200,E500,E1000,E2000,E5000,E10000,E20000,E50000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_set_euro);
        Button submit = findViewById(R.id.SubmitBudget);

        NumberPicker e1 = findViewById(R.id.cent_1);
        E1 = e1.getValue();
        NumberPicker e2 = findViewById(R.id.cent_2);
        E2 = e2.getValue();
        NumberPicker e5 = findViewById(R.id.cent_5);
        E5 = e5.getValue();
        NumberPicker e10 = findViewById(R.id.cent_10);
        E10 = e10.getValue();
        NumberPicker e20 = findViewById(R.id.cent_20);
        E20 = e20.getValue();
        NumberPicker e50 = findViewById(R.id.cent_50);
        E50 = e50.getValue();
        NumberPicker e100 = findViewById(R.id.euro_1);
        E100 = e100.getValue();
        NumberPicker e200 = findViewById(R.id.euro_2);
        E200 = e200.getValue();
        NumberPicker e500 = findViewById(R.id.euro_5);
        E500 = e500.getValue();
        NumberPicker e1000 = findViewById(R.id.euro_10);
        E1000 = e1000.getValue();
        NumberPicker e2000 = findViewById(R.id.euro_20);
        E2000 = e2000.getValue();
        NumberPicker e5000 = findViewById(R.id.euro_50);
        E5000 = e5000.getValue();
        NumberPicker e10000 = findViewById(R.id.euro_100);
        E10000 = e10000.getValue();
        NumberPicker e20000 = findViewById(R.id.euro_200);
        E20000 = e20000.getValue();
        NumberPicker e50000 = findViewById(R.id.euro_500);
        E50000 = e50000.getValue();

       submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store = new Storage(E1,E2,E5,E10,E20,
                        E50,E100,E200,E500,E1000,
                        E2000,E5000,E10000,E20000,E50000,
                        0,0,0,0,0,
                        0,0,0,0,0);
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