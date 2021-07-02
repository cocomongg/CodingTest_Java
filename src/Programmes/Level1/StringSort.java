package Programmes.Level1;

import java.util.Arrays;
import java.util.Comparator;

//https://programmers.co.kr/learn/courses/30/lessons/12915

/*
* Interface Comparator: 정렬 가능한 클래스(Comparable 인터페이스를 구현한 클래스)들의 기본 정렬 기준과 다르게 정렬하고 싶을 때 사용
* 사용방법: compare()메서드를 오버라이드
* 객체 두개를 비교해서 음수, 0, 양수 리턴
* 음수 또는 0 이면 객체의 자리 그대로 유지, 양수인 경우에는 두 객체의 자리가 변경됨
* */
public class StringSort {
    //Test
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        String[] answer = solution(strings, n);
        for(String s : answer){
            System.out.println("s = " + s);
        }
    }

    //Solution
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<>(){
            @Override
            public int compare(String a, String b){ // ******
                Character first = a.charAt(n);
                Character second = b.charAt(n);
                if (first == second){
                    return a.compareTo(b);
                }
                return first < second ?  -1: (first == second ? 0:1);
            }

        });
        String[] answer = new String[strings.length];
        for(int i=0; i<strings.length; ++i){
            answer[i] = strings[i];
        }
        return answer;
    }
}
