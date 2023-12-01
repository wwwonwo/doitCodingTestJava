import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 점수 중 최댓값을 고름
        // 최댓값을 M이라 할 때, 모든 점수를 점수/M*100으로 고침
        // 예를 들어, 최고점 70점, 수학이 50점이면 수학 점수는 50/70*100 = 71.43
        // 새로운 평균을 구하는 프로그램 작성

        // 모든 점수에 동일 연산 들어감 -> 일일히 변환 X
        // (A / M * 100 + A / M * 100 + A / M * 100) / 3
        // = (A + B + C) * 100 / M / 3

        // 과목 개수 1000 이하 N 입력

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 각 과목 시험 성적 입력 ( 100 이하, 음이 아닌 정수, 적어도 1개는 0보다 큼 )

        int[] arr = new int[N];
        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        // 최댓값 M 찾기 & 합계 SUM 찾기
        int M = arr[0];
        int SUM = arr[0];
        for (int i=1; i<N; i++){
            if(arr[i] > M) M = arr[i];
            SUM += arr[i];
        }

        System.out.println(SUM*100.0/M/N); // float 형 하나 넣어줘야 정상적인 평균값 출력

    }
}