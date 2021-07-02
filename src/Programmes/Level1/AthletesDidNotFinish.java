package Programmes.Level1;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42576

/*
* Arrays.sort(배열) -> 배열 sort
* 문자열1.equals(문자열2) -> 문자열1과 문자열2가 같은지 비교
* 문자열1 == 문자열2 -> 문자열은 참조형이기 때문에 '==' 비교 연산자는 두 문자열 변수의 주소값을 비교
* */

public class AthletesDidNotFinish {
    // Test
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution(participant, completion));
    }

    //Solution
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        boolean check = false;
        for(int i=0; i<completion.length; ++i){
            if (!participant[i].equals(completion[i])){ // *********
                answer += participant[i];
                check = true;
                break;
            }
        }
        if (!check){
            answer += participant[participant.length-1];
        }

        return answer;
    }
}
