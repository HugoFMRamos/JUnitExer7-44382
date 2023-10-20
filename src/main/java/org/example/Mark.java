package org.example;

public class Mark {

    private int studentNumber; //Number of the student (Identifier)
    private double mark; //Mark of the student

    public Mark(int studentNumber, double mark) {
        this.studentNumber = studentNumber;
        this.mark = mark;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
