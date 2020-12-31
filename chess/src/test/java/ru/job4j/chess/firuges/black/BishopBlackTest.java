package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.assertArrayEquals;

public class BishopBlackTest {


    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Assert.assertEquals(bishopBlack.position(), Cell.C8);
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Assert.assertEquals(bishopBlack.copy(Cell.F4).position(), Cell.F4);
    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] actual = bishopBlack.way(Cell.G5);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        bishopBlack.way(Cell.D1);
    }
}