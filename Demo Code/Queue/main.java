/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;


/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args){
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(new Node(7));
        queue.enqueue(new Node(8));
        System.out.println("Queue");
        queue.print();
        queue.dequeue();
        System.out.println("Queue afer deQueue");
        queue.print();
    }
}
