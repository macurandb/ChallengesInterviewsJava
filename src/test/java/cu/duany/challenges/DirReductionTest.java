package cu.duany.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DirReductionTest {
    @Test
    public void test1() {


        assertArrayEquals(new String[]{"WEST"},
                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
    }

    @Test
    public void test2() {
        assertArrayEquals(
                new String[]{},
                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"}));
    }

    @Test
    public void test3() {
        assertThrows(IllegalArgumentException.class, () ->  DirReduction.dirReduc(new String[]{"NORTH1", "SOUTH2", "SOUTH", "EAST"}));
    }
}
