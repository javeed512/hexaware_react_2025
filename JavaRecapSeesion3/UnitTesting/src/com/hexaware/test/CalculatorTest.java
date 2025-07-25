package com.hexaware.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.hexaware.service.Calculator;

class CalculatorTest {
	
	static Calculator cal;
	
	@BeforeAll
	public static void  m1() {
		
		System.out.println("BeforeAll executed..");
		
		cal = new Calculator();
		
	}
	
	@AfterAll
	public static void m2() {
		
		System.out.println("AfterAll executed...");
		
		
	}
	
	@BeforeEach
	public void beforeEach() {
			
			System.out.println("BeforeEach executed..");
		
	}
	
	@AfterEach
	public void afterEach() {
		
		System.out.println("AfterEach executed...");
	}
	
	
	@RepeatedTest(3)
	//@Test
	@DisplayName("Addition")
	void testAdd() {
		
		System.out.println("add() tested..");
		
		int actual =  cal.add(5, 4);
		
		assertEquals(9, actual);
		
	}

	@Test
	//@Disabled
	void testSub() {
		
		 System.out.println("sub() tested..");
		  
			int actual =  cal.sub(5, 4);
			
			assertEquals(1, actual);
			assertNotEquals(2, actual);
			
			assertTrue(actual > 0);
		
	}

	@Test
	void testMul() {
		
		
		System.out.println("mul() tested...");
		
			int actual = cal.mul(5, 5);
		
			assertEquals(25, actual);
		
	}

	@Test
	void testDiv() {
		
		System.out.println("div() tested...");
		
		int actual = cal.div(15, 5);
		
		assertEquals(3, actual);
		
	}
	
	
	
	@ParameterizedTest
	@ValueSource(strings  = { "javeed", "narayana", "pushpalatha", "himanshu" })
	public void test(String name) {
		
		
				System.out.println(name +" name is tested");
				
				assertTrue(name.length() > 5);
		
	}
	
	
	
	

}
