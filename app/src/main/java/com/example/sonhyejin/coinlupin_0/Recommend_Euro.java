package com.example.sonhyejin.coinlupin_0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Recommend_Euro extends AppCompatActivity {

    public Button reBtn;
    public TextView payEuro;
    Intent intent;

    //동전개수 TextView
    public TextView pE1, pE2, pE3, pE4 ,pE5, pE6, pE7, pE8, pE9, pE10, pE11, pE12, pE13, pE14, pE15;

    //설계문서와 변수 선언 다름
    int[] E = new int[15];  //동전개수, SP에서 가져다 쓸 것임, for문을 돌리기 위해 변경
    int[] E2 = {1,2,5,10,20,50,100,200,500,1000,2000,5000,10000,20000,50000};   //해당 동전 액수
    int[] rE = new int[15]; //추천동전개수

    public void Update_CoinCount(){    //설계문서와 인수 설정이 다를 듯 함
<<<<<<< HEAD
        //SP의 값을 갱신해야함
=======
        //SP의 값 갱신
>>>>>>> b3de9e77c16962979b3bf8220a702658bb77f890
        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = shared.edit();
        edit.putInt("cent1",E[0]-rE[0]);
        edit.putInt("cent2",E[1]-rE[1]);
        edit.putInt("cent5",E[2]-rE[2]);
        edit.putInt("cent10",E[3]-rE[3]);
        edit.putInt("cent20",E[4]-rE[4]);
        edit.putInt("cent50",E[5]-rE[5]);
        edit.putInt("cent100",E[6]-rE[6]);
        edit.putInt("cent200",E[7]-rE[7]);
        edit.putInt("cent500",E[8]-rE[8]);
        edit.putInt("cent1000",E[9]-rE[9]);
        edit.putInt("cent2000",E[10]-rE[10]);
        edit.putInt("cent5000",E[11]-rE[11]);
        edit.putInt("cent10000",E[12]-rE[12]);
        edit.putInt("cent20000",E[13]-rE[13]);
        edit.putInt("cent50000",E[14]-rE[14]);
        edit.apply();
    }

    public void CalculateCoin(int howmuch){ //추천 동전계산 함수
        for(int i=0; i<15; i++){
            if(E[i] == 0){  //동전 없음
                rE[i] = E[i];
            }else if(howmuch > 0){  //동전 있고, 지불 금액 남음
                if(howmuch >= E[i]*E2[i]){  //해당 동전을 전부 사용 가능하면
                    rE[i] = E[i];
                    howmuch -= E[i]*E2[i];
                }else{  //해당 동전 일부만 내야 하면
                    for(int j=0; j<E[i]; j++){
                        howmuch -= E2[i];
                        if(howmuch<= 0){
                            rE[i] = j+1;
                            //j=E[i];
                            break;
                        }
                    }
                }
            }else{  //지불 금액 안 남음
                rE[i] = 0;
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend__euro);

        reBtn = (Button) findViewById(R.id.reBtn);  //버튼 객체를 레이아웃과 연결

        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        E[0] = shared.getInt("cent1", -1);  //값 받음
        E[1] = shared.getInt("cent2", -1);
        E[2] = shared.getInt("cent5", -1);
        E[3] = shared.getInt("cent10", -1);
        E[4] = shared.getInt("cent20", -1);
        E[5] = shared.getInt("cent50", -1);
        E[6] = shared.getInt("cent100", -1);
        E[7] = shared.getInt("cent200", -1);
        E[8] = shared.getInt("cent500", -1);
        E[9] = shared.getInt("cent1000", -1);
        E[10] = shared.getInt("cent2000", -1);
        E[11] = shared.getInt("cent5000", -1);
        E[12] = shared.getInt("cent10000", -1);
        E[13] = shared.getInt("cent20000", -1);
        E[14] = shared.getInt("cent50000", -1);

        intent = getIntent();

        int eIN = intent.getIntExtra("eIN",0); //Pay화면에서 키값 'eIN'로 값 전달 받기
        int eDE = intent.getIntExtra("eDE",0); //Pay화면에서 키값 'eDE'로 값 전달 받기

        payEuro = (TextView) findViewById(R.id.payEuro);    //총액 표시 텍스트 뷰 연결
        //동전 텍스트 뷰랑 연결시키기
        pE1 = (TextView) findViewById(R.id.Rcoin1);
        pE2 = (TextView) findViewById(R.id.Rcoin2);
        pE3 = (TextView) findViewById(R.id.Rcoin3);
        pE4 = (TextView) findViewById(R.id.Rcoin4);
        pE5 = (TextView) findViewById(R.id.Rcoin5);
        pE6 = (TextView) findViewById(R.id.Rcoin6);
        pE7 = (TextView) findViewById(R.id.Rcoin7);
        pE8 = (TextView) findViewById(R.id.Rcoin8);
        pE9 = (TextView) findViewById(R.id.Rcoin9);
        pE10 = (TextView) findViewById(R.id.Rcoin10);
        pE11 = (TextView) findViewById(R.id.Rcoin11);
        pE12 = (TextView) findViewById(R.id.Rcoin12);
        pE13 = (TextView) findViewById(R.id.Rcoin13);
        pE14 = (TextView) findViewById(R.id.Rcoin14);
        pE15 = (TextView) findViewById(R.id.Rcoin15);

        String eIN2 = Integer.toString(eIN);    //넘어온 값이 integer값이라 string형으로 변환
        String eDE2 = Integer.toString(eDE);

        payEuro.setText(eIN2+"."+eDE2); //총액표시

        CalculateCoin(eIN*100+eDE); //추천 동전 개수 계산 함수 호출

        //동전개수 표시하기
        pE1.setText(Integer.toString(rE[0]));
        pE2.setText(Integer.toString(rE[1]));
        pE3.setText(Integer.toString(rE[2]));
        pE4.setText(Integer.toString(rE[3]));
        pE5.setText(Integer.toString(rE[4]));
        pE6.setText(Integer.toString(rE[5]));
        pE7.setText(Integer.toString(rE[6]));
        pE8.setText(Integer.toString(rE[7]));
        pE9.setText(Integer.toString(rE[8]));
        pE10.setText(Integer.toString(rE[9]));
        pE11.setText(Integer.toString(rE[10]));
        pE12.setText(Integer.toString(rE[11]));
        pE13.setText(Integer.toString(rE[12]));
        pE14.setText(Integer.toString(rE[13]));
        pE15.setText(Integer.toString(rE[14]));

        intent = new Intent(Recommend_Euro.this, ShowMeTheMoney_Euro.class);

        reBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //계산된 각 화폐 개수들 넘겨주기
                Update_CoinCount();

                startActivity(intent);
            }
        });
    }
}
