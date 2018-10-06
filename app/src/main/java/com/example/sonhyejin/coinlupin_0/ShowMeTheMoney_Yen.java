package com.example.sonhyejin.coinlupin_0;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowMeTheMoney_Yen extends AppCompatActivity {

    TextView Total_Money;
    TextView YCoin1,YCoin2,YCoin3, YCoin4,YCoin5,YCoin6,YCoin7,YCoin8,YCoin9,YCoin10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_me_the_money_yen);

        SharedPreferences sp = getSharedPreferences("shared",MODE_PRIVATE);  //string name : shared
        Float OwnMoney = sp.getFloat("Total_money", Float.parseFloat(""));  //  총 금액 값 key : Total_money
        Total_Money = (TextView)findViewById(R.id.Total_Money);
        Total_Money.setText("Total_money");  // SharedPreference에 저장되어있는 값 Total_money 출력

        int Ycoin1 = sp.getInt("Ycoin1", Integer.parseInt("")); // YCoin1 : 엔코인1 (제일 싼 동전)
        YCoin1 = (TextView)findViewById(R.id.HMcoin1);
        YCoin1.setText("YCoin1");

        int Ycoin2 = sp.getInt("Ycoin2", Integer.parseInt("")); // YCoin2 : 엔코인2 (두번째로 싼 동전)
        YCoin2 = (TextView)findViewById(R.id.HMcoin2);
        YCoin2.setText("YCoin2");

        int Ycoin3 = sp.getInt("Ycoin3", Integer.parseInt("")); // YCoin3 : 엔코인3 (세번째로 싼 동전)
        YCoin3 = (TextView)findViewById(R.id.HMcoin3);
        YCoin3.setText("YCoin3");

        int Ycoin4 = sp.getInt("Ycoin4", Integer.parseInt("")); // YCoin4 : 엔코인4
        YCoin4 = (TextView)findViewById(R.id.HMcoin4);
        YCoin4.setText("YCoin4");

        int Ycoin5 = sp.getInt("Ycoin5", Integer.parseInt("")); // YCoin5 : 엔코인5
        YCoin5 = (TextView)findViewById(R.id.HMcoin5);
        YCoin5.setText("YCoin5");

        int Ycoin6 = sp.getInt("Ycoin6", Integer.parseInt("")); // YCoin6 : 엔코인6
        YCoin6 = (TextView)findViewById(R.id.HMcoin6);
        YCoin6.setText("YCoin6");

        int Ycoin7 = sp.getInt("Ycoin7", Integer.parseInt("")); // YCoin7 : 엔코인7
        YCoin7 = (TextView)findViewById(R.id.HMcoin7);
        YCoin7.setText("YCoin7");

        int Ycoin8 = sp.getInt("Ycoin8", Integer.parseInt("")); // YCoin8 : 엔코인8
        YCoin8 = (TextView)findViewById(R.id.HMcoin8);
        YCoin8.setText("YCoin8");

        int Ycoin9 = sp.getInt("Ycoin9", Integer.parseInt("")); // YCoin9 : 엔코인9
        YCoin9 = (TextView)findViewById(R.id.HMcoin9);
        YCoin9.setText("YCoin9");

        int Ycoin10 = sp.getInt("Ycoin10", Integer.parseInt("")); // YCoin10 : 엔코인10
        YCoin10 = (TextView)findViewById(R.id.HMcoin10);
        YCoin10.setText("YCoin10");

    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.resetB:     //리셋버튼 눌렀을 때 초기화 되기
                //  void Reset_CoinCount();   // reset 함수 ---->
                Intent GoCountry = new Intent(this, Home_ChooseCountry.class);
                startActivity(GoCountry);   //국가 선택 화면으로 연결
                break;

            case R.id.editB:
                Intent GoEdit = new Intent(this, Edit_Yen.class);
                startActivity(GoEdit);  //편집 화면으로 연결
                break;

            case R.id.payB:
                Intent GoPay = new Intent(this, Pay_Yen.class);
                startActivity(GoPay);   //pay 화면으로 연결
                break;
        }
    }
}

