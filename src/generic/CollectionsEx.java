package generic;

import java.awt.*;
import java.util.Collections;
import java.util.LinkedList;

// Collections 클래스를 활용하여 쿤자열 정렬, 반대로 정렬, 이진 탐색 등을 실행하는 사례
public class CollectionsEx {

    static void printList(LinkedList<String> list){

        for (String name : list){
            if (name == list.getLast()) {
                System.out.println(name);
                break;
            }
            System.out.print(name + " -> ");
        }

    }



    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("트랜스포머");
        list.add("스타워즈");
        list.add("매트릭스");
        list.add(0,"터미네이터");
        list.add(2,"아바타");

        printList(list);

        // Collections 클래스 이용한 sort
        Collections.sort(list);
        printList(list);

        // Collections 클래스 이용한 reverse
        Collections.reverse(list);
        printList(list);

        // Collections 클래스 이용한 이진탐색
        int index = Collections.binarySearch(list, "아바타");
        System.out.println("아바타의 index : " + index);
    }

}
