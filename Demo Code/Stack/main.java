/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args){
        ArrayStack stack = new ArrayStack(5);
        stack.push(new Node(4));
        stack.push(new Node(7));
        stack.push(new Node(8));
        System.out.println("Stack");
        stack.print();
        stack.pop();
        System.out.println("Stack afer pop");
        stack.print();
    }
}
