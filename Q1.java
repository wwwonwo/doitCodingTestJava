import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 첫 줄 N 입력

        String num_list = sc.next();
        char[] c_list = num_list.toCharArray();

        int sum = 0;

        for (int i = 0; i < c_list.length; i++){
            sum += c_list[i] - '0';
        }

        System.out.println(sum);

    }
}

// 틀렸던 부분
// 12 - 문자 배열로 변환 안함
// 16 - i의 범위를 이하로 설정해서 인덱스 초과
