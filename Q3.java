import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int[] arr_S = new int[N+1];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            arr_S[i+1] = arr_S[i] + arr[i];
        } // 구간 합 배열

        for(int k=0; k<M; k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(arr_S[j]-arr_S[i-1]);
        }

    }
}
