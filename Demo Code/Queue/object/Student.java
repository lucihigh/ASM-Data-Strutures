/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue.object;

/**
 *
 * @author Admin
 */
public class Student {
    private int id;
    private String name;
    private double mark;
    private int rank;
    

    public Student(int id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    public double getMark() {
        return mark;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }


    @Override
    public String toString() {
        return "Student{" + "rank=" + rank + ", name=" + name + ", mark=" + mark + ", id=" + id + "," + getRank(mark) + '}';
    }
    public String getRank(double mark){
        if (mark < 5.0) return "Fail";
        else if (mark < 6.5) return "Medium";
        else if (mark < 7.5) return "Good";
        else if (mark < 9.0) return "Very Good";
        else return "Excellent";
    }
}
