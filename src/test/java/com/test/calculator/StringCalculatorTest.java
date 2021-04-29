package com.test.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	String test1Input = "";
	int test1Output = 0;

	String test2Input = "1";
	int test2Output = 1;

	String test3Input = "1,2";
	int test3Output = 3;

	String test4Input = "//;\n1;2";
	int test4Output = 3;

	String test5Input = "//[***]\n1***2***3";
	int test5Output = 6;

	String test6Input = "//[*][%]\n1*2%3";
	int test6Output = 6;

	String test7Input = "//[**][%%]\n1**2%%3";
	int test7Output = 6;

	@Test
	void test() {
		StringCalculator sc = new StringCalculator();

		assertEquals(test1Output, sc.add(test1Input));

		assertEquals(test2Output, sc.add(test2Input));

		assertEquals(test3Output, sc.add(test3Input));

		assertEquals(test4Output, sc.add(test4Input));

		assertEquals(test5Output, sc.add(test5Input));

		assertEquals(test6Output, sc.add(test6Input));

		assertEquals(test7Output, sc.add(test7Input));
	}
	
	@AfterEach
	void testing() {
		System.out.println("Number of times add() called is: "+StringCalculator.count);
	}

}
