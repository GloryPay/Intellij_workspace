package generic;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {

        // Integer type Vector 생성
        Vector<Integer> v = new Vector<Integer>();

        // Vector v에 값 삽입
        v.add(5);
        v.add(4);
        v.add(-1);

        // Vector 기준 중간에 삽입
        v.add(2, 100);

        System.out.println("Vector 내의 요소 객체의 수 : " + v.size());         // 크기 = 4
        System.out.println("Vector 현재 용량 : " + v.capacity());             // Vector의 디폴트 용량 10

        // 모든 정수 요소 출력 use Iterator
    /*
        Iterator<Integer> itor = v.iterator();
        while(itor.hasNext()){
            System.out.println(itor.next());
        }
    */

        // 모든 정수 요소 출력 use Enhanced for
        for (Integer e : v) {
            System.out.println(e);
        }

        // Vector 내 모든 정수 더하기
        int sum = 0;
        for (Integer e : v) {
            sum += e;
        }
        System.out.println("Vector 내 정수 합 : " + sum);

    }
}
