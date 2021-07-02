package Programmes.Level1;

//https://programmers.co.kr/learn/courses/30/lessons/68644

/*
* TreeSet -> Set인터페이스를 구현한 클래스, 중복허용X, 순서유지X, 정렬저장O
*
*
* */
import java.util.ArrayList;
import java.util.TreeSet;

public class ChooseTwoAndPlus {
    //Test
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        int[] answer = solution(numbers);

        for(int a : answer){
            System.out.println("a = " + a);
        }
    }

    //Solution
    public static int[] solution(int[] numbers) {
        int[] answer = {};

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<numbers.length-1; ++i){
            for(int j=i+1; j<numbers.length; ++j){
                arrayList.add(numbers[i] + numbers[j]);
            }
        }

        TreeSet<Integer> treeSet = new TreeSet<>(arrayList); // *********
        answer = new int[treeSet.size()];
        int i = 0;
        for(Integer item : treeSet){
            answer[i++] = item;
        }

        return answer;
    }
}
