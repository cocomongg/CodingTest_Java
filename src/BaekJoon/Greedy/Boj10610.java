package BaekJoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Boj10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = Arrays.asList(br.readLine().split(""))
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        if(sum % 3 != 0 || !list.contains(0)){
            System.out.println(-1);
            return;
        }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.toString().replaceAll("[^0-9]",""));
    }
}


//        String answer = "";
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        int[] num_arr = new int[s.length()];
//
//        for(int i = 0; i < s.length(); ++i){
//            num_arr[i] = s.charAt(i) - 48;
//        }
//
//        if(!s.contains("0")){
//            System.out.println(-1);
//            return;
//        }
//
//        int mod_sum = 0;
//        for(int i = 0; i<num_arr.length; ++i){
//            mod_sum += num_arr[i] % 3;
//        }
//
//        if(mod_sum % 3 != 0){
//            System.out.println(-1);
//            return;
//        }
//
//
//        Arrays.sort(num_arr);
//        for(int i = num_arr.length-1; i >= 0; --i){
//            answer += Integer.toString(num_arr[i]);
//        }
//        System.out.println(answer);
