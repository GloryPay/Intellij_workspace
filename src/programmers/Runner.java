/*

수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
입출력 예
participant	completion	return
[leo, kiki, eden]	[eden, kiki]	leo
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
[mislav, stanko, mislav, ana]

 */


package programmers;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class Runner {

    void main() {

        String p1[] = {"mislav", "stanko", "mislav", "ana"};
        String c1[] = {"stanko", "ana", "mislav"};

        System.out.println(solution(p1, c1));

    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";

//        for (int i = 0; i < participant.length; i++) {
//
//            for (int j = 0; j < completion.length; j++) {
//                if (participant[i].equals(completion[j])) {
//                    completion[j] = "";
//                    break;
//                }
//                if (participant[i] != "" && j == completion.length - 1) {
//                    return participant[i];
//                }
//            }
//
//        }

        HashMap<String, Integer> A = new HashMap<>();

        System.out.println(A);
        for (String a : participant) {

          A.put(a ,A.getOrDefault(a,0)+1);
          // getOrDefault(key, defaultValue)  - key 값이 존재하면 키의값을 반환하고, 없으면 defaultValue을 반환한다.

//            if (A.containsKey(a)) {
//                A.put(a,A.get(a)+1 );
//            }
//            else {
//                A.put(a, 1);
//            }

        }

        System.out.println(A);
        for (String a : completion) {
            A.put(a, A.get(a)-1);
        }

        System.out.println(A);

        for (String key : A.keySet()) {
            if (A.get(key) != 0) {
                answer = key;
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        new Runner().main();
    }


}

