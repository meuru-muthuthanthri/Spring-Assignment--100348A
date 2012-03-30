package org.cse.springtute;

import java.util.ArrayList;

public class StudentManagementSystem {

    private StudentRepository repo;

    public StudentManagementSystem(StudentRepository repo) {
        this.repo = repo;
    }

    public void listAllStudents() {
        ArrayList<Student> students = new ArrayList<Student>();
        students.addAll(repo.findAllStudents());
        for(Student stu : students){
            System.out.println("Name : "+stu.getFirstName()+ " " + stu.getLastName() + "   RegNo: "+ stu.getRegNumber()+ "          Gender :" + stu.getGender());
        }
    }

    public void registerStudent(Student stu) {
        repo.saveStudent(stu);
    }
}
