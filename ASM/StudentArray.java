/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

/**
 *
 * @author P1
 */
public class StudentArray {
    public static void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private static int partition(Student[] students, int low, int high) {
        double pivot = students[high].score;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (students[j].score < pivot) { // Sắp xếp tăng dần
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, high);
        return i + 1;
    }

    private static void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }

    public static Student binarySearch(Student[] students, String id) {
        int left = 0, right = students.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (students[mid].id.equals(id)) {
                return students[mid];
            } else if (students[mid].id.compareTo(id) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
