package code.war.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import code.war.kata.RectangleIntoSquares;

public class RectangleIntoSquaresTest {
	@Test
	public void sqInRecMethodTest1() {
		List<Integer> res = new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1));
		for (int r : res)
			assertEquals(r, RectangleIntoSquares.sqInRect(5, 3));
	}

	@Test
	public void sqInRecMethodTest2() {
		assertEquals(null, RectangleIntoSquares.sqInRect(5, 5));
	}

	@Test
	public void cleverSqInRectMethodTest1() {
		List<Integer> res = new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1));
		for (int r : res)
			assertEquals(r, RectangleIntoSquares.cleverSqInRect(5, 3));
	}

	@Test
	public void cleverSqInRectMethodTest2() {
		assertEquals(null, RectangleIntoSquares.cleverSqInRect(5, 5));
	}
}
