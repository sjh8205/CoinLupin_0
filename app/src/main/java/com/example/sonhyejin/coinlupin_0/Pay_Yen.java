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

public class Pay_Yen extends AppCompatActivity {


    public TextView yen;    //지불금액
    public Button yBtn; //ok버튼

    int y=0;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay__yen);

        yen = (TextView) findViewById(R.id.yen);
        yBtn = (Button) findViewById(R.id.yBtn);    //이 버튼 눌렀을 때 다음 페이지로 값(yen)넘어감

        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);

        intent = new Intent(Pay_Yen.this, Recommend_Yen.class);

        yBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yen.getText().length()>0) {      //길이로 입력 여부를 판단
                    y = Integer.parseInt(yen.getText().toString());    //textView에 입력된 값이 String형이라 integer값으로 변환
                }else   //입력된 값이 없을 때 0으로 값을 전달
                    y=0;

                //총 보유 금액을 넘기는 금액을 입력했을 때 toast 메세지띄우기
                //if(eIN*100+eDE > 10) { //total_money 받아 오기 전에 조건에 따라 toast메세지가 잘 뜨는지 확인 하기 위해 사용했던 구문
                if(y > shared.getFloat("total_money", 0)) { //sharedPreference에서 총액을 받아옴
                    Toast.makeText(Pay_Yen.this, "보유금액을 초과합니다!", Toast.LENGTH_LONG).show();
                }else {
                    intent.putExtra("y", y);    //다음 화면에 키값 'y'으로 값 전달

                    startActivity(intent);
                }
            }
        });
    }
}
