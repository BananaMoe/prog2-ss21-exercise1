import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ResultTest {

    @BeforeAll
    static void init(){

    }

    @AfterAll
    public static void finish(){

    }

    @Test
    void grading1() {
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(40,45,95,31,40));
        List<Integer> actual = Result.gradingStudents(Arrays.asList(5,38,43,95,31,40));
        assertEquals(expected, actual);
    }

    @Test
    void grading2() {
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(40,45,95,0,1,40,100,14));
        List<Integer> actual = Result.gradingStudents(Arrays.asList(8,38,43,95,0,1,40,100,14));
        assertEquals(expected, actual);
    }
}
