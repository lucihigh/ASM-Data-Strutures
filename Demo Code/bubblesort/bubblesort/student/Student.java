/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bubblesort.bubblesort.student;

/**
 *
 * @author Admin
 */
public class Student {
    String name;
    int id;
    double score;
    private int rank;

    public Student(String name, int id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }
    public double getMark() {
        return score;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", score=" + score + ", rank=" + rank + '}';
    }

    

    public static void bubbleSortu(Student[] students) {
        int n = students.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) { // Sắp xếp theo điểm tăng dần
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void bubbleSort(Student[] students) {
        int n = students.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (students[j].score < students[j + 1].score) { // Sắp xếp theo điểm tăng dần
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public String getRank(double score){
        if (score < 5.0) return "Fail";
        else if (score < 6.5) return "Medium";
        else if (score < 7.5) return "Good";
        else if (score < 9.0) return "Very Good";
        else return "Excellent";
    }
}
