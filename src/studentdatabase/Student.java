/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase;

/**
 *
 * @author sarun
 */
public class Student {
    
    private int id;
    private String name;
    private double gpa;
    public Student() {
    }
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    public double getGPA() {
        return gpa;
    }

    public void setGPA (double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

}
