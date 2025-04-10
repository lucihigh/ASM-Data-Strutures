/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist.student;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyList ml = new MyList();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student information " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Mark: ");
            double mark = sc.nextDouble();
            sc.nextLine(); 

            Student student = new Student(id, name, mark);
            ml.add(student);
        }
        ml.sortByRank();
        ml.traverse();
    }
}
