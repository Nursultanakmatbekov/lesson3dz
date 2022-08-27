package com.companyp;

public class Main {
    public static void main(String[] args) {

        double[] myList = {1.1, 1.2, -1.3, 1.4, 31.5, 1.6, -15.7, 1.8, -1.9, 12.0, -2.1, 12.2, -2.3, 2.4, -2.5};
        double result = 0;
        int a =0;
        boolean b = false;
        for (double nums : myList) {
            if (nums < 0) {
                b = true;
            } else if (b) {
                result += nums;
                a++;
            }
        }
        System.out.println(result);
        System.out.println(a);
        System.out.println("Средняя арифметическое число " +  result / a);

    }

}