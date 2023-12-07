import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());

        int[] arr = new int[N];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(arr);

        int cnt = 0;
        int i = 0;
        int j = N - 1;

        while (i<j) {
            if (arr[i] + arr[j] < M) {
                i++;
            }
            else if (arr[i] + arr[j] > M) {
                j--;
            }
            else {
                cnt++;
                i++;
                j--;
            }
        }
        System.out.println(cnt);
        bufferedReader.close();
    }
}

