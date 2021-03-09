package solutions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void printNumsAboveAndBelow() {
        int[] numsToTest = new int[]{3, 5, 7, 23, 45, 3};
        int value = 6;
        assertEquals("above: 3, below: 3", Main.printNumsAboveAndBelow(numsToTest, value));
    }

    @Test
    void rotateString() {
        String testString = "MyString";
        int numToRotate = 2;
        assertEquals("ngMyStri", Main.rotateString(testString, numToRotate));
    }
}