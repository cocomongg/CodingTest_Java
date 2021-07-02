package Programmes.Level1;

import java.util.ArrayList;
import java.util.Collections;

//https://programmers.co.kr/learn/courses/30/lessons/12910

/*
* Collections.sort()와 Arrays.sort()의 차이
* Collections.sort() -> 컬렉션 객체를 정렬 (컬렉션 종류: List, Set, Map)
* Arrays.sort() -> 배열을 정렬
* */
public class DivisibleArray {
    //Test
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        ArrayList<Integer> answer = solution(arr, divisor);

        System.out.println("answer = " + answer);
    }

    //Solution
    public static ArrayList<Integer> solution(int[] arr, int divisor) {
        // int[] answer = new int[arr.length];
        ArrayList<Integer> answer = new ArrayList<>();
        Boolean check = false;

        for(Integer item : arr){
            if (item % divisor == 0){
                answer.add(item);
                check = true;
            }
        }
        if (!check){
            answer.add(-1);
            return answer;
        }
        Collections.sort(answer); // *********
        return answer;
    }
}
