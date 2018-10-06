package com.example.sonhyejin.coinlupin_0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Recommend_Yen extends AppCompatActivity {

    public Button ryBtn;
    public TextView payYen;
    Intent intent;

    //동전개수 TextView
    public TextView pY1;
    public TextView pY2;
    public TextView pY3;
    public TextView pY4;
    public TextView pY5;
    public TextView pY6;
    public TextView pY7;
    public TextView pY8;
    public TextView pY9;
    public TextView pY10;

    SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
    Home_ChooseCountry hc = new Home_ChooseCountry();   //만들어진 SP를 사용하기 위해 객체 선언

//    int Y1,Y2, Y3, Y4, Y5, Y6, Y7, Y8, Y9, Y10;    //SP에서 가져다 쓸 것임
//    int rY1, rY2, rY3, rY4, rY5, rY6, rY7, rY8, rY9, rY10;    //추천 동전 개수

    //설계문서와 변수 선언 다름
    int[] Y = new int[10];  //동전개수, SP에서 가져다 쓸 것임, for문을 돌리기 위해 변경
    int[] Y2 = {1, 5, 10, 50, 100, 500, 1000, 2000, 5000, 10000};    //해당 동전 액수
    int[] rY = new int[10]; //추천 동전 개수

    public void Update_CointCount() {    //설계문서와 인수 설정이 다를 듯 함
        //SP의 값을 갱신해야함
        SharedPreferences.Editor edit = shared.edit();
        edit.putInt("Y1", Y[0] - rY[0]);
        edit.putInt("Y2", Y[1] - rY[1]);
        edit.putInt("Y3", Y[2] - rY[2]);
        edit.putInt("Y4", Y[3] - rY[3]);
        edit.putInt("Y5", Y[4] - rY[4]);
        edit.putInt("Y6", Y[5] - rY[5]);
        edit.putInt("Y7", Y[6] - rY[6]);
        edit.putInt("Y8", Y[7] - rY[7]);
        edit.putInt("Y9", Y[8] - rY[8]);
        edit.putInt("E10", Y[9] - rY[9]);
    }

    public void CalculateCoin(int howmuch) { //동전계산 함수, 테스트 후 보완이 필요함
        for (int i = 0; i < 10; i++) {
            if (howmuch - Y[i] * Y2[i] > 0) {    //양의 값
                howmuch -= Y[i] * Y2[i];
                rY[i] = Y[i];
            } else if (howmuch == Y[i] * Y2[i]) {    //잔액이 0이 될 떄
                howmuch -= Y[i] * Y2[i];
                rY[i] = Y[i];
                break;
            } else {
                for (int j = 0; j < Y[i]; j++) {
                    howmuch -= Y2[i];
                    if (howmuch < 0)
                        rY[i] = j;
                    //잔돈 나오는거....생각해서 잔돈에 해당하는거 더해줘야져
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend__yen);

        ryBtn = (Button) findViewById(R.id.ryBtn);

        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        Home_ChooseCountry hc = new Home_ChooseCountry();   //만들어진 SP를 사용하기 위해 객체 선언, SP최초로 선언해준 java파일 이름으로 대체하면 됨
        Y[0] = shared.getInt("Y1", 0);  //값 받음
        Y[1] = shared.getInt("Y2", 0);
        Y[2] = shared.getInt("Y3", 0);
        Y[3] = shared.getInt("Y4", 0);
        Y[4] = shared.getInt("Y5", 0);
        Y[5] = shared.getInt("Y6", 0);
        Y[6] = shared.getInt("Y7", 0);
        Y[7] = shared.getInt("Y8", 0);
        Y[8] = shared.getInt("Y9", 0);
        Y[9] = shared.getInt("Y10", 0);

        intent = getIntent();

        int y = intent.getIntExtra("y", 0);

        payYen = (TextView) findViewById(R.id.payYen);
        //동전 텍스트 뷰랑 연결시키기
        pY1 = (TextView) findViewById(R.id.RYcoin1);
        pY2 = (TextView) findViewById(R.id.RYcoin2);
        pY3 = (TextView) findViewById(R.id.RYcoin3);
        pY4 = (TextView) findViewById(R.id.RYcoin4);
        pY5 = (TextView) findViewById(R.id.RYcoin5);
        pY6 = (TextView) findViewById(R.id.RYcoin6);
        pY7 = (TextView) findViewById(R.id.RYcoin7);
        pY8 = (TextView) findViewById(R.id.RYcoin8);
        pY9 = (TextView) findViewById(R.id.RYcoin9);
        pY10 = (TextView) findViewById(R.id.RYcoin10);


        String y2 = Integer.toString(y);    //넘어온 값이 integer값이라 string형으로 변환

        payYen.setText(y2); //총액표시

        //넘어온 화폐 개수 받기
        //화폐 개수대로...
        CalculateCoin(y);

        //동전개수 표시하기
        pY1.setText(rY[0]);
        pY2.setText(rY[1]);
        pY3.setText(rY[2]);
        pY4.setText(rY[3]);
        pY5.setText(rY[4]);
        pY6.setText(rY[5]);
        pY7.setText(rY[6]);
        pY8.setText(rY[7]);
        pY9.setText(rY[8]);
        pY10.setText(rY[9]);

        intent = new Intent(com.example.sonhyejin.coinlupin_0.Recommend_Yen.this, ShowMeTheMoney_Yen.class);
        ryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("y", y); //필요없나...?

                //계산된 각 화폐 개수들 넘겨주기
                Update_CointCount();

                startActivity(intent);
            }
        });
    }
}