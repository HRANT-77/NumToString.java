package com.company;

public class Main1 {
    public static void main(String[] args) {

        String hazar="հազար ";
        String million="միլիոն ";
        String milliard="միլիարդ ";
        String trillion="տրիլիոն ";
        String kvadrillion="կվադրիլիոն ";

        System.out.println(attributeStr(3));
        System.out.println(attributeStr(13));
        System.out.println(attributeStr(213));
        System.out.println(attributeStr(103));
        System.out.println(attributeStr(110));
        System.out.println(attributeStr(30));
        System.out.println(attributeStr(800));

    }

    public static String attributeStr(int x) {
        String digit = "";

        String[] mianish = new String[10];
        mianish[0] = "";
        mianish[1] = "մեկ";
        mianish[2] = "երկու";
        mianish[3] = "երեք";
        mianish[4] = "չորս";
        mianish[5] = "հինգ";
        mianish[6] = "վեց";
        mianish[7] = "յոթ";
        mianish[8] = "ութ";
        mianish[9] = "ինը";

        String[] erknish = new String[10];
        erknish[0] = "";
        erknish[1] = "տաս";
        erknish[2] = "քսան";
        erknish[3] = "երեսուն";
        erknish[4] = "քառասուն";
        erknish[5] = "հիսուն";
        erknish[6] = "վաթսուն";
        erknish[7] = "յոթասուն";
        erknish[8] = "ութսուն";
        erknish[9] = "իննսուն";

        String haryur = "հարյուր ";

        if (x / 100 > 0 & x / 100 != 1) {
            digit = mianish[x / 100] +" "+ haryur;
        }
        if(x/100==1){
            digit=haryur;
        }
        if ((x / 10) - (x / 100) * 10 != 1) {
            digit = digit + erknish[(x / 10) - (x / 100) * 10];
        }
        if ((x / 10) - (x / 100) * 10 == 1 & x - (x / 10) * 10 > 0) {
            digit = digit + erknish[(x / 10) - (x / 100) * 10] + "ն";
        }
        if ((x / 10) - (x / 100) * 10 == 1 & (x - (x / 10) * 10) == 0) {
            digit = digit + erknish[(x / 10) - (x / 100) * 10];
        }
        if (x - (x / 10) * 10 > 0) {
            digit = digit + mianish[x - (x / 10) * 10];
        }
        return digit;
    }
}
