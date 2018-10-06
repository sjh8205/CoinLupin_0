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
    public TextView pE1;
    public TextView pE2;
    public TextView pE3;
    public TextView pE4;
    public TextView pE5;
    public TextView pE6;
    public TextView pE7;
    public TextView pE8;
    public TextView pE9;
    public TextView pE10;
    public TextView pE11;
    public TextView pE12;
    public TextView pE13;
    public TextView pE14;
    public TextView pE15;

    Home_ChooseCountry hc = new Home_ChooseCountry();   //만들어진 SP를 사용하기 위해 객체 선언, SP최초로 선언해준 java파일 이름으로 대체하면 됨

//    int E1,E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15;    //
//    int rE1, rE2, rE3, rE4, rE5, rE6, rE7, rE8, rE9, rE10, rE11, rE12, rE13, rE14, rE15;    //추천 동전 개수

    //설계문서와 변수 선언 다름
    int[] E = new int[15];  //동전개수, SP에서 가져다 쓸 것임, for문을 돌리기 위해 변경
    int[] E2 = {1,2,5,10,20,50,100,200,500,1000,2000,5000,10000,20000,50000};   //해당 동전 액수
    int[] rE = new int[15]; //추천동전개수

    public void Update_CointCount(){    //설계문서와 인수 설정이 다를 듯 함
        //SP의 값을 갱신해야함
        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = shared.edit();
        edit.putInt("E1",E[0]-rE[0]);
        edit.putInt("E2",E[1]-rE[1]);
        edit.putInt("E3",E[2]-rE[2]);
        edit.putInt("E4",E[3]-rE[3]);
        edit.putInt("E5",E[4]-rE[4]);
        edit.putInt("E6",E[5]-rE[5]);
        edit.putInt("E7",E[6]-rE[6]);
        edit.putInt("E8",E[7]-rE[7]);
        edit.putInt("E9",E[8]-rE[8]);
        edit.putInt("E10",E[9]-rE[9]);
        edit.putInt("E11",E[10]-rE[10]);
        edit.putInt("E12",E[11]-rE[11]);
        edit.putInt("E13",E[12]-rE[12]);
        edit.putInt("E14",E[13]-rE[13]);
        edit.putInt("E15",E[14]-rE[14]);
        //edit.putFloat("Total_money",)////////////////total 갱신 해야함
        edit.apply();
    }

    public void CalculateCoin(int howmuch){ //동전계산 함수, 테스트 후 보완이 필요함
        for(int i=0; i<15; i++){
            //howmuch -= E[i]*E2[i];  //동전 개수 * 동전 액수
            if (howmuch - E[i]*E2[i]>0){    //양의 값
                howmuch -= E[i]*E2[i];
                rE[i] = E[i];
            }else if(howmuch == E[i]*E2[i]){    //잔액이 0이 될 떄
                howmuch -= E[i]*E2[i];
                rE[i] = E[i];
                break;
            }else{
                for(int j=0;j<E[i];j++){
                    howmuch-=E2[i];
                    if(howmuch<0)
                        rE[i]=j;
                    //잔돈 나오는거....생각해서 더해줘야져
                }
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend__euro);

        reBtn = (Button) findViewById(R.id.reBtn);
        SharedPreferences shared = getSharedPreferences("name", Context.MODE_PRIVATE);

        E[0] = shared.getInt("euro1", -1);  //값 받음
        E[1] = shared.getInt("euro2", -1);
        E[2] = shared.getInt("euro5", -1);
        E[3] = shared.getInt("euro10", -1);
        E[4] = shared.getInt("euro20", -1);
        E[5] = shared.getInt("euro50", -1);
        E[6] = shared.getInt("euro100", -1);
        E[7] = shared.getInt("euro200", -1);
        E[8] = shared.getInt("euro500", -1);
        E[9] = shared.getInt("euro1000", -1);
        E[10] = shared.getInt("euro2000", -1);
        E[11] = shared.getInt("euro5000", -1);
        E[12] = shared.getInt("euro10000", -1);
        E[13] = shared.getInt("euro20000", -1);
        E[14] = shared.getInt("euro50000", -1);

        intent = getIntent();

        int eIN = intent.getIntExtra("eIN",0);
        int eDE = intent.getIntExtra("eDE",0);

        payEuro = (TextView) findViewById(R.id.payEuro);
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

        //넘어온 화폐 개수 받기
        //화폐 개수대로....
        CalculateCoin(eIN*10+eDE);

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
                intent.putExtra("eIN",eIN); //필요없나...?
                intent.putExtra("eDE",eDE);

                //계산된 각 화폐 개수들 넘겨주기
                Update_CointCount();

                startActivity(intent);
            }
        });
    }
}
