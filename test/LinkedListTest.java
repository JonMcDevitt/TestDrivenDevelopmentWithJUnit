import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    private LinkedList<String> namesList;

    @BeforeEach
    void setUp() {
        namesList = new LinkedList<>();
        assertNotNull(namesList);
    }

    @Test
    void ConstructWithSingleData() {
        namesList = new LinkedList<>("Danny");
        assertNotNull(namesList);
    }

    @Test
    void ConstructWithCollection() {
        ArrayList<String> testNames = new ArrayList<>();
        testNames.add("Dan");
        testNames.add("Grant");
        testNames.add("Ruji");
        testNames.add("Matt");
        testNames.add("Devon");
        testNames.add("Ana");

        namesList = new LinkedList<>(testNames);
        assertNotNull(namesList);
        assertTrue(namesList.Size() == testNames.size());
        assertTrue(namesList.GetHead().equals(namesList.GetTail()));
    }
}