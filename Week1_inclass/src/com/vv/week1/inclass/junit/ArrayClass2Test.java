package com.vv.week1.inclass.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayClass2Test {

	@Test
	public void testPass()
	{
		assertTrue(ArrayClass2.isPass(80));
		assertFalse(ArrayClass2.isPass(45));
	}
	@Test
	public void testGrade()
	{
		assertEquals('A',ArrayClass2.grade(95));
		assertEquals('B',ArrayClass2.grade(89));
		assertEquals('C',ArrayClass2.grade(70));
		assertEquals('D',ArrayClass2.grade(62));
		assertEquals('F',ArrayClass2.grade(54));
	}

}
