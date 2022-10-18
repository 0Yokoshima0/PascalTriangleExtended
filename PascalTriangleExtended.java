import java.util.Scanner;

public class PascalTriangleExtended {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = combination(j,i);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int factorial(int n) {
        int sum = 1;
        while( n > 0 ) {
            sum = sum * n--;
        }
        return sum;
    }
    public static int combination(int m, int n) {
        return factorial(n) / (factorial(m) * factorial((n - m)));
    }
}
