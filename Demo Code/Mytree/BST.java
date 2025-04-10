/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mytree;

/**
 *
 * @author Admin
 */
public class BST {
    private Node root;
    
    public BST() {
        root = null;
    }
    
    public void insert(Student student) {
        root = insertRec(root, student);
    }
    
    private Node insertRec(Node root, Student student) {
        if (root == null) {
            return new Node(student);
        }
        if (student.id < root.student.id) {
            root.left = insertRec(root.left, student);
        } else if (student.id > root.student.id) {
            root.right = insertRec(root.right, student);
        }
        return root;
    }
    
    public void preOrder() {
        preOrderRec(root);
        System.out.println();
    }
    
    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.student + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
    
    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }
    
    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.student + " ");
            inOrderRec(root.right);
        }
    }
    
    public void postOrder() {
        postOrderRec(root);
        System.out.println();
    }
    
    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.student + " ");
        }
    }
}
