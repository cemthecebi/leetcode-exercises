package com.company;

public class RobotReturnToOrigin {

    public static void main(String[] args) throws Exception {

        System.out.println(judgeCircle("UDDUURLRLLRRUDUDLLRLURLRLRLUUDLULRULRLDDDUDDDDLRRDDRDRLRLURRLLRUDURULULRDRDLURLUDRRLRLDDLUUULUDUUUUL"));
    }

    public static boolean judgeCircle(String moves) {
        char[] charMoves = moves.toCharArray();

        int resultY = 0;
        int resultX = 0;
        for (int i = 0; i < charMoves.length; i++) {
            if (charMoves[i] == 'U') {
                resultY += 1;
            } else if (charMoves[i] == 'D') {
                resultY += -1;
            }else if (charMoves[i] == 'R') {
                resultX += 1;
            }else if (charMoves[i] == 'L') {
                resultX += -1;
            }
        }
        return resultX == 0 && resultY ==0;
    }
}
