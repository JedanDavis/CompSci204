package application;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GradeBookTest {

    GradeBook gradeBook1;
    GradeBook gradeBook2;

    @Before
    public void setUp() throws Exception {
        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        gradeBook1.addScore(75);
        gradeBook1.addScore(85);
        gradeBook1.addScore(90);
        gradeBook1.addScore(95);
        gradeBook1.addScore(100);

        gradeBook2.addScore(75.5);
        gradeBook2.addScore(85.5);
        gradeBook2.addScore(90.5);
        gradeBook2.addScore(95.5);
        gradeBook2.addScore(99.5);

    }

    @After
    public void tearDown() throws Exception {
        gradeBook1 = null;
        gradeBook2 = null;

    }

    @Test
    public void testAddScore() {

        assertTrue(gradeBook1.toString().equals("75.0 85.0 90.0 95.0 100.0"));
        assertTrue(gradeBook2.toString().equals("75.5 85.5 90.5 95.5 99.5"));

        assertEquals(gradeBook1.getScoresSize(), 5);
        assertEquals(gradeBook2.getScoresSize(), 5);

    }

    @Test
    public void testSum() {
        assertTrue(gradeBook1.sum() == 445.0);
        assertTrue(gradeBook2.sum() == 446.5);
    }

    @Test
    public void testMinimum() {
        assertTrue(gradeBook1.minimum() == 75.0);
        assertTrue(gradeBook2.minimum() == 75.5);
    }

    @Test
    public void testFinalScore() {
        assertTrue(gradeBook1.finalScore() == 370.0);
        assertTrue(gradeBook2.finalScore() == 371.0);
    }

}
