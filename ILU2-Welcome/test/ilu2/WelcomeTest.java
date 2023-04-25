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
}
