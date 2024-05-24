import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        N = sc.nextInt();

        for (i = 0; i < N; i++) {

            for (j = 0; j < N; j++) {
                if (i == j || i + j == N - 1 || i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}


