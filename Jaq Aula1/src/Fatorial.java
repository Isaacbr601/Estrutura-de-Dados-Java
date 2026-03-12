public class Fatorial {
    public static void main(String[] args) {
        int x = 4;
        int resp = fat(x);
        System.out.println("Fatorial(" + x + ") = " + resp);

        int n = 6;
        int fibResp = fib(n);
        System.out.println("Fibonacci(" + n + ") = " + fibResp);

        int a = 2;
        int b = 5;
        int resul = potencia(a, b);
        System.out.println("Potencia igual a :" + resul);
    }

    public static int fat(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fat(num - 1);
        }
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int potencia(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * potencia(base, exp - 1);
        }
    }
}