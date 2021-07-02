package Programmes.Level2;
import java.util.*;

/*
* 반환타입이 Long이기 때문에 변수나 배열을 Long타입으로 써야함!
* */

public class MaximizeFormula {
    public static void main(String[] args) {
        String expression = "100+500-600+700";
        System.out.println(solution(expression));
    }
    public static long solution(String expression) {
        long answer = 0;
        ArrayList<ArrayList> list = new ArrayList<>();

        HashSet<Character> set = new HashSet<>();
        for(Character a : extract_op(expression))
            set.add(a);
        ArrayList<Character> op = new ArrayList<>(set);
        
        if(op.size() == 1){
            ArrayList<Integer> num = extract_num(expression);
            int calc_result = 0;
            int i = 0;
            while(num.size() > 1){
                calc_result = calc(num.get(i), num.get(i+1), op.get(0));
                num.remove(i+1);
                num.set(i, calc_result);
            }
            return Math.abs(num.get(0));
        }
        
        ArrayList<Character> temp;
        for(int i = 0; i < op.size(); ++i){
            temp = new ArrayList<>();
            Character first = op.get(i);
            temp.add(first);
            op.remove(first);

            for(Character c: op){
                temp.add(c);
            }
            op.add(i, first);
            if(temp.size() > 2){
                list.add(new ArrayList<>(temp));
                Collections.swap(temp, 1, 2);
                list.add(new ArrayList<>(temp));
                continue;
            }
            list.add(new ArrayList<>(temp));
        }

        int index, result, sum_result = 0;
        for(ArrayList<Character> a : list){
            System.out.println("a = " + a);
            ArrayList<Integer> num = extract_num(expression);
            ArrayList<Character> oper = extract_op(expression);
            sum_result = 0;
            for(Character c: a) {
                System.out.println("c = " + c);
                while (oper.contains(c)) {
                    index = oper.indexOf(c);
                    result = calc(num.get(index), num.get(index + 1), c);
                    oper.remove(index);
                    num.remove(index + 1);
                    num.set(index, result);
                    System.out.println("num = " + num);
                }
            }
            sum_result = Math.abs(num.get(0));
            answer = Math.max(answer, sum_result);
        }
        return answer;
    }

    public static ArrayList<Integer> extract_num(String a){
        String[] str = a.split("\\*|\\+|-");
        ArrayList<Integer> num = new ArrayList<>();
        for(String c : str)
            num.add(Integer.parseInt(c));
        return num;
    }

    public static ArrayList<Character> extract_op(String a){
        String str = a.replaceAll("[0-9]", "");
        ArrayList<Character> oper = new ArrayList<>();
        for(Character c : str.toCharArray())
            oper.add(c);
        return oper;
    }

    public static int calc(int left, int right, Character oper){
        if(oper == '+')
            return left+right;
        else if(oper == '*')
            return left * right;
        else
            return left - right;
    }
}
