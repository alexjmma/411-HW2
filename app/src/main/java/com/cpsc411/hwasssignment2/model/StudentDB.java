package com.cpsc411.hwasssignment2.model;

import java.util.ArrayList;

public class StudentDB {
    private static final StudentDB ourInstance = new StudentDB();

    protected ArrayList<Student> mStudents;

    static public StudentDB getInstance() {
        return ourInstance;
    }

    private StudentDB() {
    }

    public ArrayList<Student> getStudents() {
        return mStudents;
    }

    public void setStudents(ArrayList<Student> students) {
        mStudents = students;
    }

    public void addStudent(Student student){
        mStudents.add(student);
    }
}
