import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int[] a = new int[25];
        int[] b = new int[25];
        int[] c = new int[50];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 25; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int k = 0;
        for (int i = 0; i < 25; i++) {
            c[k++] = a[i];
            c[k++] = b[i];
        }

        for (int i = 0; i < 50; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
