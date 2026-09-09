package section01_data_structure;

import java.util.Scanner;

public class Bk2018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // N 받기
        int num = sc.nextInt();

        // 인덱스
        int startIndex = 1;
        int endIndex = 1;

        // 합, 카운터. N 자체 1
        int sum = 1;
        int cnt = 1;

        // 카운트 구하기
        while(endIndex != num){
            if(sum == num){
                cnt++;
                endIndex++;
                sum+=endIndex;
            } else if(sum > num){
                sum-=startIndex;
                startIndex++; // sum에서 뺴주고 나서 이동
            }
            else{ // sum < num
                endIndex++;
                sum+=endIndex;
            }
        }
        System.out.println(cnt);
    }
}
