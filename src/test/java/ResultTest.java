import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultTest {

    @BeforeAll
    static void init(){}

    @AfterAll
    public static void finish(){}

    @Test
    void grading1() {
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(40,45,95,31,40,37));
        List<Integer> actual = Result.gradingStudents(Arrays.asList(6,38,43,95,31,40,37));
        assertEquals(expected, actual);
    }

    @Test
    void grading2() {
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(40,45,95,0,1,40,100,14));
        List<Integer> actual = Result.gradingStudents(Arrays.asList(8,38,43,95,0,1,40,100,14));
        assertEquals(expected, actual);
    }

    @Test
    void validNumberOfStudents1() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(130,38,43,95,0,1,40,100,14));
        assertEquals(expected, actual);
    }

    @Test
    void validNumberOfStudents2() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(-55,38,43,95,0,1,40,100,14));
        assertEquals(expected, actual);
    }

    @Test
    void validNumberOfStudents3() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(3,38,43,95,0,1,40,100,14));
        assertEquals(expected, actual);
    }

    @Test
    void validNumberOfStudents4() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(null,38,43,95,0,1,40,100,14));
        assertEquals(expected, actual);
    }

    @Test
    void validGrades1() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(8,38,43,95,0,-1,40,100,14));
        assertEquals(expected, actual);
    }

    @Test
    void validGrades2() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(8,38,43,95,0,null,40,100,14));
        assertEquals(expected, actual);
    }

    @Test
    void validGrades3() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(Arrays.asList(8,38,43,95,0,101,40,100,14));
        assertEquals(expected, actual);
    }

    @Test
    void validList1() {
        List<Integer> expected = null;
        List<Integer> actual = Result.gradingStudents(null);
        assertEquals(expected, actual);
    }



}
