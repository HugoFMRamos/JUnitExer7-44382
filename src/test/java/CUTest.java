import org.example.CU;
import org.example.Mark;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CUTest {

    private static CU cu = new CU("QS");;
    private static Mark mark;

    @BeforeAll
    public static void setUp() {
        cu = new CU("QS");
        cu.insertMarkCU(44382, 15.0);
        cu.insertMarkCU(42507, 14.0);
        cu.insertMarkCU(33510, 9.0);
        cu.insertMarkCU(44578, 8.5);
    }

    @Test
    public void checkNumStudents() {
        int expected = 4;
        int totalStudents = cu.getTotalStudents();
        assertEquals(expected, totalStudents);
    }

    @Test
    public void checkGetters() {
        String expected = "QS";
        String nameCU = cu.getNameCU();
        assertEquals(expected, nameCU);
    }

    @Test
    public void checkSetters() {
        String expected = "Qualidade Software";
        cu.setNameCU("Qualidade Software");
        assertEquals(expected, cu.getNameCU());
    }

    @ParameterizedTest
    @ValueSource(ints = {44382, 42507, 33510, 44578})
    public void checkGetters(int studentNum) {
        double notExpectedGrade = -1.0;
        double grade = cu.searchStudent(studentNum);
        assertNotEquals(-1.0, grade);
    }

    @ParameterizedTest
    @ValueSource(ints = {44382, 42507, 33510, 44578})
    public void checkSearch(int studentNum) {
        double notExpectedGrade = -1.0;
        double grade = cu.searchStudent(studentNum);
        assertNotEquals(-1.0, grade);
    }

    @Test
    public void checkAverage() {
        double expected = (15.0 + 14.0 + 9.0 + 8.5) / 4;
        double averageGrade = cu.averageCU();
        assertEquals(expected, averageGrade);
    }

    @ParameterizedTest
    @ValueSource(ints = {44382, 42507})
    public void checkIsApprovedTrue(int studentNum) {
        assertTrue(cu.isApproved(studentNum));
    }

    @ParameterizedTest
    @ValueSource(ints = {33510, 44578})
    public void checkIsApprovedFalse(int studentNum) {
        assertFalse(cu.isApproved(studentNum));
    }
}
