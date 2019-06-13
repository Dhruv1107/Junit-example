package com.dhruv.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAFromFirst2CharsTest {
	
	/*
	 *Remove A if present in first two characters of the string
	 *	1. empty character : "" = "" 
	 *	2. 1 character	: A = "", B = B
	 *	3. 2 characters	: AB = B, AA = "", CD = CD	
	 *	4. 4 characters : ABCD = BCD
	 *	5. N characters	: AABAA = BAA
	 */
	RemoveAFromFirst2Chars rem;
	
	@BeforeEach
	void setUp() {
		rem = new RemoveAFromFirst2Chars();
	}
	
	@Test
	void testEmptyCharacter() {
		assertEquals("", rem.remove(""));
	}

	@Test
	void test1Character() {
		assertEquals("B", rem.remove("B"));
		assertEquals("", rem.remove("A"));
	}
	
	@Test
	void test2Characters() {
		assertEquals("B", rem.remove("AB"));
		assertEquals("", rem.remove("AA"));
		assertEquals("CD", rem.remove("CD"));
	}
	
	@Test
	void test4Characters() {
		assertEquals("BCD", rem.remove("ABCD"));
		assertEquals("CD", rem.remove("AACD"));
		assertEquals("BCD", rem.remove("BACD"));
		assertEquals("BBAA", rem.remove("BBAA"));
	}
	
	@Test
	void testNCharacters() {
		assertEquals("BAA", rem.remove("AABAA"));
		assertEquals("BBAA", rem.remove("ABBAA"));
		assertEquals("BAAAA", rem.remove("BAAAAA"));
		assertEquals("BBBBB", rem.remove("BBBBB"));
	}
	
}
