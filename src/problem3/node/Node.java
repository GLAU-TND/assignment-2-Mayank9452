/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

import problem5.student.Student;

public class Node {
    private Student student;
    private Node nextNode;

    public Student getStudent() {
        return student;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node" +
                getStudent();
    }
}
