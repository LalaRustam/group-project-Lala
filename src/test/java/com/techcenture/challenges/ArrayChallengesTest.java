package com.techcenture.challenges;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayChallengesTest {

    ArrayChallenges challenges;
    @BeforeEach
    void setUp() {
        challenges = new ArrayChallenges();
    }

    @Test
    void countEvens() {
        assertEquals(challenges.countEvens(new int[]{2, 1, 2, 3, 4}),3);
        assertEquals(challenges.countEvens(new int[]{2, 2,0}),3);
        assertEquals(challenges.countEvens(new int[]{}),0);
    }

    @Test
    void bigDiff() {
        assertEquals(challenges.bigDiff(new int[]{10,3,5,6}),7);
        assertEquals(challenges.bigDiff(new int[]{2}),0);
        assertEquals(challenges.bigDiff(new int[]{2,2}),0);
        assertEquals(challenges.bigDiff(new int[]{10,0}), 10);
    }

    @Test
    void sum13() {
        assertEquals(challenges.sum13(new int[]{1, 2, 2, 1}),6);
        assertEquals(challenges.sum13(new int[]{1, 2, 2, 1, 13}),6);
        assertEquals(challenges.sum13(new int[]{13,4,3,3,2}),0);
        assertEquals(challenges.sum13(new int[]{1,2,3,13,3,4}),6);
    }

    @Test
    void has22() {
        assertTrue(challenges.has22(new int[]{1, 2, 2}));
        assertFalse(challenges.has22(new int[]{1, 2, 1,2}));
        assertFalse(challenges.has22(new int[]{}));
    }

    @Test
    void lucky13() {
        assertTrue(challenges.lucky13(new int[]{0, 2, 4}));
        assertFalse(challenges.lucky13(new int[]{1,2,3}));
        assertTrue(challenges.lucky13(new int[]{2}));
        assertFalse(challenges.lucky13(new int[]{4,2,1}));
        assertFalse(challenges.lucky13(new int[]{3,2,6}));
    }

    @Test
    void more14() {
        assertTrue(challenges.more14(new int[]{1, 4, 1}));
        assertFalse(challenges.more14(new int[]{1,4,1,4}));
        assertTrue(challenges.more14(new int[]{1,1}));
        assertFalse(challenges.more14(new int[]{4}));
    }

    @Test
    void fizzArray() {
      assertArrayEquals(challenges.fizzArray(4),new int[]{0,1,2,3});
        assertArrayEquals(challenges.fizzArray(1),new int[]{0});
        assertArrayEquals(challenges.fizzArray(0),new int[]{});
    }

    @Test
    void isEverywhere() {
        assertTrue(challenges.isEverywhere(new int[]{1,2,1,3},1));
        assertFalse(challenges.isEverywhere(new int[]{1,2,1,3},2));
        assertFalse(challenges.isEverywhere(new int[]{1, 2, 1, 3, 4},1));
        assertTrue(challenges.isEverywhere(new int[]{3},1));
        assertTrue(challenges.isEverywhere(new int[]{},1));
        assertTrue(challenges.isEverywhere(new int[]{3,1},3));
    }

    @Test
    void matchUp() {
        assertEquals(challenges.matchUp(new int[]{1,2,3},new int[]{2,3,10}),2);
        assertEquals(challenges.matchUp(new int[]{1,2,3},new int[]{2,3,5}),3);
        assertEquals(challenges.matchUp(new int[]{5,3},new int[]{0,0}),0);
        assertEquals(challenges.matchUp(new int[]{5,3}, new int[]{5,5}),1);
    }

    @Test
    void modThree() {
        assertTrue(challenges.modThree(new int[]{2,1,3,5}));
        assertTrue(challenges.modThree(new int[]{2,4,2,5}));
        assertFalse(challenges.modThree(new int[]{2,1,2,5}));
        assertFalse(challenges.modThree(new int[]{1}));
        assertFalse(challenges.modThree(new int[]{1,2}));
    }
}