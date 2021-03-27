package others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class NonAcademicStaffsTest {
    private NonAcademicStaffs nonAcademicStaffs = new NonAcademicStaffs("Divine");

    @Test
    void getName() {
        assertEquals("Divine", nonAcademicStaffs.getName());
    }

    @Test
    void getId() {
        assertEquals(1,nonAcademicStaffs.getId());
    }
}