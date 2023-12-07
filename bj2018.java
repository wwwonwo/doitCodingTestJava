import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int cnt = 1; // (N)의 경우의 수 1개미리 카운트
        int start_idx = 1;
        int end_idx = 1; // 투 포인터용 인덱스
        int sum = 1; // 연속 합

        // end_idx++; == 오른쪽으로 한칸 이동 (=연속 자연수 범위 확장)
        // start_idx++; 왼쪽 값 삭제 (=연속 자연수 범위 축소)

        while (end_idx != N) { // 인덱스가 N이 아닌 경우 반복
            if (sum == N) { // 연속 합이 N과 같으면
                cnt++; // 개수를 증가
                end_idx++; // 오른쪽으로 한칸 이동
                sum += end_idx; // 연속 합 수정
            }
            else if (sum > N) { // 연속 합이 N보다 크면
                sum -= start_idx; // 스타트 포인터의 값 빼주고
                start_idx++; // 왼쪽 값 삭제
            }
            else { // 연속 합이 N보다 작으면
                end_idx++; // 오른쪽으로 한칸 이동
                sum += end_idx; // 연속 합 수정
            }
        }
        System.out.println(cnt);
    }
}

// 연속된 자연수의 합을 구하는 문제 이므로 시작 인덱스와 종료 인덱스를 지정하여 연속된 수 표현 - 투 포인터