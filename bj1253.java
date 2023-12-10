import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // N 입력
        int N = Integer.parseInt(stringTokenizer.nextToken());

        // N 만큼 Arr에 입력
        long[] A = new long[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i=0; i<N; i++){
            A[i]=Long.parseLong(stringTokenizer.nextToken());
        }
        // 배열 정렬
        Arrays.sort(A);

        // 배열 원소마다 좋은 수인지 판별
        int cnt = 0;
        for (int k=0;k<N;k++){
            int i = 0;
            int j = N-1;
            long tmp = A[k];
            while (i<j) {
                if (A[i]+A[j]==tmp){
                    if (i != k && j != k){ // 서로 다른 수 여부를 체크
                        cnt++;
                        break;
                    }
                    else if (i == k) {
                        i++;
                    }
                    else {
                        j--;
                    }
                }
                else if (A[i]+A[j]>tmp){
                    j--;
                }
                else {
                    i++;
                }
            }
        }

        // 좋은 수 개수 출력
        System.out.println(cnt);
        bufferedReader.close();
    }
}

