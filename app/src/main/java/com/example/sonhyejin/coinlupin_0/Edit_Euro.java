package com.example.sonhyejin.coinlupin_0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Edit_Euro extends AppCompatActivity {

    /*
    TextView Total_Money;

    Button mBtn1, pBtn1, mBtn2, pBtn2, mBtn3, pBtn3,
            mBtn4, pBtn4, mBtn5, pBtn5, mBtn6, pBtn6,
            mBtn7, pBtn7, mBtn8, pBtn8, mBtn9, pBtn9,
            mBtn10, pBtn10, mBtn11, pBtn11, mBtn12, pBtn12,
            mBtn13, pBtn13, mBtn14, pBtn14, mBtn15, pBtn15; //mBtn = -버튼, pBtn = +버튼

    int Ecoin1, Ecoin2, Ecoin3, Ecoin4, Ecoin5, Ecoin6, Ecoin7, Ecoin8,
            Ecoin9, Ecoin10, Ecoin11, Ecoin12, Ecoin13, Ecoin14, Ecoin15; //동전 개수 sp 에서 가져올거

    TextView Edit1, Edit2, Edit3, Edit4, Edit5, Edit6, Edit7,
            Edit8, Edit9, Edit10, Edit11, Edit12, Edit13, Edit14, Edit15; //edit 된 동전개수

    int E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15;

    float OwnMoney;


    //+, - 버튼 누르기
    Button.OnClickListener listener = new Button.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId()){
                case R.id.mBtn1:
                    E1 = Ecoin1 -1;
                    break;
                case R.id.pBtn1:
                    E1  = Ecoin1 +1;
                    break;
                case R.id.mBtn2:
                    E2  = Ecoin2 -1;
                    break;
                case R.id.pBtn2:
                    E2 = Ecoin2 +1;
                    break;
                case R.id.mBtn3:
                    E3  = Ecoin3 -1;
                    break;
                case R.id.pBtn3:
                    E3  = Ecoin3 +1;
                    break;
                case R.id.mBtn4:
                    E4 = Ecoin4 -1;
                    break;
                case R.id.pBtn4:
                    E4 = Ecoin4 +1;
                    break;
                case R.id.mBtn5:
                    E5 = Ecoin5 -1;
                    break;
                case R.id.pBtn5:
                    E5  = Ecoin5 +1;
                    break;
                case R.id.mBtn6:
                    E6  = Ecoin6 -1;
                    break;
                case R.id.pBtn6:
                    E6  = Ecoin6 +1;
                    break;
                case R.id.mBtn7:
                    E7 = Ecoin7 -1;
                    break;
                case R.id.pBtn7:
                    E7  = Ecoin7 +1;
                    break;
                case R.id.mBtn8:
                    E8 = Ecoin8 -1;
                    break;
                case R.id.pBtn8:
                    E8 = Ecoin8 +1;
                    break;
                case R.id.mBtn9:
                    E9 = Ecoin9 -1;
                    break;
                case R.id.pBtn9:
                    E9 = Ecoin9 +1;
                    break;
                case R.id.mBtn10:
                    E10  = Ecoin10 -1;
                    break;
                case R.id.pBtn10:
                    E10 = Ecoin10 +1;
                    break;
                case R.id.mBtn11:
                    E11  = Ecoin10 -1;
                    break;
                case R.id.pBtn11:
                    E11  = Ecoin11 +1;
                    break;
                case R.id.mBtn12:
                    E12  = Ecoin12 -1;
                    break;
                case R.id.pBtn12:
                    E12 = Ecoin12 +1;
                    break;
                case R.id.mBtn13:
                    E13 = Ecoin13 -1;
                    break;
                case R.id.pBtn13:
                    E13 = Ecoin13 +1;
                    break;
                case R.id.mBtn14:
                    E14  = Ecoin14 -1;
                    break;
                case R.id.pBtn14:
                    E14 = Ecoin14 +1;
                    break;
                case R.id.mBtn15:
                    E15  = Ecoin5 -1;
                    break;
                case R.id.pBtn15:
                    E15 = Ecoin5 +1;
                    break;
            }

        }

    };
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__euro);

/*
        SharedPreferences sp = getSharedPreferences("shared", MODE_PRIVATE);

        OwnMoney = sp.getFloat("Total_money", Float.parseFloat(""));
        OwnMoney += ((E1*0.01)+(E2*0.02)+(E3*0.05)+(E4*0.1)+(E5*0.2)+(E6*0.5)+E7+(E8*2)+(E9*5)+(E10*10)+(E11*20)+(E12*50)+(E13*100)+(E14*200)+(E15*500)); //edit 한 동전개수를 총 잔액에 더함
        Total_Money = findViewById(R.id.Total_Money);
        Total_Money.setText(Float.toString(OwnMoney));


        //sp 에서 동전 개수(Ecoin) 불러오기
        Ecoin1 = sp.getInt("Ecoin1",0);
        Ecoin2 = sp.getInt("Ecoin2",0);
        Ecoin3 = sp.getInt("Ecoin3",0);
        Ecoin4 = sp.getInt("Ecoin4",0);
        Ecoin5 = sp.getInt("Ecoin5",0);
        Ecoin6 = sp.getInt("Ecoin6",0);
        Ecoin7 = sp.getInt("Ecoin7",0);
        Ecoin8 = sp.getInt("Ecoin8",0);
        Ecoin9 = sp.getInt("Ecoin9",0);
        Ecoin10 = sp.getInt("Ecoin10",0);
        Ecoin11 = sp.getInt("Ecoin11",0);
        Ecoin12 = sp.getInt("Ecoin12",0);
        Ecoin13 = sp.getInt("Ecoin13",0);
        Ecoin14 = sp.getInt("Ecoin14",0);
        Ecoin15 = sp.getInt("Ecoin15",0);


        mBtn1 = findViewById(R.id.mBtn1);
        mBtn1.setOnClickListener(listener);
        pBtn1 = findViewById(R.id.pBtn1);
        pBtn1.setOnClickListener(listener);


        mBtn2 = findViewById(R.id.mBtn2);
        mBtn2.setOnClickListener(listener);
        pBtn2 = findViewById(R.id.pBtn2);
        pBtn2.setOnClickListener(listener);

        mBtn3 = findViewById(R.id.mBtn3);
        mBtn3.setOnClickListener(listener);
        pBtn3 = findViewById(R.id.pBtn3);
        pBtn3.setOnClickListener(listener);

        mBtn4 = findViewById(R.id.mBtn4);
        mBtn4.setOnClickListener(listener);
        pBtn4 = findViewById(R.id.pBtn4);
        pBtn4.setOnClickListener(listener);

        mBtn5 = findViewById(R.id.mBtn5);
        mBtn5.setOnClickListener(listener);
        pBtn5 = findViewById(R.id.pBtn5);
        pBtn5.setOnClickListener(listener);

        mBtn6 = findViewById(R.id.mBtn6);
        mBtn6.setOnClickListener(listener);
        pBtn6 = findViewById(R.id.pBtn6);
        pBtn6.setOnClickListener(listener);

        mBtn7 = findViewById(R.id.mBtn7);
        mBtn7.setOnClickListener(listener);
        pBtn7 = findViewById(R.id.pBtn7);
        pBtn7.setOnClickListener(listener);

        mBtn8 = findViewById(R.id.mBtn8);
        mBtn8.setOnClickListener(listener);
        pBtn8 = findViewById(R.id.pBtn8);
        pBtn8.setOnClickListener(listener);

        mBtn9 = findViewById(R.id.mBtn9);
        mBtn9.setOnClickListener(listener);
        pBtn9 = findViewById(R.id.pBtn9);
        pBtn9.setOnClickListener(listener);

        mBtn10 = findViewById(R.id.mBtn10);
        mBtn10.setOnClickListener(listener);
        pBtn10 = findViewById(R.id.pBtn10);
        pBtn10.setOnClickListener(listener);

        mBtn11 = findViewById(R.id.mBtn11);
        mBtn11.setOnClickListener(listener);
        pBtn11 = findViewById(R.id.pBtn11);
        pBtn11.setOnClickListener(listener);

        mBtn12 = findViewById(R.id.mBtn12);
        mBtn12.setOnClickListener(listener);
        pBtn12 = findViewById(R.id.pBtn12);
        pBtn12.setOnClickListener(listener);

        mBtn13 = findViewById(R.id.mBtn13);
        mBtn13.setOnClickListener(listener);
        pBtn13 = findViewById(R.id.pBtn13);
        pBtn13.setOnClickListener(listener);

        mBtn14 = findViewById(R.id.mBtn14);
        mBtn14.setOnClickListener(listener);
        pBtn14 = findViewById(R.id.pBtn14);
        pBtn14.setOnClickListener(listener);

        mBtn15 = findViewById(R.id.mBtn15);
        mBtn15.setOnClickListener(listener);
        pBtn15 = findViewById(R.id.pBtn15);
        pBtn15.setOnClickListener(listener);

        Edit1 = findViewById(R.id.Edit1);
        Edit2 = findViewById(R.id.Edit2);
        Edit3 = findViewById(R.id.Edit3);
        Edit4 = findViewById(R.id.Edit4);
        Edit5 = findViewById(R.id.Edit5);
        Edit6 = findViewById(R.id.Edit6);
        Edit7 = findViewById(R.id.Edit7);
        Edit8 = findViewById(R.id.Edit8);
        Edit9 = findViewById(R.id.Edit9);
        Edit10 = findViewById(R.id.Edit10);
        Edit11 = findViewById(R.id.Edit11);
        Edit12 = findViewById(R.id.Edit12);
        Edit13 = findViewById(R.id.Edit13);
        Edit14 = findViewById(R.id.Edit14);
        Edit15 = findViewById(R.id.Edit15);


        Edit1.setText(Integer.toString(E1));
        Edit2.setText(Integer.toString(E2));
        Edit3.setText(Integer.toString(E3));
        Edit4.setText(Integer.toString(E4));
        Edit5.setText(Integer.toString(E5));
        Edit6.setText(Integer.toString(E6));
        Edit7.setText(Integer.toString(E7));
        Edit8.setText(Integer.toString(E8));
        Edit9.setText(Integer.toString(E9));
        Edit10.setText(Integer.toString(E10));
        Edit11.setText(Integer.toString(E11));
        Edit12.setText(Integer.toString(E12));
        Edit13.setText(Integer.toString(E13));
        Edit14.setText(Integer.toString(E14));
        Edit15.setText(Integer.toString(E15));
        */
    }
/*

    public void btnNext(View v)
    {
        //다음화면으로 넘어가는거

        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = shared.edit();

        editor.putInt("Edit1", E1);
        editor.putInt("Edit2", E2);
        editor.putInt("Edit3", E3);
        editor.putInt("Edit4", E4);
        editor.putInt("Edit5", E5);
        editor.putInt("Edit6", E6);
        editor.putInt("Edit7", E7);
        editor.putInt("Edit8", E8);
        editor.putInt("Edit9", E9);
        editor.putInt("Edit10", E10);
        editor.putInt("Edit11", E11);
        editor.putInt("Edit12", E12);
        editor.putInt("Edit13", E13);
        editor.putInt("Edit14", E14);
        editor.putInt("Edit15", E15);
        editor.putFloat("Total_Money", OwnMoney);

        Intent NextPay = new Intent(this, ShowMeTheMoney_Euro.class);
        startActivity(NextPay);
    }*/
}