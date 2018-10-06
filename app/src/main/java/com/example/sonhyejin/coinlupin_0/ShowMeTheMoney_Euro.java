package com.example.sonhyejin.coinlupin_0;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowMeTheMoney_Euro extends AppCompatActivity {

    TextView Total_Money;
    TextView ECoin1,ECoin2,ECoin3,ECoin4,ECoin5,ECoin6,ECoin7,ECoin8,ECoin9,ECoin10,ECoin11,ECoin12,ECoin13,ECoin14,ECoin15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_me_the_money__euro);

        SharedPreferences sp = getSharedPreferences("shared",MODE_PRIVATE);  //string name : shared
        Float OwnMoney = sp.getFloat("Total_money", Float.parseFloat(""));  //  총 금액 값 key : Total_money
        Total_Money = (TextView)findViewById(R.id.Total_Money);
        Total_Money.setText("Total_money");  // SharedPreference에 저장되어있는 값 Total_money 출력

        int Ecoin1 = sp.getInt("Ecoin1", Integer.parseInt("")); // ECoin1 : 유로코인1 (제일 싼 동전)
        ECoin1 = (TextView)findViewById(R.id.HMcoin1);
        ECoin1.setText("ECoin1");

        int Ecoin2 = sp.getInt("Ecoin2", Integer.parseInt("")); // ECoin2 : 유로코인2 (두번째로 싼 동전)
        ECoin2 = (TextView)findViewById(R.id.HMcoin2);
        ECoin2.setText("ECoin2");

        int Ecoin3 = sp.getInt("Ecoin3", Integer.parseInt("")); // ECoin3 : 유로코인3 (세번째로 싼 동전)
        ECoin3 = (TextView)findViewById(R.id.HMcoin3);
        ECoin3.setText("ECoin3");

        int Ecoin4 = sp.getInt("Ecoin4", Integer.parseInt("")); // ECoin4 : 유로코인4
        ECoin4 = (TextView)findViewById(R.id.HMcoin4);
        ECoin4.setText("ECoin4");

        int Ecoin5 = sp.getInt("Ecoin5", Integer.parseInt("")); // ECoin5 : 유로코인5
        ECoin5 = (TextView)findViewById(R.id.HMcoin5);
        ECoin5.setText("ECoin5");

        int Ecoin6 = sp.getInt("Ecoin6", Integer.parseInt("")); // ECoin6 : 유로코인6
        ECoin6 = (TextView)findViewById(R.id.HMcoin6);
        ECoin6.setText("ECoin6");

        int Ecoin7 = sp.getInt("Ecoin7", Integer.parseInt("")); // ECoin7 : 유로코인7
        ECoin7 = (TextView)findViewById(R.id.HMcoin7);
        ECoin7.setText("ECoin7");

        int Ecoin8 = sp.getInt("Ecoin8", Integer.parseInt("")); // ECoin8 : 유로코인8
        ECoin8 = (TextView)findViewById(R.id.HMcoin8);
        ECoin8.setText("ECoin8");

        int Ecoin9 = sp.getInt("Ecoin9", Integer.parseInt("")); // ECoin9 : 유로코인9
        ECoin9 = (TextView)findViewById(R.id.HMcoin9);
        ECoin9.setText("ECoin9");

        int Ecoin10 = sp.getInt("Ecoin10", Integer.parseInt("")); // ECoin10 : 유로코인10
        ECoin10 = (TextView)findViewById(R.id.HMcoin10);
        ECoin10.setText("ECoin10");

        int Ecoin11 = sp.getInt("Ecoin11", Integer.parseInt("")); // ECoin11 : 유로코인11
        ECoin11 = (TextView)findViewById(R.id.HMcoin11);
        ECoin11.setText("ECoin11");

        int Ecoin12 = sp.getInt("Ecoin12", Integer.parseInt("")); // ECoin12 : 유로코인12
        ECoin12 = (TextView)findViewById(R.id.HMcoin12);
        ECoin12.setText("ECoin12");

        int Ecoin13 = sp.getInt("Ecoin13", Integer.parseInt("")); // ECoin13 : 유로코인13
        ECoin13 = (TextView)findViewById(R.id.HMcoin13);
        ECoin13.setText("ECoin13");

        int Ecoin14 = sp.getInt("Ecoin14", Integer.parseInt("")); // ECoin14 : 유로코인14
        ECoin14 = (TextView)findViewById(R.id.HMcoin14);
        ECoin14.setText("ECoin14");

        int Ecoin15 = sp.getInt("Ecoin15", Integer.parseInt("")); // ECoin15 : 유로코인15
        ECoin15 = (TextView)findViewById(R.id.HMcoin15);
        ECoin15.setText("ECoin15");

    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.resetB:     //리셋버튼 눌렀을 때 초기화 되기
                //  void Reset_CoinCount();   // reset 함수 ---->
                Intent GoCountry = new Intent(this, Home_ChooseCountry.class);
                startActivity(GoCountry);   //국가 선택 화면으로 연결
                break;

            case R.id.editB:
                Intent GoEdit = new Intent(this, Edit_Euro.class);
                startActivity(GoEdit);  //편집 화면으로 연결
                break;

            case R.id.payB:
                Intent GoPay = new Intent(this, Pay_Euro.class);
                startActivity(GoPay);   //pay 화면으로 연결
                break;
        }
    }
}
