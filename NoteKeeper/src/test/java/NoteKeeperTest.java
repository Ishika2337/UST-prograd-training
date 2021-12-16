import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class NoteKeeperTest {
    NoteKeeper noteKeeper = new NoteKeeper();

    @BeforeEach
    public void AddItems() {
        noteKeeper.addList("Homework",true);
        noteKeeper.addList("Assignment",false);
        noteKeeper.addList("Exercise Daily",true);
        noteKeeper.addList("Sleep on Time",false);
    }


    @Test
    public void AddItemsInTodoList() {
        String actualList = noteKeeper.checkList("Homework");
        assertEquals("Homework", actualList);
    }


    @Test
    public void RemoveItemsFromTodoList() {
        PriorityQueue actualList = noteKeeper.removeList("Assignment");
        PriorityQueue expectedList = new PriorityQueue(List.of("Exercise Daily", "Homework", "Homework", "Sleep on Time"));
        assertArrayEquals(actualList.toArray(),expectedList.toArray());
    }


    @Test
    public void unRemoveItemsFromTodoList() {
        PriorityQueue actualList = noteKeeper.unRemoveList("Assignment");
        PriorityQueue expectedList = new PriorityQueue(List.of("Assignment", "Exercise Daily", "Homework", "Sleep on Time", "Homework"));
        assertArrayEquals(expectedList.toArray(), actualList.toArray());
    }


    @Nested
    public class toggleBetweenCompletedAndNotCompletedTodoList {

        @Test
        public void checkIfTaskIsCompleted() {
            boolean actualList = noteKeeper.completedOrNotCompleted("Homework");
            assertEquals(true, actualList);
        }

        @Test
        public void checkIfTaskIsNotCompleted() {
            boolean actualList = noteKeeper.completedOrNotCompleted("Assignment");
            assertEquals(false, actualList);
        }
    }
}

