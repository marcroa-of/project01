package main;

public class Numbers {

    public static void main(String[] args) {
        CompareInt compareInt = new CompareInt(2);
        System.out.println(compareInt.compareTo(0));

        StringConverter stringConverter = new StringConverter();
        System.out.println(stringConverter.ConvertStringToDouble("    -2.3"));


        RomanNumbers romanNumbers = new RomanNumbers();
        System.out.println(romanNumbers.convertToRoman(42));


    }


}
