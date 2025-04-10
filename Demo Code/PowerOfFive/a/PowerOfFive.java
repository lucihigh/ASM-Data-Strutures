import java.util.Scanner;

public class PowerOfFive {
    // Phương pháp đệ quy
    /*public static long powerRecursive(int n) {
        if (n == 0) return 1;
        return 5 * powerRecursive(n - 1);
    }*/

    // Phương pháp vòng lặp
    /*public static long powerIterative(int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= 5;
        }
        return result;
    }*/
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        /*System.out.println("5^" + n + " (de quy) = " + powerRecursive(n));*/
        /*System.out.println("5^" + n + " (vong lap) = " + powerIterative(n));*/
        System.out.println("Sum = " + n + " = " + sumToN(n));
    }
}
