package com.techcenture.challenges;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StringChallengesTest {

    StringChallenges challenges = null;
    @BeforeEach
    void setUp() {
        challenges = new StringChallenges();
    }

    @Test
    void helloName() {
       assertEquals(challenges.helloName("Alex"),"Hello Alex!");
       assertEquals(challenges.helloName(""),"Hello !");
    }

    @Test
    void withoutEnd() {
        assertEquals(challenges.withoutEnd("ab"),"");
        assertEquals(challenges.withoutEnd("Hello"),"ell");
        assertEquals(challenges.withoutEnd("code"),"od");
        assertEquals(challenges.withoutEnd(""),"");
    }

    @Test
    void returnLarger() {
        assertEquals(challenges.returnLarger("ab","abc"), "abc");
        assertEquals(challenges.returnLarger("a",""),"a");
        assertEquals(challenges.returnLarger("","a"),"a");
        assertEquals(challenges.returnLarger("Alex","Balboa"),"Balboa");
    }

    @Test
    void nonStart() {
        assertEquals(challenges.nonStart("Hello","There"),"ellohere");
        assertEquals(challenges.nonStart("java","code"),"avaode");
        assertEquals(challenges.nonStart("a","ac"),"c");
        assertEquals(challenges.nonStart("ac","x"),"c");
        assertEquals(challenges.nonStart("a","b"),"");
        assertEquals(challenges.nonStart("",""),"");
    }

    @Test
    void left2() {
        assertEquals(challenges.left2("hello"),"lloHe");
        assertEquals(challenges.left2("Hi"),"Hi");
        assertEquals(challenges.left2("cat"),"tca");
        assertEquals(challenges.left2("a"),"a");
        assertEquals(challenges.left2(""),"");
    }

    @Test
    void deFront() {
        assertEquals(challenges.deFront("Hello"),"llo");
        assertEquals(challenges.deFront("java"),"va");
        assertEquals(challenges.deFront("away"),"aay");
        assertEquals(challenges.deFront("xby"),"by");
        assertEquals(challenges.deFront("abhello"),"abhello");
        assertEquals(challenges.deFront("ab"),"ab");
        assertEquals(challenges.deFront("bazz"),"zz");
        assertEquals(challenges.deFront("ba"),"");
    }

    @Test
    void doubleChar() {
        assertEquals(challenges.doubleChar("The"),"TThhee");
        assertEquals(challenges.doubleChar(""),"");
        assertEquals(challenges.doubleChar("Word!"),"WWoorrdd!!");
    }

    @Test
    void countHi(){
        assertEquals(challenges.countHi("abc hi ho"),1);
        assertEquals(challenges.countHi("hihi"),2);
        assertEquals(challenges.countHi("Hi is no HI on ahI"),0);
        assertEquals(challenges.countHi(""),0);
    }

    @Test
    void javaPython(){
        assertEquals(challenges.javaPython("javapython"),true);
        assertEquals(challenges.javaPython("javajava"),false);
        assertEquals(challenges.javaPython("javarubypythonpython"),false);
    }

    @Test
    void endOther(){
        assertTrue(challenges.endOther("Hiabc", "abc"));
        assertTrue(challenges.endOther("AbC", "HiaBc"));
        assertFalse(challenges.endOther("Hiabcx", "bc"));
        assertFalse(challenges.endOther("xyz", "12xyz"));
    }
}