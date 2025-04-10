/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bubblesort.bubblesort.student;

import static bubblesort.bubblesort.student.Student.bubbleSort;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number student: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự xuống dòng

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter information student number " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Id: ");
            int age = scanner.nextInt();
            System.out.print("Mark: ");
            double score = scanner.nextDouble();
            scanner.nextLine(); // Đọc ký tự xuống dòng

            students[i] = new Student(name, age, score);
        }

        System.out.println("\nArray before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
        // Tạo bản sao mảng để sắp xếp theo 2 chiều
        Student[] ascStudents = students.clone();
        Student[] descStudents = students.clone();

        // Sắp xếp theo tăng dần
        Student.bubbleSort(ascStudents);
        for (int i = 0; i < n; i++) {
            ascStudents[i].setRank(i + 1);
        }

        // Sắp xếp theo giảm dần
        Student.bubbleSortu(descStudents);
        for (int i = 0; i < n; i++) {
            descStudents[i].setRank(i + 1);
        }

        // Hiển thị danh sách sắp xếp tăng dần
        System.out.println("\nList of students sorted by ascending score:");
        for (Student student : ascStudents) {
            System.out.println(student + ", Rank: " + student.getRank(student.getMark()));
        }

        // Hiển thị danh sách sắp xếp giảm dần
        System.out.println("\nList of students sorted by score in descending order:");
        for (Student student : descStudents) {
            System.out.println(student + ", Rank: " + student.getRank(student.getMark()));
        }

        scanner.close();
    }
}
