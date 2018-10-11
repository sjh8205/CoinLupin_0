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
    //상단의 주석처리 된 코드 : 초기에 sharedpreference를 사용하는 것과 위처럼 storage 객체를 만들어서 사용하는 것 중 더 효율적인 것을 찾기 위해 실행했던 코드_1

    int Y1,Y5,Y10,Y50,Y100,Y500,Y1000,Y2000,Y5000,Y10000;
    //numberpicker에서 받아온 각 화폐별 개수를 최종저장하는 변수들

    public void Update_CoinCount(int Y1,int Y5,int Y10, int Y50, int Y100,
                                 int Y500, int Y1000, int Y2000, int Y5000,int Y10000){
        //사용자가 선택한 각 화폐별 개수를 SharedPreference에 업데이트하는 함수

        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = shared.edit();
        //SharedPreference를 사용하기 위해 선언

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
        //SharedPreference 각 키에 해당하는 값 저장하기(편집하기)
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_set_yen);

        Button submit = (Button)findViewById(R.id.SubmitBudget_yen);
        //"SubmitBudget_yen"라는 id를 가진 button을 찾아와 submit으로 선언

        NumberPicker y1 = findViewById(R.id.yen_1);
        NumberPicker y5 = findViewById(R.id.yen_5);
        NumberPicker y10 = findViewById(R.id.yen_10);
        NumberPicker y50 = findViewById(R.id.yen_50);
        NumberPicker y100 = findViewById(R.id.yen_100);
        NumberPicker y500 = findViewById(R.id.yen_500);
        NumberPicker y1000 = findViewById(R.id.yen_1000);
        NumberPicker y2000 = findViewById(R.id.yen_2000);
        NumberPicker y5000 = findViewById(R.id.yen_5000);
        NumberPicker y10000 = findViewById(R.id.yen_10000);
        //각 id에 해당하는 numberpicker들을 y1~y10000으로 선언

        submit.setOnClickListener(new View.OnClickListener() {
            //submit 버튼을 누르면 해당 구문이 실행
            @Override
            public void onClick(View view) {

                /* store = new Storage(0,0,0,0,0,
                        0,0,0,0,0,
                        0,0,0,0,0,
                        Y1,Y5,Y10,Y50,Y100,
                        Y500,Y1000,Y2000,Y5000,Y10000);
                data.add(store);} */
                //상단의 코드 : 초기에 sharedpreference를 사용하는 것과 위처럼 storage 객체를 만들어서 사용하는 것 중 더 효율적인 것을 찾기 위해 실행했던 코드_2

                Y1 = y1.getValue();
                Y5 = y5.getValue();
                Y10 = y10.getValue();
                Y50 = y50.getValue();
                Y100 = y100.getValue();
                Y500 = y500.getValue();
                Y1000 = y1000.getValue();
                Y2000 = y2000.getValue();
                Y5000 = y5000.getValue();
                Y10000 = y10000.getValue();
                //각 numberpicker에서 선택된 값들을 Y1~Y10000에 저장

                //Toast.makeText(MoneySet_Yen.this, "score : " + shared.getInt("yen1",-1), Toast.LENGTH_LONG).show();
                //Toast.makeText(MoneySet_Yen.this, "score : " + Y1, Toast.LENGTH_LONG).show();
                //위의 주석처리된 구문 : 다음 페이지로 값이 잘 넘어가는지 확인하기 위한 toast message를 띄움

                Update_CoinCount(Y1,Y5,Y10,Y50,Y100,
                        Y500,Y1000,Y2000,Y5000,Y10000);
                //Update_CoinCount함수와 적정 arguments들을 넣어줌으로써 각 동전 개수를 업데이트

                Intent intent = new Intent(MoneySet_Yen.this, ShowMeTheMoney_Yen.class);
                startActivity(intent);
                //ShowMeTheMoney_Yen class로 전환
            }
        });
    }
}