/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

/**
 *
 * @author P1
 */
public class StudentList {
    private Student head;
    private int size = 0;

    public void add(Student student) {
        if (head == null) {
            head = student;
        } else {
            Student current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = student;
        }
        size++;
    }

    public boolean update(String id, String newName, double newScore) {
        Student current = head;
        while (current != null) {
            if (current.id.equals(id)) {
                current.name = newName;
                current.score = newScore;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean delete(String id) {
        if (head == null) return false;
        if (head.id.equals(id)) {
            head = head.next;
            size--;
            return true;
        }
        Student current = head;
        while (current.next != null) {
            if (current.next.id.equals(id)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Student[] toArray() {
        Student[] arr = new Student[size];
        Student current = head;
        int index = 0;
        while (current != null) {
            arr[index++] = new Student(current.id, current.name, current.score);
            current = current.next;
        }
        return arr;
    }

    public void bubbleSort() {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            Student current = head;
            while (current.next != null) {
                if (current.score < current.next.score) { // Sắp xếp giảm dần
                    swapStudents(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
        display(); // Hiển thị danh sách sau khi sắp xếp
    }

    private void swapStudents(Student a, Student b) {
        String tempId = a.id;
        String tempName = a.name;
        double tempScore = a.score;

        a.id = b.id;
        a.name = b.name;
        a.score = b.score;

        b.id = tempId;
        b.name = tempName;
        b.score = tempScore;
    }

    public Student linearSearch(String id) {
        Student current = head;
        while (current != null) {
            if (current.id.equals(id)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void display() {
        Student current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
