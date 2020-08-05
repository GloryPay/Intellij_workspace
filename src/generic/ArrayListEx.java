package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        // 문자열만 삽입 가능한 ArrayList 컬렉션 생성
        ArrayList<String> list = new ArrayList<String>();

        // 키보드로 부터  4개의 이름 입력 받아 ArrayList에 삽입
        Scanner rd = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("이름을 입력하시오 : ");
            list.add(rd.next());
        }
/*
        // ArrayList에 들어 있는 모든 이름 출력

        Iterator<String> itor = list.iterator();
        while (itor.hasNext()) {
            System.out.print(itor.next() + " ");
        }
*/

        // use Enhanced for
        for (String name : list) {
            System.out.print(name + " ");
        }


        // 가장 긴 이름 출력
        int longistNameIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(longistNameIndex).length() < list.get(i).length()) {
                longistNameIndex = i;
            }
        }
        System.out.println("\n가장 긴 이름 : " + list.get(longistNameIndex));
    }
}
