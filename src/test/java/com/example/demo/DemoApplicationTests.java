package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Test
	void testTwoIntegersAreEqual() {
		int a = 1;
		int b = 1;
		assert(a == b);
	}

	@Test
	void testTwoStringsAreEqual() {
		String a = "Hello";
		String b = "Hello";
		assert(a.equals(b));
	}
}
