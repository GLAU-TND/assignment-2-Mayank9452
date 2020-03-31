/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    private String name;
    private int rollNumber;
    private int backLogCounter;


    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getBackLogCounter() {
        return backLogCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setBackLogCounter(int backLogCounter) {
        this.backLogCounter = backLogCounter;
    }

    @Override
    public String toString() {
        return "---------------------------------------" + "\n" +
                "Name -- " + getName() + "\n" +
                "Roll Number -- " + getRollNumber() + "\n" +
                "Back Log Value -- " + getBackLogCounter() + "\n" +
                "---------------------------------------";
    }
}
