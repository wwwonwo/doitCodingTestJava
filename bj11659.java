import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 구간 합 구하기
        // 첫째 줄 수의 개수 N (1 <= N <= 100,000), 합을 구해야 하는 횟수 M (1<= M <= 100,000)
        // 둘째 줄 N 개의 수 입력 (1000보다 이하 자연수)
        // 셋째 줄 부터 M개의 줄에 합을 구해야하는 구간 i,j 주어짐 -> 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 다량의 데이터 처리 Scanner와 유사
        // import와 throws 필수
        StringTokenizer st = new StringTokenizer(br.readLine()); // 문자열을 토큰화 해주는 클래스

        // N, M 입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // N 개의 수 입력
        st = new StringTokenizer(br.readLine());

        // 누적합 배열
        long[] S = new long[N+1];
        for (int i=1; i<=N; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        // M개의 줄에 합을 구해야하는 구간 i,j 주어짐 -> 출력
        for (int idx=0; idx<M; idx++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j]-S[i-1]);
        }
    }
}