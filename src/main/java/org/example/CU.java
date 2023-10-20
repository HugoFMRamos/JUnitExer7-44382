package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CU {

    private String nameCU; //Name of Curricular Unit
    private ArrayList<Mark> marks; //Array with marks of students
    int totalStudents; //Number of students inside the curricular unit


    public CU(String nameCU) {
        this.nameCU = nameCU;
        this.marks = new ArrayList<>();
        this.totalStudents = 0;
    }

    public String getNameCU() {
        return nameCU;
    }

    public void setNameCU(String nameCU) {
        this.nameCU = nameCU;
    }

    public ArrayList<Mark> getMarks() {
        return marks;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void insertMarkCU(int studentNum, double mark) {
        Mark mark1 = new Mark(studentNum, mark);
        marks.add(mark1);
        totalStudents++;
    }

    public double searchStudent(int studentNum) {
        for (Mark mark : marks) {
            if (studentNum == mark.getStudentNumber()) {
                return mark.getMark();
            }
        }
        return -1.0;
    }

    public double averageCU() {
        double sumMarks = 0;
        for (Mark mark : marks) {
            sumMarks += mark.getMark();
        }
        return sumMarks/totalStudents;
    }

    public boolean isApproved(int studentNum) {
        double mark = searchStudent(studentNum);
        return mark >= 9.5;
    }
}
