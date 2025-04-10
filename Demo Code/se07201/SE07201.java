/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package se07201;

/**
 *
 * @author Admin
 */
public class SE07201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyList ml = new MyList();
        ml.add(1, "Tong Van Anh", 9);
        ml.add(5);
        ml.add(6);
        ml.add(9);
        ml.traverse();
    }
}
