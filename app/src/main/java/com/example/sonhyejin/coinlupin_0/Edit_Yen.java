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

public class Edit_Yen extends AppCompatActivity {


    TextView Total_Money;

    Button mBtn1, pBtn1, mBtn2, pBtn2, mBtn3, pBtn3,
            mBtn4, pBtn4, mBtn5, pBtn5, mBtn6, pBtn6,
            mBtn7, pBtn7, mBtn8, pBtn8, mBtn9, pBtn9,
            mBtn10, pBtn10; //mBtn = -버튼, pBtn = +버튼

    Button ok;//완료 버튼

    int YEcoin1, YEcoin2, YEcoin3, YEcoin4, YEcoin5, YEcoin6, YEcoin7, YEcoin8,
            YEcoin9, YEcoin10; //동전 개수 sp 에서 가져올거

    TextView Edit1, Edit2, Edit3, Edit4, Edit5, Edit6, Edit7,
            Edit8, Edit9, Edit10;//edit 된 동전개수

    float OwnMoney;

    boolean a; // boolean 함수 선언 (화폐 범위 넘으면 if 문 선언할려고)



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_yen);

        SharedPreferences shared = getSharedPreferences("name", MODE_PRIVATE);

        OwnMoney = shared.getFloat("total_money", 0);
        Total_Money = (TextView)findViewById(R.id.Total_Money);
        Total_Money.setText(Float.toString(OwnMoney));

        a = true;


        //sp 에서 동전 개수(YEcoin) 불러오기
        // Edit에 받아야되는데 int 라서 일단 YEcoin에 받음
        YEcoin1 = shared.getInt("yen1",0);
        YEcoin2 = shared.getInt("yen5",0);
        YEcoin3 = shared.getInt("yen10",0);
        YEcoin4 = shared.getInt("yen50",0);
        YEcoin5 = shared.getInt("yen100",0);
        YEcoin6 = shared.getInt("yen500",0);
        YEcoin7 = shared.getInt("yen1000",0);
        YEcoin8 = shared.getInt("yen2000",0);
        YEcoin9 = shared.getInt("yen5000",0);
        YEcoin10 = shared.getInt("yen10000",0);



//-, +버튼 동작
        mBtn1 = findViewById(R.id.mBtn1);
        Edit1 = (TextView)findViewById(R.id.Edit1);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YEcoin1 -= 1;
                Edit1.setText(Integer.toString(YEcoin1));//String값으로 바꿔서 Edit에 대입
                OwnMoney -= 1;//동전개수에서 동전 가격으로 바꿔서 총 금액에 합산해줌
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin1 < 0) {//입력범위 초과시 오류메세지 띄움
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;// 범위를 넘을 경우
                }
                else {
                    a = true;// 범위를 안 넘을 경우
                }
            }
        });

        pBtn1 = findViewById(R.id.pBtn1);
        Edit1 = (TextView)findViewById(R.id.Edit1);
        pBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YEcoin1 += 1;
                Edit1.setText(Integer.toString(YEcoin1));
                OwnMoney += 1;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin1 > 20) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        mBtn2 = findViewById(R.id.mBtn2);
        Edit2 = findViewById(R.id.Edit2);
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YEcoin2 -= 1;
                Edit2.setText(Integer.toString(YEcoin2));
                OwnMoney -= 5;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin2 < 0) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin2 += 1;
                Edit2.setText(Integer.toString(YEcoin2));
                OwnMoney += 5;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin2 > 20) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin3 -= 1;
                Edit3.setText(Integer.toString(YEcoin3));
                OwnMoney -= 10;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin3 < 0) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin3 += 1;
                Edit3.setText(Integer.toString(YEcoin3));
                OwnMoney += 10;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin3 > 20) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin4 -= 1;
                Edit4.setText(Integer.toString(YEcoin4));
                OwnMoney -= 50;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin4 < 0) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });

        pBtn4 = findViewById(R.id.pBtn4);
        Edit4 = findViewById(R.id.Edit4);
        pBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YEcoin4 += 1;
                Edit4.setText(Integer.toString(YEcoin4));
                OwnMoney += 50;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin4 > 20) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin5 -= 1;
                Edit5.setText(Integer.toString(YEcoin5));
                OwnMoney -= 100;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin5 < 0) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin5 += 1;
                Edit5.setText(Integer.toString(YEcoin5));
                OwnMoney += 100;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin5 > 20) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin6 -= 1;
                Edit6.setText(Integer.toString(YEcoin6));
                OwnMoney -= 500;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin6 < 0) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin6 += 1;
                Edit6.setText(Integer.toString(YEcoin6));
                OwnMoney += 500;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin6 > 20) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin7 -= 1;
                Edit7.setText(Integer.toString(YEcoin7));
                OwnMoney -= 1000;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin7 < 0) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin7 += 1;
                Edit7.setText(Integer.toString(YEcoin7));
                OwnMoney += 1000;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin7 > 30) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin8 -= 1;
                Edit8.setText(Integer.toString(YEcoin8));
                OwnMoney -= 2000;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin8 < 0) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin8 += 1;
                Edit8.setText(Integer.toString(YEcoin8));
                OwnMoney += 2000;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin8 > 30) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin9 -= 1;
                Edit9.setText(Integer.toString(YEcoin9));
                OwnMoney -= 5000;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin9 < 0) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin9 += 1;
                Edit9.setText(Integer.toString(YEcoin9));
                OwnMoney += 5000;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin9 > 30) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin10 -= 1;
                Edit10.setText(Integer.toString(YEcoin10));
                OwnMoney -= 10000;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin10 < 0) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                YEcoin10 += 1;
                Edit10.setText(Integer.toString(YEcoin10));
                OwnMoney += 10000;
                Total_Money.setText(Float.toString(OwnMoney));
                if (YEcoin10 > 30) {
                    Toast.makeText(Edit_Yen.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
                    a = false;
                }
                else {
                    a = true;
                }
            }
        });



        Total_Money.setText(Float.toString(OwnMoney));

        ok = findViewById(R.id.btn_next);

        Intent NextPay = new Intent(this, ShowMeTheMoney_Yen.class);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//편집한 값 sp에 저장
                SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = shared.edit();

                editor.putInt("yen1", YEcoin1);
                editor.putInt("yen5", YEcoin2);
                editor.putInt("yen10", YEcoin3);
                editor.putInt("yen50", YEcoin4);
                editor.putInt("yen100", YEcoin5);
                editor.putInt("yen500", YEcoin6);
                editor.putInt("yen1000", YEcoin7);
                editor.putInt("yen2000", YEcoin8);
                editor.putInt("yen5000", YEcoin9);
                editor.putInt("yen10000", YEcoin10);

                editor.putFloat("Total_Money", OwnMoney);


                //입력범위 초과 안할 경우 값이 넘어가는지
                //Toast.makeText(Edit_Yen.this, "score:" + YEcoin1, Toast.LENGTH_LONG).show();


                editor.apply();
                if(a==false)
                    Toast.makeText(Edit_Yen.this, "범위를 초과하였습니다." , Toast.LENGTH_LONG).show(); // 범위 초과할 경우 토스트 메세지를 띄우고 화면이 넘어가지 않는다.
                else {
                    a = true;
                    startActivity(NextPay); // 범위 초과 안 할 경우 화면이 전환된다.
                }

            }
        });
    }
}