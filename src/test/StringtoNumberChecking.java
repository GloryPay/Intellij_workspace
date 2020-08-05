package test;

// 문자열을 받아서 숫자 인지 판별

import java.util.Scanner;

public class StringtoNumberChecking {

    Scanner rd = new Scanner(System.in);
    String checkingString;


    void inputString() {
        System.out.print("숫자를 입력하시오 >> ");
        checkingString = rd.next();

//        check Askii 번호
//        System.out.println((int)checkingString.charAt(0));

    }

    // 숫자 0 ~ 9   =>    Askii 코드값 48 ~ 57
    public boolean numberToAsciiChecking(String a) {
        char tempChar;
        int dotcount = 0;
        boolean result = true;

        for (int i = 0; i < a.length(); i++) {
            tempChar = a.charAt(i);         // 입력 받은 문자열을 문자 단위로 검사

            // 아스키코드 48 ~ 57 이면 0 ~ 9 사이의 문자
            if ((int) tempChar < 48 || (int) tempChar > 57) {

                // . 의 개수가 하나 넘으면 숫자가 아니다
                if (tempChar != '.' || dotcount > 0) {
                    result = false;
                    break;
                } else {
                    dotcount++;
                }
            }

        }

        return result;
    }

    boolean numbertoisDigitChecking(String a) {
        char tempChar;

        for (int i = 0; i < a.length(); i++) {
            tempChar = a.charAt(i);

            if (Character.isDigit(tempChar) == false) {
                return false;
            }
        }


        return true;
    }

    void show() {

        inputString();

        //if (numberToAsciiChecking(checkingString)) {
        if (numbertoisDigitChecking(checkingString)) {
            System.out.println(" 숫자 입니다.");
        } else {
            System.out.println("숫자가 아닙니다.");
        }
    }


    public static void main(String[] args) {
        new StringtoNumberChecking().show();
    }
}
