package section01_data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bk11659 {
    public static void main(String[] args) throws IOException {
        // 입력받을 버퍼 생성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 들어오는 값 토큰으로 분리하여 받기 → StringTokenizer
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());

        // 배열의 개수와 질의 개수
        int arrNum = Integer.parseInt(stringTokenizer.nextToken());
        int quizNum = Integer.parseInt(stringTokenizer.nextToken());

        // 합배열 선언 및 초기화
        long[] sumArr = new long[arrNum+1];
        /* 합 배열 공식 S[i] = S[i-1] + A[i]에서, 0번쨰 인덱스 신경쓰지 않기 위해 +1로 선언 */

        stringTokenizer = new StringTokenizer(bf.readLine());
        for(int i=1; i<=arrNum; i++){
            // tokenizer로 받아, 합배열 하나씩 초기화
            sumArr[i] =  sumArr[i-1] + Integer.parseInt(stringTokenizer.nextToken()); // A[i]
        }

        // 질의 구하기
        for(int q=0; q<quizNum; q++){
            // 질의 범위 받기 → i~j 구간
            stringTokenizer = new StringTokenizer(bf.readLine());

            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(sumArr[j] - sumArr[i-1]);
        }
    }
}
/*

구간과 배열  등을 입력 받을때 스캐너로 입력받기에는 힘들 것 같아, 버퍼를 이용하여 받아줌.

음.. 그리고 입력값을 받을때 처음에는 split()으로 받을려고 했는데 처리 비용이 꽤 들어보였다.
문제만 주어진게 아니라, 제한시간 같은 것도 문제에 같이 있었는데, 그 안에 답이 나올려면 시간복잡도가 높으면 안되겠더라.
그런데 split()을 사용하면 1. 공백으로 구분 / 2. 공백 따라서 문자열 자르기 / 3. string을 int로 전환 이렇게 3가지를 처리해야 한다.
그래서 다른 방법은 없나 찾아보다가 Do_it 강의에서 StringTokenizer를 사용하는 것을 보았다.

StringTokenizer는 기본적으로 공백, 탭, 줄바꿈 같은 구분자를 알아서 처리해준다 한다.
그렇기에 1과 2를 합쳐서 처리할 수 있고, string을 int로 변환하는 것만 해주면 splite()보다 가벼워보여 사용하기로 했다.

*/