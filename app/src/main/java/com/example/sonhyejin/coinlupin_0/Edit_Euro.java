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

    TextView Edit1, Edit2, Edit3, Edit4, Edit5, Edit6, Edit7,
            Edit8, Edit9, Edit10, Edit11, Edit12, Edit13, Edit14, Edit15; //edit 된 동전개수

    float OwnMoney;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__euro);

        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);

        //OwnMoney = sp.getFloat("Total_money", 0);
        Total_Money = (TextView) findViewById(R.id.Total_Money);


        //sp 에서 동전 개수(Ecoin) 불러오기
        // Edit에 받아야되는데 int 라서 일단 EEcoin에 받음
        EEcoin1 = sp.getInt("cent1", 0);
        EEcoin2 = sp.getInt("cent2", 0);
        EEcoin3 = sp.getInt("cent5", 0);
        EEcoin4 = sp.getInt("cent10", 0);
        EEcoin5 = sp.getInt("cent20", 0);
        EEcoin6 = sp.getInt("cent50", 0);
        EEcoin8 = sp.getInt("cent200", 0);
        EEcoin9 = sp.getInt("cent500", 0);
        EEcoin10 = sp.getInt("cent1000", 0);
        EEcoin11 = sp.getInt("cent2000", 0);
        EEcoin12 = sp.getInt("cent5000", 0);
        EEcoin13 = sp.getInt("cent10000", 0);
        EEcoin14 = sp.getInt("cent20000", 0);
        EEcoin15 = sp.getInt("cent50000", 0);


//-, +버튼 동작
        mBtn1 = findViewById(R.id.mBtn1);
        Edit1 = (TextView) findViewById(R.id.Edit1);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EEcoin1 -= 1;
                Edit1.setText(Integer.toString(EEcoin1));//String 값으로 바꿔서 Edit에 대입
                OwnMoney += EEcoin1 * 0.01;//동전개수에서 동전 가격으로 바꿔서 총 금액에 합산해줌
                if (EEcoin1 < 0) {//입력범위 초과한 경우 오류메세지 띄움
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin1 * 0.01;
                if (EEcoin1 > 20) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin2 * 0.02;
                if (EEcoin2 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin2 * 0.02;
                if (EEcoin2 > 20) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin3 * 0.05;
                if (EEcoin3 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin3 * 0.05;
                if (EEcoin3 > 20) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin4 * 0.1;
                if (EEcoin4 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin4 * 0.1;
                if (EEcoin4 > 20) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin5 * 0.2;
                if (EEcoin5 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin5 * 0.2;
                if (EEcoin5 > 20) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin6 * 0.5;
                if (EEcoin6 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin6 * 0.5;
                if (EEcoin6 > 20) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin7;
                if (EEcoin7 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin7;
                if (EEcoin7 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin8 * 2;
                if (EEcoin8 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin8 * 2;
                if (EEcoin8 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin9 * 5;
                if (EEcoin9 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin9 * 5;
                if (EEcoin9 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin10 * 10;
                if (EEcoin10 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin10 * 10;
                if (EEcoin10 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin11 * 20;
                if (EEcoin11 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin11 * 20;
                if (EEcoin11 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin12 * 50;
                if (EEcoin12 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin12 * 50;
                if (EEcoin12 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin13 * 100;
                if (EEcoin13 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin13 * 100;
                if (EEcoin13 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin14 * 200;
                if (EEcoin14 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin14 * 200;
                if (EEcoin14 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin15 * 500;
                if (EEcoin15 < 0) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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
                OwnMoney += EEcoin15 * 500;
                if (EEcoin15 > 30) {
                    Toast.makeText(Edit_Euro.this, "입력범위를 초과하였습니다!", Toast.LENGTH_LONG).show();
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

                editor.apply();

                startActivity(NextPay);
            }
        });
    }
}