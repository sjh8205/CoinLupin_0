package com.example.sonhyejin.coinlupin_0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pay_Euro extends AppCompatActivity {

    public TextView euroIN;
    public TextView euroDE;
    public Button eBtn;

    int eIN =0;
    int eDE =0;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_euro);

        euroIN = (TextView) findViewById(R.id.euroIN);
        euroDE = (TextView) findViewById(R.id.euroDE);
        eBtn = (Button) findViewById(R.id.eBtn);    //이 버튼 눌렀을 때 다음 페이지로 값(euroIN, euroDE)넘어감

        //intent = new Intent(Pay_Euro.this, Recommend_Euro.class);

        eBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //아무것도 입력하지 않았을 때 예외처리
                if(euroIN.getText().length()>0) {
                    eIN = Integer.parseInt(euroIN.getText().toString());    //textView에 입력된 값이 String형이라 integer값으로 변환
                }else
                    eIN = 0;
                if(euroDE.getText().length()>0) {
                    eDE = Integer.parseInt(euroDE.getText().toString());
                }else
                    eDE = 0;

                //총 보유 금액을 넘기는 금액을 입력했을 때 toast 메세지띄우기

                intent.putExtra("eIN",eIN);
                intent.putExtra("eDE",eDE);

                //Storage객체에서 계산 함수 호출해서 사용할 것, 사용자가 입력한 금액 넘겨주기

                startActivity(intent);
            }
        });
    }
}
