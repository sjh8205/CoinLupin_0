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
    public TextView pY1, pY2, pY3, pY4, pY5, pY6, pY7, pY8, pY9, pY10;

    //설계문서와 변수 선언 다름
    int[] Y = new int[10];  //동전개수, SP에서 가져다 쓸 것임, for문을 돌리기 위해 변경
    int[] Y2 = {1, 5, 10, 50, 100, 500, 1000, 2000, 5000, 10000};    //해당 동전 액수
    int[] rY = new int[10]; //추천 동전 개수

    public void Update_CoinCount(int y1,int y2,int y3,int y4,int y5,int y6,int y7,int y8,int y9,int y10) {    //설계문서와 인수 설정이 다를 듯 함
        //SP의 값을 갱신해야함
        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = shared.edit();
        edit.putInt("yen1", y1);
        edit.putInt("yen5", y2);
        edit.putInt("yen10", y3);
        edit.putInt("yen50", y4);
        edit.putInt("yen100", y5);
        edit.putInt("yen500", y6);
        edit.putInt("yen1000", y7);
        edit.putInt("yen2000", y8);
        edit.putInt("yen5000", y9);
        edit.putInt("yen10000", y10);
        edit.apply();
    }

    public void CalculateCoin(int howmuch) { //동전계산 함수, 테스트 후 보완이 필요함
        int original = howmuch; //밑에서 값을 다시 사용하기 위해 저장
        for(int i=0; i<10; i++){
            if(Y[i] == 0){  //동전 없음
                rY[i] = Y[i];
            }else if(howmuch > 0){  //동전 있고, 지불 금액 남음
                if(howmuch >= Y[i]*Y2[i]){  //해당 동전을 전부 사용 가능하면
                    rY[i] = Y[i];
                    howmuch -= Y[i]*Y2[i];
                }else{  //해당 동전 일부만 내야 하면
                    for(int j=0; j<Y[i]; j++){
                        howmuch -= Y2[i];
                        if(howmuch<= 0){
                            rY[i] = j+1;
                            //j=E[i];
                            break;
                        }
                    }
                }
            }else{  //지불 금액 안 남음
                rY[i] = 0;
            }
        }

        int recommand=0;    //추천 동전 총액 계산

        for(int i=0; i<10; i++){    //추천 지불 금액의 총액 계산
            recommand += rY[i]*Y2[i];
        }

        if(recommand>original){ //지불 금액의 총액을 넘을 경우
            int gap = recommand - original;
            for(int i=0; i<10; i++){
                if(rY[9-i] !=0 && gap >= Y2[9-i]) {    //해당 화폐가 추천 되었고, gap이 해당 화폐값보다 큰 화폐의 경우에만 고려
                    if(gap >= rY[9-i]*Y2[9-i]){  //해당 동전을 전부 사용 가능하면
                        rY[9-i] =0;
                        gap -= rY[9-i]*Y2[9-i];
                        //Toast.makeText(Recommend_Euro.this, "a "+Integer.toString(gap), Toast.LENGTH_LONG).show(); //gap값이 제대로 나오는지 확인하기 위한 코드
                    }else{  //해당 동전 일부만 내야 하면
                        for(int j=0; j<rY[9-i]; j++){
                            if(gap>=Y2[9-i]){  //해당 동전값을 하나씩 빼가면서
                                rY[9-i]--;
                                gap -=Y2[9-i];
                            }else{
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend__yen);

        ryBtn = (Button) findViewById(R.id.ryBtn);  //버튼 객체를 레이아웃과 연결

        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        Y[0] = shared.getInt("yen1", 0);  //값 받음
        Y[1] = shared.getInt("yen5", 0);
        Y[2] = shared.getInt("yen10", 0);
        Y[3] = shared.getInt("yen50", 0);
        Y[4] = shared.getInt("yen100", 0);
        Y[5] = shared.getInt("yen500", 0);
        Y[6] = shared.getInt("yen1000", 0);
        Y[7] = shared.getInt("yen2000", 0);
        Y[8] = shared.getInt("yen5000", 0);
        Y[9] = shared.getInt("yen10000", 0);

        intent = getIntent();

        int y = intent.getIntExtra("y", 0); //Pay화면에서 키값 'y'로 값 전달 받기

        payYen = (TextView) findViewById(R.id.payYen);    //총액 표시 텍스트 뷰 연결
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

        CalculateCoin(y); //추천 동전 개수 계산 함수 호출

        //동전개수 표시하기
        pY1.setText(Integer.toString(rY[0]));
        pY2.setText(Integer.toString(rY[1]));
        pY3.setText(Integer.toString(rY[2]));
        pY4.setText(Integer.toString(rY[3]));
        pY5.setText(Integer.toString(rY[4]));
        pY6.setText(Integer.toString(rY[5]));
        pY7.setText(Integer.toString(rY[6]));
        pY8.setText(Integer.toString(rY[7]));
        pY9.setText(Integer.toString(rY[8]));
        pY10.setText(Integer.toString(rY[9]));

        intent = new Intent(com.example.sonhyejin.coinlupin_0.Recommend_Yen.this, ShowMeTheMoney_Yen.class);
        ryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //계산된 각 화폐 개수들 넘겨주기
                Update_CoinCount(Y[0] - rY[0],Y[1] - rY[1],Y[2] - rY[2],Y[3] - rY[3],Y[4] - rY[4],Y[5] - rY[5],Y[6] - rY[6],Y[7] - rY[7],Y[8] - rY[8],Y[9] - rY[9]);

                startActivity(intent);
            }
        });
    }
}