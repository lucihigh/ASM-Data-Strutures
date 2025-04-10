/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bubblesort;

import static bubblesort.BubbleSort.bubbleSort;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entern number string: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter string: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // In mảng trước khi sắp xếp
        System.out.println("Array before sorting: " + Arrays.toString(arr));

        // Gọi hàm sắp xếp
        bubbleSort(arr);

        // In mảng sau khi sắp xếp
        System.out.println("Array after sorting: " + Arrays.toString(arr));

        scanner.close();

    }
}
