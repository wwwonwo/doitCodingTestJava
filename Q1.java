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

