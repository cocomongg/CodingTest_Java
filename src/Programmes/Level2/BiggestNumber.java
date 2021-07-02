package Programmes.Level2;

import java.util.*;
class Number{
    private int first_number;
    private int number;
    private int length;

    public Number(int first_number, int number, int length){
        this.number = number;
        this.first_number = first_number;
        this.length = length;
    }

    public int getNumber(){
        return this.number;
    }

    public int getFirst(){
        return this.first_number;
    }

    public int getLength(){
        return this.length;
    }
}
class Solution {
    public static void main(String[] args) {
        int[] numbers = {0, 0, 0, 0};
        System.out.println(solution(numbers));
    }
    public static String solution(int[] numbers) {
        String answer = "";
        ArrayList<Number> map = new ArrayList<>();
        ArrayList<String> num_list = new ArrayList<>();

        for(int num: numbers){
            num_list.add(Integer.toString(num));
        }

        for(String num: num_list){
            map.add(new Number(Integer.valueOf(String.valueOf(num.charAt(0))), Integer.parseInt(num), num.length()));
        }
        Collections.sort(map, new Comparator<Number>(){
            @Override
            public int compare(Number a, Number b){
                int a_first = a.getFirst();
                int b_first = b.getFirst();

                if(a_first < b_first)
                    return 1;

                else if(a_first > b_first)
                    return -1;

                else{
                    if(a.getLength() == b.getLength()){
                        return (a.getNumber() < b.getNumber()) ? 1 : ((a.getNumber() == b.getNumber()) ? 0 : -1);
                    }

                    else{
                        String a1 = Integer.toString(a.getNumber());
                        String b1 = Integer.toString(b.getNumber());
                        return Integer.parseInt(a1+b1) < Integer.parseInt(b1+a1) ? 1 : ((Integer.parseInt(a1+b1) == Integer.parseInt(b1+a1)) ? 0 : -1);
                    }
                }
            }
        });

        for(Number num : map){
            answer += (Integer.toString(num.getNumber()));
        }

        boolean check = false;
        for(int i = 0; i<answer.length(); ++i){
            if(answer.charAt(i) != '0') {
                check = true;
                break;
            }
        }
        if(!check)
            return "0";

        return answer;
    }
}