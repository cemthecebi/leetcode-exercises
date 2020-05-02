package com.company;

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();
        int jewelCount = 0;

        for (int i = 0; i < jewels.length; i++) {
            for (int j = 0; j < stones.length; j++) {
                if (jewels[i] == stones[j]) {
                    jewelCount++;
                }
            }
        }
        return jewelCount;
    }
}
