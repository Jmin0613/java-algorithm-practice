package section01_data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bk1940 {
    public static void main(String[] args) throws IOException {
        // 입력받을 버퍼 생성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine()); // 재료 개수
        int m = Integer.parseInt(bf.readLine()); // 갑옷이 되는 번호의 합

        // n 크기만큼 재료 배열 만들어서, 요소 받기
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 정령 → 크기 비교하기 수월

        // 투 포인터 및 cnt
        int si = 0; // startIndex
        int ei = n-1; //endIndex
        int cnt = 0;

        // 모든 재료 훑으면서 재료조합 찾기
        while(si<ei){
            if(arr[si] + arr[ei] < m) si++; // 재료합 < M
            else if(arr[si] + arr[ei] > m) ei--; // 재료합 > M
            else { // 일치
                cnt++;
                si++;
                ei--;
            }

        }
        System.out.println(cnt);

    }
}
