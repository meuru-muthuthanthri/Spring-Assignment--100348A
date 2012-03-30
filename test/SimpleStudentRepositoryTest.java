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

public class SimpleStudentRepositoryTest {

    StudentRepository repo;
    Student testStudent;

    @Before
    public void setUp() {
        testStudent = new Student();
        testStudent.setFirstName("Sumal");
        testStudent.setLastName("Fernando");
        testStudent.setRegNumber(100100);
        testStudent.setGender("male");

        repo = new SimpleStudentRepository();


    }

    @Test
    public void testSaveStudent() {
        repo.saveStudent(testStudent);
        if (!repo.findAllStudents().contains(testStudent)) {
            Assert.fail();
        }

    }

    @Test
    public void testdeleteStudent() {
        repo.saveStudent(testStudent);

        repo.deleteStudent(testStudent);
        Assert.assertEquals(0, repo.findAllStudents().size());
    }

    @Test
    public void testfindStudent() {
        repo.saveStudent(testStudent);
        Assert.assertEquals(testStudent, repo.findStudent(100100));
    }
}
