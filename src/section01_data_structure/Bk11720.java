import java.util.Scanner;

public class Bk11720 {
    public static void main(String[] args){
        // 입력 스캐너 생성
        Scanner sc = new Scanner(System.in);

        // n개 입력 받기
        int n = sc.nextInt();

        // 해당 숫자많은 입력 받기
        String numString = sc.next(); //문자열 통째로 일겅오기

        // 문자 쪼개서 배열에 넣기
        char[] numChar = numString.toCharArray();

        // 합 구하기
        int sum = 0;
        for (char num : numChar) { //int i = 0; i<numChar.length ; i++
            sum += num-'0'; //int로 변환
        }

        // 합 출력
        System.out.println(sum);

    }
}
