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
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy and Bob");
	}
	
	@Test
	void test_ex5() {
		assertEquals(Welcome.welcome("Amy, bob,jerry"),"Hello, Amy, Bob and Jerry");
	}
	
	@Test
	void test_ex6() {
		assertEquals(Welcome.welcome("Amy,BOB,Jerry"),"Hello, Amy and Jerry. AND HELLO BOB !");
	}
	
	@Test
	void test_ex7_1() {
		assertEquals(Welcome.welcome("bob,amy,jerry"),"Hello, Bob, Amy and Jerry");
	}
	
	@Test
	void test_ex7_2() {
		assertEquals(Welcome.welcome("bob,AMY,jerry,JACK"),"Hello, Bob and Jerry. AND HELLO AMY AND JACK !");
	}
	
	@Test
	void test_ex8() {
		assertEquals(Welcome.welcome("bob   ,amy  "),"Hello, Bob and Amy");
	}
}
