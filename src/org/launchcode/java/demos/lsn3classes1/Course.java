package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String name;
    private String teacher;
    private ArrayList<Student> students;
    private int courseCredits = 0;

    public Course(String name, String teacher, ArrayList<Student> students,  int courseCredits){
        this.name = name;
        this.teacher = teacher;
        this.students = students;
        this.courseCredits = courseCredits;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getTeacher(){
        return this.teacher;
    }
    public void setTeacher(String teacher){
        this.teacher = teacher;
    }
    public ArrayList<Student> getStudents(){
        return this.students;
    }
    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }
    public double getCourseCredits(){
        return this.courseCredits;
    }
    public void setCourseCredits(int courseCredits){
        this.courseCredits = courseCredits;
    }
}
