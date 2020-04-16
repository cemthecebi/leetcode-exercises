package com.company;

//1221. Split a String in Balanced Strings
public class SplitAStringInBalancedStrings {

    public static void main(String[] args) throws Exception {
        System.out.println(balancedStringSplit("LLLLRRRR"));
    }

    public static int balancedStringSplit(String s) {
        char[] ch = s.toCharArray();
        int rCount = 0;
        int lCount = 0;
        int totalEqualCount = 0;
        for (int i = 0; i < ch.length; i++) {
            if (s.charAt(i) == 'R') {
                rCount++;
            } else {
                lCount++;
            }
            if (rCount == lCount) {
                totalEqualCount++;
            }
        }
        return totalEqualCount;
    }
}
