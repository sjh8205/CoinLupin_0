package com.example.sonhyejin.coinlupin_0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Edit_Euro extends AppCompatActivity {


    TextView Total_Money;

    Button mBtn1, pBtn1, mBtn2, pBtn2, mBtn3, pBtn3,
            mBtn4, pBtn4, mBtn5, pBtn5, mBtn6, pBtn6,
            mBtn7, pBtn7, mBtn8, pBtn8, mBtn9, pBtn9,
            mBtn10, pBtn10, mBtn11, pBtn11, mBtn12, pBtn12,
            mBtn13, pBtn13, mBtn14, pBtn14, mBtn15, pBtn15; //mBtn = -버튼, pBtn = +버튼

    Button ok;//완료 버튼

    int EEcoin1, EEcoin2, EEcoin3, EEcoin4, EEcoin5, EEcoin6, EEcoin7, EEcoin8,
            EEcoin9, EEcoin10, EEcoin11, EEcoin12, EEcoin13, EEcoin14, EEcoin15; //동전 개수 sp 에서 가져올거

    int e1; //EEcoin 버튼누른거 받을변수

    TextView Edit1, Edit2, Edit3, Edit4, Edit5, Edit6, Edit7,
            Edit8, Edit9, Edit10, Edit11, Edit12, Edit13, Edit14, Edit15; //edit 된 동전개수

    float OwnMoney; // 총 보유금액 sp 에서 가져올거

    boolean a; // boolean 함수 선언 (화폐 범위 넘으면 if 문 선언할려고)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__euro);

        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);

        OwnMoney = shared.getFloat("total_money", 0); //sp에서 값 가져옴
        Total_Money = (TextView) findViewById(R.id.Total_Money);
        Total_Money.setText(Float.toString(OwnMoney));

        a = true; //boolean 함수 선언 (화폐 범위 넘으면 if 문 선언하려고)

        //sp 에서 동전 개수(Ecoin) 불러오기
        // Edit에 받아야되는데 int 라서 일단 EEcoin에 받음
        EEcoin1 = shared.getInt("cent1", 0);
        EEcoin2 = shared.getInt("cent2", 0);
        EEcoin3 = shared.getInt("cent5", 0);
        EEcoin4 = shared.getInt("cent10", 0);
        EEcoin5 = shared.getInt("cent20", 0);
        EEcoin6 = shared.getInt("cent50", 0);
        EEcoin8 = shared.getInt("cent200", 0);
        EEcoin9 = shared.getInt("cent500", 0);
        EEcoin10 = shared.getInt("cent1000", 0);
        EEcoin11 = shared.getInt("cent2000", 0);
        EEcoin12 = shared.getInt("cent5000", 0);
        EEcoin13 = shared.getInt("cent10000", 0);
        EEcoin14 = shared.getInt("cent20000", 0);
        EEcoin15 = shared.getInt("cent50000", 0);


