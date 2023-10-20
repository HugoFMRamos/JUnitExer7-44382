import org.example.Mark;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarkTest {

    private static Mark mark;

    @BeforeAll
    public static void setUp() {
        int studentNum = 44382;
        double grade = 15.0;

        mark = new Mark(studentNum, grade);
    }

    @Test
    public void checkGetters() {
        int expectedNum = 44382;
        int studentNum = mark.getStudentNumber();
        double expectedGrade = 15.0;
        double grade = mark.getMark();

        assertEquals(expectedNum, studentNum);
        assertEquals(expectedGrade, grade);
    }

    @Test
    public void checkSetters() {
        int expectedNum = 42906;
        mark.setStudentNumber(42906);
        double expectedGrade = 17.0;
        mark.setMark(17.0);

        assertEquals(expectedNum, mark.getStudentNumber());
        assertEquals(expectedGrade, mark.getMark());
    }
}

