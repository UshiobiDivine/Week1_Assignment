package Class;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListOfClassesTest {
    ListOfClasses list = new ListOfClasses();

    @Test
    void addAll() {
        Clas clas = new Clas("SS1");
        Clas clas1 = new Clas("SS2");
        List<Clas> theList = list.addAll(clas,clas1);
        assertEquals(2,theList.size());
    }
}