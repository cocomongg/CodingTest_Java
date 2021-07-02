package Programmes.Level1;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42748

//  Arrays.copyOfRange(원본배열, from, to) -> 원본배열을 from부터 to-1까지 복사된 배열을 반환
public class Kth_number {
    //Test
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = solution(array, commands);
        for(int a: answer){
            System.out.println(a);
        }
    }

    //Solution
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i < commands.length; ++i){
            int first = commands[i][0];
            int last = commands[i][1];
            int pos = commands[i][2];

            int[] result = Arrays.copyOfRange(array, first-1, last); // *********
            Arrays.sort(result);
            answer[i] = result[pos-1];
        }

        return answer;
    }
}
