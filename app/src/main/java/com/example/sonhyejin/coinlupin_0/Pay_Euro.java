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

public class Pay_Euro extends AppCompatActivity {

    public TextView euroIN; //지불금액-유로부분
    public TextView euroDE; //지불금액-센트부분
    public Button eBtn; //ok버튼
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
        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        intent = new Intent(Pay_Euro.this, Recommend_Euro.class);

        eBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //아무것도 입력하지 않았을 때 예외처리
                if(euroIN.getText().length()>0) {   //길이로 입력의 여부를 판단
                    eIN = Integer.parseInt(euroIN.getText().toString());    //textView에 입력된 값이 String형이라 integer값으로 변환
                }else   //입력된 값이 없을 때 0으로 값을 전달
                    eIN = 0;

                if(euroDE.getText().length()>0) {   //길이로 입력의 여부를 판단
                    eDE = Integer.parseInt(euroDE.getText().toString());    //textView에 입력된 값이 String형이라 integer값으로 변환
                }else   //입력된 값이 없을 때 0으로 값을 전달
                    eDE = 0;

                //총 보유 금액을 넘기는 금액을 입력했을 때 toast 메세지띄우기
                //if(eIN*100+eDE > 10) { //total_money 받아 오기 전에 조건에 따라 toast메세지가 잘 뜨는지 확인 하기 위해 사용했던 구문
                if(eIN*100+eDE > shared.getFloat("total_money", 0)) { //sharedPreference에서 총액을 받아옴
                    Toast.makeText(Pay_Euro.this, "보유금액을 초과합니다!", Toast.LENGTH_LONG).show();
                }else if(eDE >=100){    //테스트를 통해 추가한 구문, 센트에서 100을 넘기는 값은 유로에 해당한다.
                    Toast.makeText(Pay_Euro.this, "센트는 100미만의 값을 입력해 주세요!", Toast.LENGTH_LONG).show();
                }else {
                    intent.putExtra("eIN", eIN);    //다음 화면에 키값 'eIN'으로 값 전달
                    intent.putExtra("eDE", eDE);    //다음 화면에 키값 'eDE'으로 값 전달
                    startActivity(intent);
                }
            }
        });
    }
}
