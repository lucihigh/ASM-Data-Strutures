/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author Admin
 */
public class ArrayQueue {
    Node[] a;
    int max;
    int first, last;
    int size;

    public ArrayQueue(int max) {
        this.max = max;
        first = last = 0;
        a = new Node[max];
        size = 0;
    }
    public boolean isEmpty(){
        return first == -1;
    }
    public boolean isFull(){
        return (size == max);
    }
    public void enqueue(Node x){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        size ++;
        a[last] = x;
        last++;
        if(last == max){
            last = 0;
        }
    
    }
    public Node dequeue(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        size--;
        Node x = a[first];
        first++;
        return x;
    }
    public void print(){
        for (int i =0; i<size;i++){
            System.out.println(a[i].data);
        }
    }
    
}
