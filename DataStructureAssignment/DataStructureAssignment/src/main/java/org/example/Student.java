package org.example;

public class Student {

    private int studentNum;
    private String lastName;
    private String firstNames;
    private int courseCode;

    //constructors
    public Student() {
    }

    public Student(int studentNum, String lastName, String firstNames, int courseCode) {
        this.studentNum = studentNum;
        this.lastName = lastName;
        this.firstNames = firstNames;
        this.courseCode = courseCode;
    }

    //getters
    public int getStudentNum() {
        return studentNum;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstNames() {
        return firstNames;
    }

    public int getCourseCode() {
        return courseCode;
    }

    //setters

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Student: " +
                "studentNum=" + studentNum +
                ", lastName='" + lastName + '\'' +
                ", firstNames='" + firstNames + '\'' +
                ", courseCode=" + courseCode;
    }
}
