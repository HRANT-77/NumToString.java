package com.company;

public class Main {

    public static void main(String[] args) {

        String ans = "";
        String hazar = "հազար ";
        String million = "միլիոն ";
        String milliard = "միլիարդ ";
        String trillion = "տրիլիոն ";
        String kvadrillion = "կվադրիլիոն ";

        long num = 913867792531107861L;
        String s = Long.toString(num);
        int size = s.length();

        if (s.length() > 0 & s.length() < 4) {
            ans = attributeStr(num);
        }
        if (s.length() > 3 & s.length() < 7) {
            ans = attributeStr(num / 1000) + " " + hazar;
            if (num - (num / 1000) * 1000 != 0) {
                ans = ans + attributeStr(num - (num / 1000) * 1000);
            }
        }
        if (s.length() > 6 & s.length() < 10) {
            ans = attributeStr(num / 1000000) + " " + million;
            if ((num / 1000) % 1000 != 0) {
                ans = ans + attributeStr((num / 1000) % 1000) + " " + hazar;
            }
            if (num % 1000 != 0) {
                ans = ans + attributeStr(num % 1000);
            }
        }
        if (s.length() > 9 & s.length() < 13) {
            ans = attributeStr(num / 1000000000) + " " + milliard;
            if ((num / 1000000) % 1000 != 0) {
                ans = ans + attributeStr((num / 1000000) % 1000) + " " + million;
            }
            if ((num / 1000) % 1000 != 0) {
                ans = ans + attributeStr((num / 1000) % 1000) + " " + hazar;
            }
            if (num % 1000 != 0) {
                ans = ans + attributeStr(num % 1000);
            }
        }
        if (s.length() > 12 & s.length() < 16) {
            ans=attributeStr(num/1000000000000L)+" "+trillion;
            if((num/1000000000)%1000!=0){
                ans=ans+attributeStr((num/1000000000)%1000)+" "+milliard;
            }
            if((num/1000000)%1000!=0){
                ans=ans+attributeStr((num/1000000)%1000)+" "+million;
            }
            if((num/1000)%1000!=0){
                ans=ans+attributeStr((num/1000)%1000)+" "+hazar;
            }
            if((num%1000)!=0){
                ans=ans+attributeStr(num%1000);
            }
        }
        if(s.length() > 15 & s.length() < 20){
            ans=attributeStr(num/1000000000000000L)+" "+kvadrillion;
            if((num/1000000000000L)%1000!=0){
                ans=ans+attributeStr((num/1000000000000L)%1000)+" "+trillion;
            }
            if((num/1000000000)%1000!=0){
                ans=ans+attributeStr((num/1000000000)%1000)+" "+milliard;
            }
            if((num/1000000)%1000!=0){
                ans=ans+attributeStr((num/1000000)%1000)+" "+million;
            }
            if((num/1000)%1000!=0){
                ans=ans+attributeStr((num/1000)%1000)+" "+hazar;
            }
            if((num%1000)!=0){
                ans=ans+attributeStr(num%1000);
            }
        }
        System.out.println(num);
        System.out.println(ans);
    }

    public static String attributeStr(long x) {
        String digit = "";
        String haryur = "հարյուր ";

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

        if (x / 100 > 0 & x / 100 != 1) {
            digit = mianish[(int) (x / 100)] + " " + haryur;
        }
        if (x / 100 == 1) {
            digit = haryur;
        }
        if ((x / 10) - (x / 100) * 10 != 1) {
            digit = digit + erknish[(int) ((x / 10) - (x / 100) * 10)];
        }
        if ((x / 10) - (x / 100) * 10 == 1 & x - (x / 10) * 10 > 0) {
            digit = digit + erknish[(int) ((x / 10) - (x / 100) * 10)] + "ն";
        }
        if ((x / 10) - (x / 100) * 10 == 1 & (x - (x / 10) * 10) == 0) {
            digit = digit + erknish[(int) ((x / 10) - (x / 100) * 10)];
        }
        if (x - (x / 10) * 10 > 0) {
            digit = digit + mianish[(int) (x - (x / 10) * 10)];
        }
        return digit;
    }
}
