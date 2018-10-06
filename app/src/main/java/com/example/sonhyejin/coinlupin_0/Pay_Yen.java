package com.example.sonhyejin.coinlupin_0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pay_Yen extends AppCompatActivity {


    public TextView yen;
    public Button yBtn;

    int y=0;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay__yen);

        yen = (TextView) findViewById(R.id.yen);
        yBtn = (Button) findViewById(R.id.yBtn);    //이 버튼 눌렀을 때 다음 페이지로 값(yen)넘어감

        intent = new Intent(Pay_Yen.this, Recommend_Yen.class);

        yBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yen.getText().length()>0) {
                    y = Integer.parseInt(yen.getText().toString());    //textView에 입력된 값이 String형이라 integer값으로 변환
                }else
                    y=0;

                //총 보유 금액을 넘기는 금액을 입력했을 때 toast 메세지띄우기

                intent.putExtra("y",y);

                //Storage객체에서 계산 함수 호출해서 사용할 것, 사용자가 입력한 금액 넘겨주기

                startActivity(intent);

            }
        });
    }
}