//-, +버튼 동작
        mBtn1 = findViewById(R.id.mBtn1);
        Edit1 = (TextView) findViewById(R.id.Edit1);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin1 -= 1;
                Edit1.setText(Integer.toString(EEcoin1));//String 값으로 바꿔서 Edit에 대입
                OwnMoney -= 0.01;//동전개수에서 동전 가격으로 바꿔서 총 금액에 합산해줌
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin1 < 0) {//입력범위 초과한 경우 오류메세지 띄움
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false; // 범위 넘을 경우
                }
                else {
                    a = true; // 범위 안 넘을 경우
                }
            }
        });

        pBtn1 = findViewById(R.id.pBtn1);
        Edit1 = (TextView) findViewById(R.id.Edit1);
        pBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin1 += 1;
                Edit1.setText(Integer.toString(EEcoin1));
                OwnMoney +=  0.01;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin1 > 20) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false; //범위를 넘을 경우
                }
                else{
                    a = true; //범위를 안넘을 경우
                }
            }
        });

        mBtn2 = findViewById(R.id.mBtn2);
        Edit2 = findViewById(R.id.Edit2);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin2 -= 1;
                Edit2.setText(Integer.toString(EEcoin2));
                OwnMoney -=  0.02;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin2 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        pBtn2 = findViewById(R.id.pBtn2);
        Edit2 = findViewById(R.id.Edit2);
        pBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin2 += 1;
                Edit2.setText(Integer.toString(EEcoin2));
                OwnMoney +=  0.02;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin2 > 20) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        mBtn3 = findViewById(R.id.mBtn3);
        Edit3 = findViewById(R.id.Edit3);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin3 -= 1;
                Edit3.setText(Integer.toString(EEcoin3));
                OwnMoney -=  0.05;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin3 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        pBtn3 = findViewById(R.id.pBtn3);
        Edit3 = findViewById(R.id.Edit3);
        pBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin3 += 1;
                Edit3.setText(Integer.toString(EEcoin3));
                OwnMoney +=  0.05;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin3 > 20) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        mBtn4 = findViewById(R.id.mBtn4);
        Edit4 = findViewById(R.id.Edit4);
        mBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin4 -= 1;
                Edit4.setText(Integer.toString(EEcoin4));
                OwnMoney -=  0.1;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin4 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else{
                    a=true;
                }
            }

        });

        pBtn4 = findViewById(R.id.pBtn4);
        Edit4 = findViewById(R.id.Edit4);
        pBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin4 += 1;
                Edit4.setText(Integer.toString(EEcoin4));
                OwnMoney +=  0.1;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin4 > 20) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        mBtn5 = findViewById(R.id.mBtn5);
        Edit5 = findViewById(R.id.Edit5);
        mBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin5 -= 1;
                Edit5.setText(Integer.toString(EEcoin5));
                OwnMoney -=  0.2;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin5 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        pBtn5 = findViewById(R.id.pBtn5);
        Edit5 = findViewById(R.id.Edit5);
        pBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin5 += 1;
                Edit5.setText(Integer.toString(EEcoin5));
                OwnMoney +=  0.2;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin5 > 20) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        mBtn6 = findViewById(R.id.mBtn6);
        Edit6 = findViewById(R.id.Edit6);
        mBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin6 -= 1;
                Edit6.setText(Integer.toString(EEcoin6));
                OwnMoney -=  0.5;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin6 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        pBtn6 = findViewById(R.id.pBtn6);
        Edit6 = findViewById(R.id.Edit6);
        pBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin6 += 1;
                Edit6.setText(Integer.toString(EEcoin6));
                OwnMoney +=  0.5;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin6 > 20) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        mBtn7 = findViewById(R.id.mBtn7);
        Edit7 = findViewById(R.id.Edit7);
        mBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin7 -= 1;
                Edit7.setText(Integer.toString(EEcoin7));
                OwnMoney -= 1;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin7 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        pBtn7 = findViewById(R.id.pBtn7);
        Edit7 = findViewById(R.id.Edit7);
        pBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin7 += 1;
                Edit7.setText(Integer.toString(EEcoin7));
                OwnMoney += 1;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin7 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        mBtn8 = findViewById(R.id.mBtn8);
        Edit8 = findViewById(R.id.Edit8);
        mBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin8 -= 1;
                Edit8.setText(Integer.toString(EEcoin8));
                OwnMoney -=  2;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin8 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        pBtn8 = findViewById(R.id.pBtn8);
        Edit8 = findViewById(R.id.Edit8);
        pBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin8 += 1;
                Edit8.setText(Integer.toString(EEcoin8));
                OwnMoney +=  2;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin8 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        mBtn9 = findViewById(R.id.mBtn9);
        Edit9 = findViewById(R.id.Edit9);
        mBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin9 -= 1;
                Edit9.setText(Integer.toString(EEcoin9));
                OwnMoney -=  5;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin9 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        pBtn9 = findViewById(R.id.pBtn9);
        Edit9 = findViewById(R.id.Edit9);
        pBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin9 += 1;
                Edit9.setText(Integer.toString(EEcoin9));
                OwnMoney +=  5;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin9 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        mBtn10 = findViewById(R.id.mBtn10);
        Edit10 = findViewById(R.id.Edit10);
        mBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin10 -= 1;
                Edit10.setText(Integer.toString(EEcoin10));
                OwnMoney -=  10;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin10 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        pBtn10 = findViewById(R.id.pBtn10);
        Edit10 = findViewById(R.id.Edit10);
        pBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin10 += 1;
                Edit10.setText(Integer.toString(EEcoin10));
                OwnMoney +=  10;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin10 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        mBtn11 = findViewById(R.id.mBtn11);
        Edit11 = findViewById(R.id.Edit11);
        mBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin11 -= 1;
                Edit11.setText(Integer.toString(EEcoin11));
                OwnMoney -=  20;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin11 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        pBtn11 = findViewById(R.id.pBtn11);
        Edit11 = findViewById(R.id.Edit11);
        pBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin11 += 1;
                Edit11.setText(Integer.toString(EEcoin11));
                OwnMoney +=  20;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin11 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        mBtn12 = findViewById(R.id.mBtn12);
        Edit12 = findViewById(R.id.Edit12);
        mBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin12 -= 1;
                Edit12.setText(Integer.toString(EEcoin12));
                OwnMoney -=  50;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin12 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        pBtn12 = findViewById(R.id.pBtn12);
        Edit12 = findViewById(R.id.Edit12);
        pBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin12 += 1;
                Edit12.setText(Integer.toString(EEcoin12));
                OwnMoney +=  50;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin12 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        mBtn13 = findViewById(R.id.mBtn13);
        Edit13 = findViewById(R.id.Edit13);
        mBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin13 -= 1;
                Edit13.setText(Integer.toString(EEcoin13));
                OwnMoney -=  100;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin13 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        pBtn13 = findViewById(R.id.pBtn13);
        Edit13 = findViewById(R.id.Edit13);
        pBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin13 += 1;
                Edit13.setText(Integer.toString(EEcoin13));
                OwnMoney +=  100;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin13 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        mBtn14 = findViewById(R.id.mBtn14);
        Edit14 = findViewById(R.id.Edit14);
        mBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin14 -= 1;
                Edit14.setText(Integer.toString(EEcoin14));
                OwnMoney -=  200;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin14 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        pBtn14 = findViewById(R.id.pBtn14);
        Edit14 = findViewById(R.id.Edit14);
        pBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin14 += 1;
                Edit14.setText(Integer.toString(EEcoin14));
                OwnMoney +=  200;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin14 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        mBtn15 = findViewById(R.id.mBtn15);
        Edit15 = findViewById(R.id.Edit15);
        mBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin15 -= 1;
                Edit15.setText(Integer.toString(EEcoin15));
                OwnMoney -=  500;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin15 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        pBtn15 = findViewById(R.id.pBtn15);
        Edit15 = findViewById(R.id.Edit15);
        pBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin15 += 1;
                Edit15.setText(Integer.toString(EEcoin15));
                OwnMoney +=  500;
                Total_Money.setText(Float.toString(OwnMoney));
                if (EEcoin15 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        Total_Money.setText(Float.toString(OwnMoney));

        ok = findViewById(R.id.btn_next);

        Intent NextPay = new Intent(this, ShowMeTheMoney_Euro.class);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//편집한 값 sp에 저장
                SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = shared.edit();



                editor.putInt("cent1", EEcoin1);
                editor.putInt("cent2", EEcoin2);
                editor.putInt("cent5", EEcoin3);
                editor.putInt("cent10", EEcoin4);
                editor.putInt("cent20", EEcoin5);
                editor.putInt("cent50", EEcoin6);
                editor.putInt("cent100", EEcoin7);
                editor.putInt("cent200", EEcoin8);
                editor.putInt("cent500", EEcoin9);
                editor.putInt("cent1000", EEcoin10);
                editor.putInt("cent2000", EEcoin11);
                editor.putInt("cent5000", EEcoin12);
                editor.putInt("cent10000", EEcoin13);
                editor.putInt("cent20000", EEcoin14);
                editor.putInt("cent50000", EEcoin15);
                editor.putFloat("Total_Money", OwnMoney);

                //입력범위 초과 안할 경우 값이 넘어가는지
                //Toast.makeText(Edit_Euro.this, "score:" + EEcoin1, Toast.LENGTH_LONG).show();

                //입력범위 초과 할 경우 화면 전환 되는지


                editor.apply();

                if(a==false)
                    Toast.makeText(Edit_Euro.this, "범위를 초과하였습니다." , Toast.LENGTH_LONG).show(); // 범위 초과할 경우 토스트 메세지를 띄우고 화면이 넘어가지 않는다.
                else{
                    a = true; // 범위 초과 안 할 경우 다음 화면으로 넘어간다.
                    startActivity(NextPay);
                }

            }
        });
    }
}