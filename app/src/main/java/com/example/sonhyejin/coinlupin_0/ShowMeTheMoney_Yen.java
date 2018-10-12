package com.example.sonhyejin.coinlupin_0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowMeTheMoney_Yen extends AppCompatActivity {

    public void Reset_CoinCount(){       // reset 버튼 눌렀을 때 호출되는 reset 함수
        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = shared.edit();

        editor.putInt("yen1", 0);
        editor.putInt("yen5", 0);
        editor.putInt("yen10", 0);
        editor.putInt("yen50", 0);
        editor.putInt("yen100", 0);
        editor.putInt("yen500", 0);
        editor.putInt("yen1000", 0);
        editor.putInt("yen2000", 0);
        editor.putInt("yen5000", 0);
        editor.putInt("yen10000", 0);
        editor.putFloat("total_money",0);
        editor.apply();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_me_the_money_yen);

        TextView Total_Money;    // 총 보유 금액 보여주는 textview 변수 Total_Money 선언
        TextView YCoin1,YCoin2,YCoin3, YCoin4,YCoin5,YCoin6,YCoin7,YCoin8,YCoin9,YCoin10;    // 각 동전 개수 보여주는 texetview 변수 선언

        Button gotoReset = (Button) findViewById(R.id.resetB);     // reset 버튼 변수 gotoReset 선언
        Button gotoPay = (Button) findViewById(R.id.payB);         // pay 버튼 변수 gotoPay 선언
        Button gotoEdit = (Button) findViewById(R.id.editB);       // edit 버튼 변수 gotoEdit 선언

        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = shared.edit();

        //    Float OwnMoney = shared.getFloat("Total_money", -1);  //  총 금액 값 key : Total_money
        //    Total_Money = (TextView)findViewById(R.id.Total_Money);
        //    Total_Money.setText(Float.toString(OwnMoney));  // SharedPreference에 저장되어있는 값 Total_money 출력

        int Ycoin1 = shared.getInt("yen1", -1); // YCoin1 : 엔코인1 (1yen)
        YCoin1 = (TextView)findViewById(R.id.HMcoin1);
        YCoin1.setText(Integer.toString(Ycoin1));

        int Ycoin2 = shared.getInt("yen5", -1); // YCoin2 : 엔코인2 (5yen)
        YCoin2 = (TextView)findViewById(R.id.HMcoin2);
        YCoin2.setText(Integer.toString(Ycoin2));

        int Ycoin3 = shared.getInt("yen10", -1); // YCoin3 : 엔코인3 (10yen)
        YCoin3 = (TextView)findViewById(R.id.HMcoin3);
        YCoin3.setText(Integer.toString(Ycoin3));

        int Ycoin4 = shared.getInt("yen50", -1); // YCoin4 : 엔코인4 (50yen)
        YCoin4 = (TextView)findViewById(R.id.HMcoin4);
        YCoin4.setText(Integer.toString(Ycoin4));

        int Ycoin5 = shared.getInt("yen100", -1); // YCoin5 : 엔코인5 (100yen)
        YCoin5 = (TextView)findViewById(R.id.HMcoin5);
        YCoin5.setText(Integer.toString(Ycoin5));

        int Ycoin6 = shared.getInt("yen500", -1); // YCoin6 : 엔코인6 (500yen)
        YCoin6 = (TextView)findViewById(R.id.HMcoin6);
        YCoin6.setText(Integer.toString(Ycoin6));

        int Ycoin7 = shared.getInt("yen1000", -1); // YCoin7 : 엔코인7 (1000yen)
        YCoin7 = (TextView)findViewById(R.id.HMcoin7);
        YCoin7.setText(Integer.toString(Ycoin7));

        int Ycoin8 = shared.getInt("yen2000", -1); // YCoin8 : 엔코인8 (2000yen)
        YCoin8 = (TextView)findViewById(R.id.HMcoin8);
        YCoin8.setText(Integer.toString(Ycoin8));

        int Ycoin9 = shared.getInt("yen5000", -1); // YCoin9 : 엔코인9  (5000yen)
        YCoin9 = (TextView)findViewById(R.id.HMcoin9);
        YCoin9.setText(Integer.toString(Ycoin9));

        int Ycoin10 = shared.getInt("yen10000", -1); // YCoin10 : 엔코인10  (10000yen)
        YCoin10 = (TextView)findViewById(R.id.HMcoin10);
        YCoin10.setText(Integer.toString(Ycoin10));

        float OwnMoney = (float)((1*Ycoin1) + 5*Ycoin2 + 10*Ycoin3 + Ycoin4*50 + Ycoin5*100
                + Ycoin6*500 + Ycoin7*1000 + Ycoin8*2000 + Ycoin9*5000 + Ycoin10*10000);  //총 보유금액 OwnMoney에 저장
        Total_Money = (TextView)findViewById(R.id.Total_Money);   //id가 Total_Money인 textview ---> 변수 Total_Money라고 선언
        Total_Money.setText(Float.toString(OwnMoney));  //textview에 OwnMoney출력
        edit.putFloat("total_money",OwnMoney);  //총 보유 금액 key 값 : total_money, SharedPreference에 OwnMoney 저장
        edit.apply();

        gotoReset.setOnClickListener(new View.OnClickListener() {         //reset 버튼 눌렀을 때
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowMeTheMoney_Yen.this, Home_ChooseCountry.class);     //intent() 함수 이용해서 화면 전환
                Reset_CoinCount();    // reset 함수 호출해서 각 동전 개수 & 총 보유금액 0으로 갱신
                startActivity(intent);
            }
        });

        gotoEdit.setOnClickListener(new View.OnClickListener() {       //edit 버튼 눌렀을 때
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowMeTheMoney_Yen.this, Edit_Euro.class);     //intent() 함수 이용해서 화면 전환
                startActivity(intent);
            }
        });

        gotoPay.setOnClickListener(new View.OnClickListener() {      //pay 버튼 눌렀을 때
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowMeTheMoney_Yen.this, Pay_Euro.class);     //intent() 함수 이용해서 화면 전환
                startActivity(intent);
            }
        });

    }

}