package Programmes.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12903

import java.util.Collections;

/*
* substring(from, to) -> from부터 to-1까지 문자열을 자른다.
* */
public class GetMidChar {
    //Test
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution(s));
    }

    //Solution
    public static String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 0){ //짝수
            answer += s.substring(s.length() / 2 - 1, s.length() / 2+1);// *********

        }
        else{ //홀수
            answer += s.charAt(s.length()/2);
        }
        return answer;
    }
}
