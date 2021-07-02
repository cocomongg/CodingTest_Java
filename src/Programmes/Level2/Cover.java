package Programmes.Level2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Cover {
    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }
    public static int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; ++i ){
            if(map.containsKey(clothes[i][1])){
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
            }
            else
                map.put(clothes[i][1], 1);
        }

        System.out.println("map = " + map);
        return answer;
    }
}
