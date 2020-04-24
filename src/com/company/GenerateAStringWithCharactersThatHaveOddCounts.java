package com.company;

public class GenerateAStringWithCharactersThatHaveOddCounts {

    public static void main(String[] args) throws Exception {
        System.out.println(generateTheString(5));
    }

    public static String generateTheString(int n) {
        StringBuilder transformed = new StringBuilder();

        int occurCount = n;
        if (n % 2 == 0) {
            transformed.append("m");
            occurCount -=1;
        }
        transformed.append("c".repeat(Math.max(0, occurCount)));
        return transformed.toString();
    }
}
