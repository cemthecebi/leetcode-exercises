package com.company;

public class FirstBadVersion {

    public static void main(String[] args) throws Exception {

        System.out.println(firstBadVersion(5));
    }

    static boolean isBadVersion(int version) {
        if (version == 4) return true;
        return false;
    }

    public static int firstBadVersion(int n) {
        int L = 1;
        int R = n;
        while (L < R) {
            int mid = L + (R - L) / 2;
            if (isBadVersion(mid)) {
                R = mid;
            } else {
                L = mid + 1;
            }
        }
        return L;
    }
}
