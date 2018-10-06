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

    public void Reset_CoinCount(){
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
        editor.putFloat("Total_money",0);
        editor.apply();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_me_the_money__euro);


        TextView Total_Money;
        TextView ECoin1,ECoin2,ECoin3,ECoin4,ECoin5,ECoin6,ECoin7,ECoin8,ECoin9,ECoin10,ECoin11,ECoin12,ECoin13,ECoin14,ECoin15;

        Button gotoReset = (Button) findViewById(R.id.resetB);
        Button gotoPay = (Button) findViewById(R.id.payB);
        Button gotoEdit = (Button) findViewById(R.id.editB);

        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);

        //SharedPreferences sp = getSharedPreferences("shared",MODE_PRIVATE);  //string name : shared
        Float OwnMoney = shared.getFloat("Total_money", -1);  //  총 금액 값 key : Total_money
        Total_Money = (TextView)findViewById(R.id.Total_Money);
        Total_Money.setText(Float.toString(OwnMoney));  // SharedPreference에 저장되어있는 값 Total_money 출력

        int Ecoin1 = shared.getInt("cent1", -1); // ECoin1 : 유로코인1 (제일 싼 동전)
        ECoin1 = (TextView)findViewById(R.id.HMcoin1);
        ECoin1.setText(Integer.toString(Ecoin1));

        int Ecoin2 = shared.getInt("cent2", -1); // ECoin2 : 유로코인2 (두번째로 싼 동전)
        ECoin2 = (TextView)findViewById(R.id.HMcoin2);
        ECoin2.setText(Integer.toString(Ecoin2));

        int Ecoin3 = shared.getInt("cent5", -1); // ECoin3 : 유로코인3 (세번째로 싼 동전)
        ECoin3 = (TextView)findViewById(R.id.HMcoin3);
        ECoin3.setText(Integer.toString(Ecoin3));

        int Ecoin4 = shared.getInt("cent10", -1); // ECoin4 : 유로코인4
        ECoin4 = (TextView)findViewById(R.id.HMcoin4);
        ECoin4.setText(Integer.toString(Ecoin4));

        int Ecoin5 = shared.getInt("cent20", -1); // ECoin5 : 유로코인5
        ECoin5 = (TextView)findViewById(R.id.HMcoin5);
        ECoin5.setText(Integer.toString(Ecoin5));

        int Ecoin6 = shared.getInt("cent50", -1); // ECoin6 : 유로코인6
        ECoin6 = (TextView)findViewById(R.id.HMcoin6);
        ECoin6.setText(Integer.toString(Ecoin6));

        int Ecoin7 = shared.getInt("cent100", -1); // ECoin7 : 유로코인7
        ECoin7 = (TextView)findViewById(R.id.HMcoin7);
        ECoin7.setText(Integer.toString(Ecoin7));

        int Ecoin8 = shared.getInt("cent200", -1); // ECoin8 : 유로코인8
        ECoin8 = (TextView)findViewById(R.id.HMcoin8);
        ECoin8.setText(Integer.toString(Ecoin8));

        int Ecoin9 = shared.getInt("cent500", -1); // ECoin9 : 유로코인9
        ECoin9 = (TextView)findViewById(R.id.HMcoin9);
        ECoin9.setText(Integer.toString(Ecoin9));

        int Ecoin10 = shared.getInt("cent1000", -1); // ECoin10 : 유로코인10
        ECoin10 = (TextView)findViewById(R.id.HMcoin10);
        ECoin10.setText(Integer.toString(Ecoin10));

        int Ecoin11 = shared.getInt("cent2000", -1); // ECoin11 : 유로코인11
        ECoin11 = (TextView)findViewById(R.id.HMcoin11);
        ECoin11.setText(Integer.toString(Ecoin11));

        int Ecoin12 = shared.getInt("cent5000", -1); // ECoin12 : 유로코인12
        ECoin12 = (TextView)findViewById(R.id.HMcoin12);
        ECoin12.setText(Integer.toString(Ecoin12));

        int Ecoin13 = shared.getInt("cent10000", -1); // ECoin13 : 유로코인13
        ECoin13 = (TextView)findViewById(R.id.HMcoin13);
        ECoin13.setText(Integer.toString(Ecoin13));

        int Ecoin14 = shared.getInt("cent20000", -1); // ECoin14 : 유로코인14
        ECoin14 = (TextView)findViewById(R.id.HMcoin14);
        ECoin14.setText(Integer.toString(Ecoin14));

        int Ecoin15 = shared.getInt("cent50000", -1); // ECoin15 : 유로코인15
        ECoin15 = (TextView)findViewById(R.id.HMcoin15);
        ECoin15.setText(Integer.toString(Ecoin15));

        gotoReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowMeTheMoney_Euro.this, Home_ChooseCountry.class);
                Reset_CoinCount();   // reset 함수 ---->
                startActivity(intent);
            }
        });

        gotoEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowMeTheMoney_Euro.this, Edit_Euro.class);
                startActivity(intent);
            }
        });

        gotoPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowMeTheMoney_Euro.this, Pay_Euro.class);
                startActivity(intent);
            }
        });

    }
}
