/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue.object;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ArrayQueue {
    Node head, tail; 
    
    public ArrayQueue() {
        head = null;
    }
    public boolean isEmpty() {
        return (head == null);
    }
    public void add(Student s) { // Thêm vào đầu danh sách (LIFO)
        Node q = new Node(s);
        if (isEmpty()){
            head = tail = q;
        }else{
            tail.next = q;
            tail = q;
        }
    }
    public Student pop() { // Lấy phần tử đầu danh sách (LIFO)
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        Student s = head.student;
        head = head.next;
        return s;
    }
    public void traverse() { // Duyệt theo thứ tự LIFO
        Node p = head;
        while (p != null) {
            System.out.println(p.student.toString());
            p = p.next;
        }
    }
    public void sortByRank() {
        ArrayList<Student> students = new ArrayList<>();
        Node p = head;
        while (p != null) {
            students.add(p.student);
            p = p.next;
        }

        students.sort((a, b) -> Double.compare(b.getMark(), a.getMark()));

        for (int i = 0; i < students.size(); i++) {
            students.get(i).setRank(i + 1);
        }

        head = null; // Reset stack

        // Push từng student theo thứ tự mới vào stack
        for (Student student : students) {
            add(student);
        }
    }
}
