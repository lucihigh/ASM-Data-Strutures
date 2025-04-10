/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mytree;

/**
 *
 * @author Admin
 */
public class Node {
    Student student;
    Node left;
    Node right;
    
    public Node(Student student) {
        this.student = student;
        left = right = null;
    }
}
