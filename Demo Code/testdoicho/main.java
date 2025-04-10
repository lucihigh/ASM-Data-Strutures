/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testdoicho;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        
        // Hoán đổi giá trị
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swap: a = " + a + ", b = " + b);
        
        scanner.close();
    }
}
