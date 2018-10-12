package com.example.sonhyejin.coinlupin_0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(2000);
            //2초간 정지
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        SharedPreferences check = getSharedPreferences("login", Context.MODE_PRIVATE);
        int checked = check.getInt("FirstorNot",0);

        if(checked==1){ //사용자가 europe을 사전에 선택한 경우
            startActivity(new Intent(this,ShowMeTheMoney_Euro.class));
            finish();
        }else if(checked==2){//사용자가 japan을 사전에 선택한 경우
            startActivity(new Intent(this,ShowMeTheMoney_Yen.class));
            finish();
        }else {//그 외의 경우
            startActivity(new Intent(this,Home_ChooseCountry.class));
            finish();
        }
        //SharedPreference 값을 받아와 화면전환
    }
}
