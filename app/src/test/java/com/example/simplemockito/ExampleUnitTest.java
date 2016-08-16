package com.example.simplemockito;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void testReverseString_isCorrect() throws Exception {
        assertEquals("kobra", new ReverseString().doReverseString("arbok"));
    }
}