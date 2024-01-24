import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        int max = 0;
        int sum = 0;

        for (int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) max = arr[i];
            sum += arr[i];
        }

        System.out.println(sum*((100.0/n)/max));

    }
}

//틀렸던 부분
// 27 - 연산 정리 과정 오류 발생