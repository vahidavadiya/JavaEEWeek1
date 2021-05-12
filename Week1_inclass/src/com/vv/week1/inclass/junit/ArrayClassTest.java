package com.vv.week1.inclass.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayClassTest {

	@Test
	public void testSum() {
		assertEquals(32,ArrayClass.sum(new int[]{4,5,8,2,9,1,3}));
		assertEquals(33,ArrayClass.sum(new int[]{10,0,7,-3,8,-4,6,9}));
		assertEquals(45,ArrayClass.sum(new int[]{8,5,3,6,1,2,4,7,9}));
		
	}
	@Test
	public void testAverage() {
		assertEquals(4,ArrayClass.Average(new int[]{4,5,8,2,9,1,3}));
		assertEquals(4,ArrayClass.Average(new int[]{10,0,7,-3,8,-4,6,9}));
		assertEquals(5,ArrayClass.Average(new int[]{8,5,3,6,1,2,4,7,9}));
		
	}
	@Test
	public void testMoreThanAverage() {
		assertEquals(3,ArrayClass.greateThanAverage(new int[]{4,5,8,2,9,1,3}));
		assertEquals(5,ArrayClass.greateThanAverage(new int[]{10,0,7,-3,8,-4,6,9}));
		assertEquals(4,ArrayClass.greateThanAverage(new int[]{8,5,3,6,1,2,4,7,9}));
		
	}
	@Test
	public void testCountEven() {
		assertEquals(3,ArrayClass.countEven(new int[]{4,5,8,2,9,1,3}));
		assertEquals(5,ArrayClass.countEven(new int[]{10,0,7,-3,8,-4,6,9}));
		assertEquals(4,ArrayClass.countEven(new int[]{8,5,3,6,1,2,4,7,9}));
		
	}
	@Test
	public void testCountOdd() {
		assertEquals(4,ArrayClass.countOdd(new int[]{4,5,8,2,9,1,3}));
		assertEquals(3,ArrayClass.countOdd(new int[]{10,0,7,-3,8,-4,6,9}));
		assertEquals(5,ArrayClass.countOdd(new int[]{8,5,3,6,1,2,4,7,9}));
		
	}

}
