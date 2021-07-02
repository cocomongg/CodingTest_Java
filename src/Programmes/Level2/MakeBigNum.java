package Programmes.Level2;

// 형변환하는 함수를 사용하지 않고, 정수형 배열과 StringBuilder를 통해

public class MakeBigNum {

    public static void main(String[] args) {
        System.out.println(solution("4177252841", 4));
        System.out.println(solution("1231234", 3));
        System.out.println(solution("1924", 2));
    }

    public static String solution(String number, int k) {
        int[] num_arr = new int[number.length()];
        for(int i = 0; i < number.length(); ++i){
            num_arr[i] = number.charAt(i) - 48;
        }
        StringBuilder sb = new StringBuilder();
        int n = number.length() - k; // answer의 자릿수
        int num;
        int start=0;
        while(n > 0){
            num = 0;
            for(int i = start; i+n-1 < num_arr.length; ++i){
                if(num_arr[i] == 9){
                    start = i+1;
                    num = 9;
                    break;
                }
                else if(num < num_arr[i]){
                    num = num_arr[i];
                    start = i+1;
                }
            }
            sb.append(num);
            --n;
        }

        return sb.toString();
    }
}

