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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_me_the_money_yen);

        TextView Total_Money;
        TextView YCoin1,YCoin2,YCoin3, YCoin4,YCoin5,YCoin6,YCoin7,YCoin8,YCoin9,YCoin10;

        Button gotoReset = (Button) findViewById(R.id.resetB);
        Button gotoPay = (Button) findViewById(R.id.payB);
        Button gotoEdit = (Button) findViewById(R.id.editB);

        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        Float OwnMoney = shared.getFloat("Total_money", -1);  //  총 금액 값 key : Total_money
        Total_Money = (TextView)findViewById(R.id.Total_Money);
        Total_Money.setText(Float.toString(OwnMoney));  // SharedPreference에 저장되어있는 값 Total_money 출력

        int Ycoin1 = shared.getInt("yen1", -1); // YCoin1 : 엔코인1 (제일 싼 동전)
        YCoin1 = (TextView)findViewById(R.id.HMcoin1);
        YCoin1.setText(Integer.toString(Ycoin1));

        int Ycoin2 = shared.getInt("yen5", -1); // YCoin2 : 엔코인2 (두번째로 싼 동전)
        YCoin2 = (TextView)findViewById(R.id.HMcoin2);
        YCoin2.setText(Integer.toString(Ycoin2));

        int Ycoin3 = shared.getInt("yen10", -1); // YCoin3 : 엔코인3 (세번째로 싼 동전)
        YCoin3 = (TextView)findViewById(R.id.HMcoin3);
        YCoin3.setText(Integer.toString(Ycoin3));

        int Ycoin4 = shared.getInt("yen50", -1); // YCoin4 : 엔코인4
        YCoin4 = (TextView)findViewById(R.id.HMcoin4);
        YCoin4.setText(Integer.toString(Ycoin4));

        int Ycoin5 = shared.getInt("yen100", -1); // YCoin5 : 엔코인5
        YCoin5 = (TextView)findViewById(R.id.HMcoin5);
        YCoin5.setText(Integer.toString(Ycoin5));

        int Ycoin6 = shared.getInt("yen500", -1); // YCoin6 : 엔코인6
        YCoin6 = (TextView)findViewById(R.id.HMcoin6);
        YCoin6.setText(Integer.toString(Ycoin6));

        int Ycoin7 = shared.getInt("yen1000", -1); // YCoin7 : 엔코인7
        YCoin7 = (TextView)findViewById(R.id.HMcoin7);
        YCoin7.setText(Integer.toString(Ycoin7));

        int Ycoin8 = shared.getInt("yen2000", -1); // YCoin8 : 엔코인8
        YCoin8 = (TextView)findViewById(R.id.HMcoin8);
        YCoin8.setText(Integer.toString(Ycoin8));

        int Ycoin9 = shared.getInt("yen5000", -1); // YCoin9 : 엔코인9
        YCoin9 = (TextView)findViewById(R.id.HMcoin9);
        YCoin9.setText(Integer.toString(Ycoin9));

        int Ycoin10 = shared.getInt("yen10000", -1); // YCoin10 : 엔코인10
        YCoin10 = (TextView)findViewById(R.id.HMcoin10);
        YCoin10.setText(Integer.toString(Ycoin10));

        gotoReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowMeTheMoney_Yen.this, Home_ChooseCountry.class);
                //void Reset_CoinCount();   // reset 함수 ---->
                startActivity(intent);
            }
        });

        gotoEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowMeTheMoney_Yen.this, Edit_Euro.class);
                startActivity(intent);
            }
        });

        gotoPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowMeTheMoney_Yen.this, Pay_Euro.class);
                //void Reset_CoinCount();   // reset 함수 ---->
                startActivity(intent);
            }
        });

    }

}

