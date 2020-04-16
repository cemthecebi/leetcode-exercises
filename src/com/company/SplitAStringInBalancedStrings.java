package com.company;

public class SplitAStringInBalancedStrings {

    public static void main(String[] args) throws Exception {
        System.out.println(balancedStringSplit("LLLLRRRR"));
    }

    public static int balancedStringSplit(String s) {
        char[] ch = s.toCharArray();
        int RCount = 0;
        int LCount = 0;
        int totalEqualCount = 0;
        for (int i = 0; i < ch.length; i++) {
            if (s.charAt(i) == 'R') {
                RCount++;
            } else {
                LCount++;
            }
            if (RCount == LCount) {
                totalEqualCount++;
            }
        }
        return totalEqualCount;
    }
}
