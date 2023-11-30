import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 숫자 개수 입력
        int n = sc.nextInt();
        // 문자열 입력
        String nums = sc.next();
        // 문자열을 문자배열로 바꿔주는 메서드 사용 - toCharArray
        char[] numc = nums.toCharArray();
        // 일일히 더하며 합계 구하기
        int sum = 0;
        for(int i = 0; i < numc.length; i++){
            sum += numc[i] - '0';
        }
        System.out.print(sum);
    }
}