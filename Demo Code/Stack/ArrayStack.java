/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author Admin
 */
public class ArrayStack {
    Node[] a;
    int top, max;

    public ArrayStack(int max) {
        this.max = max;
        a = new Node[max];
        top = -1;
    }
    public ArrayStack(){
        this(50);
        
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == max - 1;
    }
    
    public void push(Node x) { 
        if(isFull()){
            System.out.println("Stack is full");
            return;
        } 
        top++;
        a[top] = x; 
        
    } 
    public Node pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            
        }
        Node x = a[top];
        top--;
        return x;
    }
    public void print(){
        for (int i = 0; i <= top; i++){
            a[i].printNode();
        }
    }
    
}
