package BaekJoon.Greedy;

import java.util.Scanner;

public class Intern2875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int team = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int all = m+n;
        while(true){
            n -= 2;
            m -= 1;
            if(m < 0 || n < 0)
                break;
            team += 1;
        }
        int left = all - team * 3;


        while(k-- > 0){
            if(left != 0)
                left -= 1;
            else{
                team -= 1;
                left += 2;
            }
        }
        System.out.println(team);
    }
}
