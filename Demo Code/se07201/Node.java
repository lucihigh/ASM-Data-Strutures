/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se07201;

/**
 *
 * @author Admin
 */
public class Node {
    int info;
    Node next;

    public Node(int info, Node next) {
        this.info = info;
        this.next = next;
    }

    public Node(int info) {
        this.info = info;
    }
    
}
