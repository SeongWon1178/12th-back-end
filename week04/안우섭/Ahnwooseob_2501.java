import java.util.Scanner;

public class Ahnwooseob_2501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int count = 0;
        int result = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (count == K) {
                    result = i;
                    break;
                }
            }
        }

        System.out.print(result);
        scanner.close();
    }
}
