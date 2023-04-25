package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void test_ex1() {
		assertEquals(Welcome.welcome("bob"),"Hello, Bob");
	}
	
	@Test
	void test_ex2() {
		assertEquals(Welcome.welcome(""),"Hello, my friend");
	}
	
	@Test
	void test_ex3() {
		assertEquals(Welcome.welcome("JERRY"),"HELLO, JERRY !");
	}
	
	@Test
	void test_ex4() {
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy, Bob");
	}
	
	@Test
	void test_ex5() {
		assertEquals(Welcome.welcome("Amy, bob,jerry"),"Hello, Amy, Bob, Jerry");
	}
	
	@Test
	void test_ex6() {
		assertEquals(Welcome.welcome("Amy,BOB,Jerry"),"Hello, Amy, Jerry. AND HELLO, BOB !");
	}
}
