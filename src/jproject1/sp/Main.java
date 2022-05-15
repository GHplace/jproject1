package jproject1.sp;

public class Main {

    public static void main(String[] args) {
//work1
        int Box1 = 7;
        long Box2 = 7L;
        short Box3 = 7;
        byte Box4 = 7;
        float Box5 = 7.7f;
        double Box6 = 7.7;
        boolean Box7 = Box1 < 10;
        char B = 35;
        System.out.println(B);
        System.out.println(Box7);

//work2
        float B1 = 78.2f;
        float B2 = 82.7f;
        float BR = B1 - B2;
        float BS = B1 + B2;
        System.out.println( "Разница в весе двух бойцов = " + BR);
        System.out.println( "Сумма в весе двух бойцов = " + BS);

//work3
        int WBananas = 80;
        int ABananas = 5;
        int WMilk = 105;
        int AMilk = 2;
        int WIceCrime = 100;
        int AIceCrime = 2;
        int WEggs = 70;
        int AEggs = 4;
        var Sum = WBananas * ABananas + AMilk * WMilk + WIceCrime * AIceCrime + WEggs * AEggs;
        int grPerKg = 1000;
        float Weight = Sum/(float)grPerKg;
        System.out.println(Sum); //Вес завтрака в граммах
        System.out.println(Weight); //Вес завтрака в килограммах

//work 4
        int amountWKg = 7;
        int weight1Gr = 250;
        int weight2Gr = 500;
        int Per = 1000;
        int amountWGr = amountWKg*Per;
        int Days1 = amountWGr/weight1Gr;
        int Days2 = amountWGr/weight2Gr;
        int DeltaDays = (Days1+Days2)/2;
        System.out.println(Days1 +" дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(Days2 +" дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println(DeltaDays +" дней в среднем может потребоваться, чтобы добиться результата похудения");

//work 5
        int zpM = 67_760;
        int zpD = 83_690;
        int zpK = 76_230;
        int increaseZP = 10; //процент
        int newZpM = zpM/100*increaseZP + zpM;
        int growthZpM = newZpM*12 - zpM*12;
        int newZpD = zpD/100*increaseZP + zpD;
        int growthZpD = newZpD*12 - zpD*12;
        int newZpK = zpK/100*increaseZP + zpK;
        int growthZpK = newZpK*12 - zpK*12;
        System.out.println("Маша теперь получает - " + newZpM + "рублей. Годовой доход вырос - " + growthZpM + "рублей.");
        System.out.println("Денис теперь получает - " + newZpD + "рублей. Годовой доход вырос - " + growthZpD + "рублей.");
        System.out.println("Кристина теперь получает - " + newZpK + "рублей. Годовой доход вырос - " + growthZpK + "рублей.");

    }}