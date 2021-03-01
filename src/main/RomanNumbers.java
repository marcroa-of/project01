package main;

/*
* Started at 14:50
* Finished at 16:03
* 1h 13m
* */
public class RomanNumbers {

    public String convertToRoman(Integer arabic) {
        StringBuilder sb = new StringBuilder();
        int mTimes = (arabic / 1000);
        arabic -= mTimes * 1000;
        for (int i = 0; i < mTimes; i++) sb.append("M");
        int dTimes = (arabic / 500);
        arabic -= dTimes * 500;
        for (int i = 0; i < dTimes; i++) sb.append("D");
        int cTimes = (arabic / 100);
        arabic -= cTimes * 100;
        for (int i = 0; i < cTimes; i++) sb.append("C");
        int lTimes = (arabic / 50);
        arabic -= lTimes * 50;
        for (int i = 0; i < lTimes; i++) sb.append("L");
        int xTimes = (arabic / 10);
        arabic -= xTimes * 10;
        for (int i = 0; i < xTimes; i++) sb.append("X");
        int vTimes = (arabic / 5);
        arabic -= vTimes * 5;
        for (int i = 0; i < vTimes; i++) sb.append("V");
        int iTimes = (arabic);
        for (int i = 0; i < iTimes; i++) sb.append("I");
        String result = sb.toString()
                .replace("VIIII", "IX")
                .replace("IIII", "IV")
                .replace("LXXXX", "XC")
                .replace("XXXX", "XL")
                .replace("DCCCC", "CM")
                .replace("CCCC", "CD");
        System.out.println(result);
        return result;
    }
}
