package com.example.sonhyejin.coinlupin_0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowMeTheMoney_Euro extends AppCompatActivity {

    public void Reset_CoinCount(){       // reset 버튼 눌렀을 때 호출되는 reset 함수
        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = shared.edit();

        editor.putInt("cent1",0);
        editor.putInt("cent2",0);
        editor.putInt("cent5",0);
        editor.putInt("cent10",0);
        editor.putInt("cent20",0);
        editor.putInt("cent50",0);
        editor.putInt("cent100",0);
        editor.putInt("cent200",0);
        editor.putInt("cent500",0);
        editor.putInt("cent1000",0);
        editor.putInt("cent2000",0);
        editor.putInt("cent5000",0);
        editor.putInt("cent10000",0);
        editor.putInt("cent20000",0);
        editor.putInt("cent50000",0);
        editor.putFloat("total_money",0);
        editor.apply();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_me_the_money__euro);

        TextView Total_Money;    // 총 보유 금액 보여주는 textview 변수 Total_Money 선언
        TextView ECoin1,ECoin2,ECoin3,ECoin4,ECoin5,
                ECoin6,ECoin7,ECoin8,ECoin9,ECoin10,
                ECoin11,ECoin12,ECoin13,ECoin14,ECoin15;  // 각 동전 개수 보여주는 texetview 변수 선언
        Button gotoReset = (Button) findViewById(R.id.resetB);   // reset 버튼 변수 gotoReset 선언
        Button gotoPay = (Button) findViewById(R.id.payB);       // pay 버튼 변수 gotoPay 선언
        Button gotoEdit = (Button) findViewById(R.id.editB);     // edit 버튼 변수 gotoEdit 선언

        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = shared.edit();

        //SharedPreferences sp = getSharedPreferences("shared",MODE_PRIVATE);  //string name : shared
        //Float OwnMoney = shared.getFloat("Total_money", -1);  //  총 금액 값 key : Total_money


        int Ecoin1 = shared.getInt("cent1", -1); // ECoin1 : 유로코인1 (1cent)
        ECoin1 = (TextView)findViewById(R.id.HMcoin1);
        ECoin1.setText(Integer.toString(Ecoin1));

        int Ecoin2 = shared.getInt("cent2", -1); // ECoin2 : 유로코인2 (2cent)
        ECoin2 = (TextView)findViewById(R.id.HMcoin2);
        ECoin2.setText(Integer.toString(Ecoin2));

        int Ecoin3 = shared.getInt("cent5", -1); // ECoin3 : 유로코인3 (5cent)
        ECoin3 = (TextView)findViewById(R.id.HMcoin3);
        ECoin3.setText(Integer.toString(Ecoin3));

        int Ecoin4 = shared.getInt("cent10", -1); // ECoin4 : 유로코인4 (10cent)
        ECoin4 = (TextView)findViewById(R.id.HMcoin4);
        ECoin4.setText(Integer.toString(Ecoin4));

        int Ecoin5 = shared.getInt("cent20", -1); // ECoin5 : 유로코인5 (20cent)
        ECoin5 = (TextView)findViewById(R.id.HMcoin5);
        ECoin5.setText(Integer.toString(Ecoin5));

        int Ecoin6 = shared.getInt("cent50", -1); // ECoin6 : 유로코인6 (50cent)
        ECoin6 = (TextView)findViewById(R.id.HMcoin6);
        ECoin6.setText(Integer.toString(Ecoin6));

        int Ecoin7 = shared.getInt("cent100", -1); // ECoin7 : 유로코인7 (1euro == 100cent)
        ECoin7 = (TextView)findViewById(R.id.HMcoin7);
        ECoin7.setText(Integer.toString(Ecoin7));

        int Ecoin8 = shared.getInt("cent200", -1); // ECoin8 : 유로코인8 (2euro == 200cent)
        ECoin8 = (TextView)findViewById(R.id.HMcoin8);
        ECoin8.setText(Integer.toString(Ecoin8));

        int Ecoin9 = shared.getInt("cent500", -1); // ECoin9 : 유로코인9 (5euro == 500cent)
        ECoin9 = (TextView)findViewById(R.id.HMcoin9);
        ECoin9.setText(Integer.toString(Ecoin9));

        int Ecoin10 = shared.getInt("cent1000", -1); // ECoin10 : 유로코인10 (10euro == 1000cent)
        ECoin10 = (TextView)findViewById(R.id.HMcoin10);
        ECoin10.setText(Integer.toString(Ecoin10));

        int Ecoin11 = shared.getInt("cent2000", -1); // ECoin11 : 유로코인11 (20euro == 2000cent)
        ECoin11 = (TextView)findViewById(R.id.HMcoin11);
        ECoin11.setText(Integer.toString(Ecoin11));

        int Ecoin12 = shared.getInt("cent5000", -1); // ECoin12 : 유로코인12 (50euro == 5000cent)
        ECoin12 = (TextView)findViewById(R.id.HMcoin12);
        ECoin12.setText(Integer.toString(Ecoin12));

        int Ecoin13 = shared.getInt("cent10000", -1); // ECoin13 : 유로코인13 (100euro == 10000cent)
        ECoin13 = (TextView)findViewById(R.id.HMcoin13);
        ECoin13.setText(Integer.toString(Ecoin13));

        int Ecoin14 = shared.getInt("cent20000", -1); // ECoin14 : 유로코인14 (200euro == 20000cent)
        ECoin14 = (TextView)findViewById(R.id.HMcoin14);
        ECoin14.setText(Integer.toString(Ecoin14));

        int Ecoin15 = shared.getInt("cent50000", -1); // ECoin15 : 유로코인15 (500euro == 50000cent)
        ECoin15 = (TextView)findViewById(R.id.HMcoin15);
        ECoin15.setText(Integer.toString(Ecoin15));

        float OwnMoney = (float)((0.01*Ecoin1) + 0.02*Ecoin2 + 0.05*Ecoin3 + Ecoin4*0.10 + Ecoin5*0.2
                + Ecoin6*0.5 + Ecoin7*1 + Ecoin8*2 + Ecoin9*5 + Ecoin10*10
                + Ecoin11*20 + Ecoin12*50 + Ecoin13*100 + Ecoin14*200 + Ecoin15*500);  //총 보유금액 OwnMoney에 저장
        Total_Money = (TextView)findViewById(R.id.Total_Money); //id가 Total_Money인 textview ---> 변수 Total_Money라고 선언
        Total_Money.setText(Float.toString(OwnMoney));  //textview에 OwnMoney출력
        edit.putFloat("total_money",OwnMoney);  //총 보유 금액 key 값 : total_money, SharedPreference에 OwnMoney 저장
        edit.apply();

        gotoReset.setOnClickListener(new View.OnClickListener() {     //reset 버튼 눌렀을 때
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowMeTheMoney_Euro.this, Home_ChooseCountry.class);  //intent() 함수 이용해서 화면 전환
                Reset_CoinCount();   // reset 함수 호출해서 각 동전 개수 & 총 보유금액 0으로 갱신
                startActivity(intent);
            }
        });

        gotoEdit.setOnClickListener(new View.OnClickListener() {     //edit 버튼 눌렀을 때
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowMeTheMoney_Euro.this, Edit_Euro.class);  //intent() 함수 이용해서 화면 전환
                startActivity(intent);
            }
        });

        gotoPay.setOnClickListener(new View.OnClickListener() {      //pay 버튼 눌렀을 때
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowMeTheMoney_Euro.this, Pay_Euro.class);  //intent() 함수 이용해서 화면 전환
                startActivity(intent);
            }
        });

    }
}