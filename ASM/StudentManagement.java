/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author P1
 */
public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();
        int choice;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add student");
            System.out.println("2. Display students");
            System.out.println("3. Edit student");
            System.out.println("4. Delete student");
            System.out.println("5. Sort students (Bubble Sort - Linked List)");
            System.out.println("6. Sort students (Quick Sort - Array)");
            System.out.println("7. Search student (Linear Search - Linked List)");
            System.out.println("8. Search student (Binary Search - Array)");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    String id, name;
                    double score;
                    
                    while (true) {
                        System.out.print("Enter ID (numbers or alphanumeric, not only letters): ");
                        id = scanner.nextLine();
                        if (Pattern.matches("[0-9]+|[a-zA-Z0-9]+", id) && !Pattern.matches("[a-zA-Z]+", id)) break;
                        System.out.println("Invalid ID. Please enter only numbers or a mix of letters and numbers.");
                    }
                    
                    while (true) {
                        System.out.print("Enter Name (letters only): ");
                        name = scanner.nextLine();
                        if (Pattern.matches("[a-zA-Z ]+", name)) break;
                        System.out.println("Invalid name. Please enter letters only.");
                    }
                    
                    while (true) {
                        System.out.print("Enter Score (decimal numbers allowed): ");
                        try {
                            score = Double.parseDouble(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid score. Please enter a valid number.");
                        }
                    }
                    
                    studentList.add(new Student(id, name, score));
                    break;
                case 2:
                    studentList.display();
                    break;
                case 3:
                    System.out.print("Enter ID to edit: ");
                    id = scanner.nextLine();
                    
                    while (true) {
                        System.out.print("Enter new name: ");
                        name = scanner.nextLine();
                        if (Pattern.matches("[a-zA-Z ]+", name)) break;
                        System.out.println("Invalid name. Please enter letters only.");
                    }
                    
                    while (true) {
                        System.out.print("Enter new score: ");
                        try {
                            score = Double.parseDouble(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid score. Please enter a valid number.");
                        }
                    }
                    
                    studentList.update(id, name, score);
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    id = scanner.nextLine();
                    studentList.delete(id);
                    break;
                case 5:
                    studentList.bubbleSort();
                    break;
                case 6:
                    Student[] arr = studentList.toArray();
                    StudentArray.quickSort(arr, 0, arr.length - 1);
                    for (Student s : arr) System.out.println(s);
                    break;
                case 7:
                    System.out.print("Enter ID to search: ");
                    id = scanner.nextLine();
                    Student result = studentList.linearSearch(id);
                    System.out.println(result != null ? result : "Not found");
                    break;
                case 8:
                    arr = studentList.toArray();
                    StudentArray.quickSort(arr, 0, arr.length - 1);
                    System.out.print("Enter ID to search: ");
                    id = scanner.nextLine();
                    result = StudentArray.binarySearch(arr, id);
                    System.out.println(result != null ? result : "Not found");
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}
