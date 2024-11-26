package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class FixedMainMethodTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
    private FixedPrinttokens fixedPrinttokens;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        fixedPrinttokens = new FixedPrinttokens();
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testMainWithNoArgs() {
        // Provide test input that will be read from System.in
        String testInput = "if x\n"; // Simple test input followed by newline
        ByteArrayInputStream testIn = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(testIn);

        String[] args = {};
        FixedPrinttokens.main(args);

        String output = outContent.toString();
        assertTrue(output.contains("keyword,\"if\"") &&
                        output.contains("identifier,\"x\""),
                "Should process input from System.in");
    }

    @Test
    void testMainWithValidFile() {
        String[] args = {"C:\\Users\\Cesar\\IdeaProjects\\ProjTest\\test-printtokens-onlyme_\\src\\test\\tests.txt"};
        FixedPrinttokens.main(args);
        String output = outContent.toString();
        assertTrue(output.contains("keyword,\"if\"") ||
                        output.contains("identifier,\"x\"") ||
                        output.contains("numeric,42"),
                "Output should contain at least some valid tokens");
    }

    @Test
    void testMainWithEmptyFile() {
        String[] args = {"C:\\Users\\Cesar\\IdeaProjects\\ProjTest\\test-printtokens-onlyme_\\src\\test\\emptyFile.txt"};
        FixedPrinttokens.main(args);
        assertEquals("", outContent.toString().trim(),
                "Empty file should produce no output");
    }

    @Test
    void testMainWithNonexistentFile() {
        String[] args = {"nonexistent.txt"};
        FixedPrinttokens.main(args);
        String output = outContent.toString();
        assertTrue(output.contains("The file nonexistent.txt doesn't exists"),
                "Should show error message for non-existent file");
    }

    @Test
    void testMainWithTooManyArgs() {
        String[] args = {"file1.txt", "file2.txt"};
        FixedPrinttokens.main(args);
        assertEquals("Error! Please give the token stream\n", outContent.toString(),
                "Should show error message for too many arguments");
    }

    @Test
    void cleanup() {
        restoreStreams();
        assertTrue(true); // Just to have a passing assertion
    }
}