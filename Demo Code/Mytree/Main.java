/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mytree;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST tree = new BST();
        
        System.out.print("Enter number student: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID Student: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter Name Student: ");
            String name = scanner.nextLine();
            tree.insert(new Student(id, name));
        }
        
        System.out.println("Pre-order traversal:");
        tree.preOrder();
        
        System.out.println("In-order traversal:");
        tree.inOrder();
        
        System.out.println("Post-order traversal:");
        tree.postOrder();
        
        scanner.close();
    }
}
