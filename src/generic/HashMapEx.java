package generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapEx {

    public static void main(String[] args) {
        // 영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
        HashMap<String, String> dic = new HashMap<>();

        // 3개의 (key, value) 쌍을 dic 에 저장
        dic.put("love","사랑");
        dic.put("baby","아기");
        dic.put("apple","사과");

        // dic 컬렉션에 들어 있는 모든 (key, value) 쌍 출력
        Iterator<String> keys = dic.keySet().iterator();
        while (keys.hasNext()){
            String key = keys.next();
            System.out.println(String.format("key : %s\t value : %s", key, dic.get(key)));
        }

/*
        for(String word : dic.keySet()){
            System.out.println(String.format("key : %s\t value : %s",word,dic.get(word)));
        }
*/
        // 사용자로부터 영어 단어를 입력받고 한글 단어 검색

        System.out.print("찾을 단어를 입력하시오 : ");
        Scanner rd = new Scanner(System.in);
        String findWord = rd.next();
        //System.out.println(String.format("key : %s \t value : %s", findWord, dic.get(findWord)));
        System.out.printf("key : %s \t value : %s", findWord, dic.get(findWord));
    }

}
