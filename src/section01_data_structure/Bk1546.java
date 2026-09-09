package section01_data_structure;

import java.util.Scanner;

public class Bk1546 {
    public static void main(String[] args){
        // 입력 스캐너 생성
        Scanner sc = new Scanner(System.in);

        // 과목 수 N 입력받기
        int n = sc.nextInt();
        if (n > 1000) System.out.println("1000보다 작거나 같아야 합니다.");

        // 현재 성적 입력받기 + 최댓값 구하기
        double sum = 0;
        int mScore = 0;

        for(int i = 0; i<n; i++){
            int nScore = sc.nextInt();
            if(nScore == 0 && i == n-1){
                System.out.println("적어도 1개의 값은 0보다 커야 합니다.");
            }
            sum += nScore;

            if(nScore > mScore) mScore = nScore;
        }

        // 새로운 평균 출력
        System.out.println(((sum/n)/mScore)*100);

    }
}
