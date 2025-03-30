/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

/**
 *
 * @author P1
 */
public class Student {
    String id;
    String name;
    double score;
    Student next;

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.next = null;
    }

    public String getRank() {
        if (score < 5.0) return "Fail";
        else if (score < 6.5) return "Medium";
        else if (score < 7.5) return "Good";
        else if (score < 9.0) return "Very Good";
        else return "Excellent";
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + score + " - " + getRank();
    }
}
