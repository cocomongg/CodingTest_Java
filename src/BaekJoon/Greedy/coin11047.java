package BaekJoon.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class coin11047 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<n; ++i){
            list.add(sc.nextInt());
        }
        Collections.reverse(list);

        for(int coin: list){
            if((k / coin) >= 1){
                answer += k/coin;
                k -= coin * (k/coin);
            }
        }
        System.out.println(answer);
    }
}
