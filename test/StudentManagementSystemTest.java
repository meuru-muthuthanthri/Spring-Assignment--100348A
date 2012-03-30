/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import org.cse.springtute.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;

public class StudentManagementSystemTest {

    StudentRepository repo;
    Student testStudent;
    StudentManagementSystem sms;

    @Before
    public void setUp() {
        testStudent = new Student();
        testStudent.setFirstName("Sumal");
        testStudent.setLastName("Fernando");
        testStudent.setRegNumber(100100);
        testStudent.setGender("male");

        repo = new SimpleStudentRepository();

        sms = new StudentManagementSystem(repo);
    }



    @Test
    public void testSaveStudent() {
        sms.registerStudent(testStudent);
        Assert.assertEquals(testStudent, repo.findStudent(100100));

    }
}
