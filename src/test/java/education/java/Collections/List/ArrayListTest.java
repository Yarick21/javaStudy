package education.java.Collections.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListTest {

    private final List<Integer> listInt = List.of(1, 2, 3, 4, 5);

    @Test
    public void arrayListTest() {
        //region qwe
        Integer expectedInt = 15;
        var sumOfEl = listInt
                .stream()
                .reduce((a, b) -> a + b)
                .get();
        //endregion

        assertAll(
                () -> assertTrue(listInt.contains(1)),
                () -> Assertions.assertEquals(expectedInt, sumOfEl)
        );
    }
}
