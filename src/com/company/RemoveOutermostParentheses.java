package com.company;

public class RemoveOutermostParentheses {

    public static void main(String[] args) throws Exception {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String S) {
        char[] pchar = S.toCharArray();
        int start = 0;
        int end = 0;
        boolean isStart = false;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < pchar.length; i++) {
            if (pchar[i] == '(') {
                ++start;
                isStart = true;
            } else if (pchar[i] == ')') {
                ++end;
                isStart = false;
            }
            if (start == end) {
                start = 0;
                end = 0;
            }
            if (start > 1) {
                if (isStart) {
                    result.append('(');
                } else {
                    result.append(')');
                }
            }
        }
        return result.toString();
    }
}
