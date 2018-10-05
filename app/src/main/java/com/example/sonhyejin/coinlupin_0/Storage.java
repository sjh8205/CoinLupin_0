package com.example.sonhyejin.coinlupin_0;

public class Storage {

    boolean EorY = true;

    int UserBudget;
    int cent_1, cent_2, cent_5, cent_10, cent_20,
            cent_50, euro_1, euro_2, euro_5, euro_10,
            euro_20, euro_50, euro_100, euro_200, euro_500;
    int yen_1, yen_5, yen_10, yen_50, yen_100,
            yen_500, yen_1000, yen_2000, yen_5000, yen_10000;

    public Storage(int E1, int E2, int E5, int E10, int E20,
                   int E50, int E100, int E200, int E500, int E1000,
                   int E2000, int E5000, int E10000, int E20000, int E50000,
                   int Y1, int Y5, int Y10, int Y50, int Y100,
                   int Y500, int Y1000, int Y2000, int Y5000, int Y10000){

        if(EorY==true){
            this.cent_1 = E1;
            this.cent_2 = E2;
            this.cent_5 = E5;
            this.cent_10 = E10;
            this.cent_20 = E20;
            this.cent_50 = E50;
            this.euro_1 = E100;
            this.euro_2 = E200;
            this.euro_5 = E500;
            this.euro_10 = E1000;
            this.euro_20 = E2000;
            this.euro_50 = E5000;
            this.euro_100 = E10000;
            this.euro_200 = E20000;
            this.euro_500 = E50000;
        }else{
            this.yen_1 = Y1;
            this.yen_5 = Y5;
            this.yen_10 = Y10;
            this.yen_50 = Y50;
            this.yen_100 = Y100;
            this.yen_500 = Y500;
            this.yen_1000 = Y1000;
            this.yen_2000 = Y2000;
            this.yen_5000 = Y5000;
            this.yen_10000 = Y10000;
        }
    }


}
