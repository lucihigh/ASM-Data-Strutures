/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se07201;

/**
 *
 * @author Admin
 */
public class MyList {
    Node head,tail;
    
    public MyList(){
        head = tail = null;
    }
    public boolean isEmpty(){
        return(head == null);
    }
    public void add(int x){
        Node q = new Node(x);
        if (isEmpty()){
            head = tail = q;
        }else{
            tail.next = q;
            tail = q;
        }
    }
    public void addMany(int[] a){
        for (int i : a){
            add(i);
        }
    }
    public void traverse(){
        Node p = head;
        while(p!=null){
            System.out.println(p.info);
            p = p.next;
        }
    }
}
