/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SumEvenNumbers;

import java.util.Scanner;

/**
 *
 * @author P1
 */
public class SumEvenNumbers {
    public static long sumEvenInRange(int m, int n) {
        // Ensure m is less than or equal to n
        if (m > n) {
            int temp = m;
            m = n;
            n = temp;
        }

        // Adjust m and n to nearest even numbers if they are odd
        if (m % 2 != 0) m++;
        if (n % 2 != 0) n--;

        // Calculate the count of even numbers in range
        long count = ((n - m) / 2) + 1;

        // Use arithmetic series sum formula
        return count * (m + n) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(sumEvenInRange(m, n));
        
        scanner.close();
    }
}
