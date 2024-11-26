package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class FixedNonMainMethodsTest {

    @Test
    public void is_token_end_test1() {
        // Test when char is space
        assertTrue(FixedPrinttokens.is_token_end(0, ' '));
    }

    @Test
    public void is_token_end_test2() {
        // Test when char is tab
        assertTrue(FixedPrinttokens.is_token_end(0, '\t'));
    }

    @Test
    public void is_token_end_test3() {
        // Test when char is newline
        assertTrue(FixedPrinttokens.is_token_end(0, '\n'));
    }

    @Test
    public void is_token_end_test4() {
        // Test when char is carriage return
        assertTrue(FixedPrinttokens.is_token_end(0, '\r'));
    }

    @Test
    public void is_token_end_test5() {
        // Test when char is null character
        assertTrue(FixedPrinttokens.is_token_end(0, '\0'));
    }

    @Test
    public void is_token_end_test6() {
        // Test when char is opening parenthesis
        assertTrue(FixedPrinttokens.is_token_end(0, '('));
    }

    @Test
    public void is_token_end_test7() {
        // Test when char is not a token end
        assertFalse(FixedPrinttokens.is_token_end(0, 'a'));
    }

    @Test
    public void is_comment_test1() {
        // Test with semicolon (comment)
        assertTrue(FixedPrinttokens.is_comment(";"));
    }

    @Test
    public void is_comment_test2() {
        // Test with non-comment character
        assertFalse(FixedPrinttokens.is_comment("a"));
    }

    @Test
    public void is_keyword_test1() {
        // Test with "and" keyword
        assertTrue(FixedPrinttokens.is_keyword("and"));
    }

    @Test
    public void is_keyword_test2() {
        // Test with "or" keyword
        assertTrue(FixedPrinttokens.is_keyword("or"));
    }

    @Test
    public void is_keyword_test3() {
        // Test with "if" keyword
        assertTrue(FixedPrinttokens.is_keyword("if"));
    }

    @Test
    public void is_keyword_test4() {
        // Test with "xor" keyword
        assertTrue(FixedPrinttokens.is_keyword("xor"));
    }

    @Test
    public void is_keyword_test5() {
        // Test with "lambda" keyword
        assertTrue(FixedPrinttokens.is_keyword("lambda"));
    }

    @Test
    public void is_keyword_test6() {
        // Test with "=>" keyword
        assertTrue(FixedPrinttokens.is_keyword("=>"));
    }

    @Test
    public void is_keyword_test7() {
        // Test with non-keyword
        assertFalse(FixedPrinttokens.is_keyword("notakeyword"));
    }

    @Test
    public void is_char_constant_test1() {
        // Test with valid character constant format
        assertTrue(FixedPrinttokens.is_char_constant("#a"));
    }

    @Test
    public void is_char_constant_test2() {
        // Test with invalid character constant (no #)
        assertFalse(FixedPrinttokens.is_char_constant("a"));
    }

    @Test
    public void is_char_constant_test3() {
        // Test with invalid character constant (number)
        assertFalse(FixedPrinttokens.is_char_constant("#1"));
    }

    @Test
    public void is_char_constant_test4() {
        // Test with invalid character constant (too long)
        assertFalse(FixedPrinttokens.is_char_constant("#ab"));
    }

    @Test
    public void is_num_constant_test1() {
        // Test with single digit
        assertTrue(FixedPrinttokens.is_num_constant("5"));
    }

    @Test
    public void is_num_constant_test2() {
        // Test with multiple digits
        assertTrue(FixedPrinttokens.is_num_constant("123"));
    }

    @Test
    public void is_num_constant_test3() {
        // Test with non-numeric string
        assertFalse(FixedPrinttokens.is_num_constant("abc"));
    }

    @Test
    public void is_num_constant_test4() {
        // Test with mixed numeric and alpha
        assertFalse(FixedPrinttokens.is_num_constant("123a"));
    }

    @Test
    public void is_str_constant_test1() {
        // Test with valid string constant
        assertTrue(FixedPrinttokens.is_str_constant("\"hello\""));
    }

    @Test
    public void is_str_constant_test2() {
        // Test with empty string
        assertTrue(FixedPrinttokens.is_str_constant("\"\""));
    }

    @Test
    public void is_str_constant_test3() {
        // Test with invalid string (missing end quote)
        assertFalse(FixedPrinttokens.is_str_constant("\"hello"));
    }

    @Test
    public void is_str_constant_test4() {
        // Test with invalid string (missing start quote)
        assertFalse(FixedPrinttokens.is_str_constant("hello\""));
    }

    @Test
    public void is_identifier_test1() {
        // Test with valid identifier (single letter)
        assertTrue(FixedPrinttokens.is_identifier("a"));
    }

    @Test
    public void is_identifier_test2() {
        // Test with valid identifier (letters and numbers)
        assertTrue(FixedPrinttokens.is_identifier("abc123"));
    }

    @Test
    public void is_identifier_test3() {
        // Test with invalid identifier (starts with number)
        assertFalse(FixedPrinttokens.is_identifier("1abc"));
    }

    @Test
    public void is_identifier_test4() {
        // Test with invalid identifier (special characters)
        assertFalse(FixedPrinttokens.is_identifier("abc!"));
    }

    @Test
    public void is_identifier_test5() {
        // Test with keyword (should not be identifier)
        assertFalse(FixedPrinttokens.is_identifier("and"));
    }

    @Test
    public void print_spec_symbol_test1() {
        // Test with left parenthesis
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        FixedPrinttokens.print_spec_symbol("(");
        assertEquals("lparen.\n", output.toString());
        System.setOut(System.out);
    }

    @Test
    public void print_spec_symbol_test2() {
        // Test with right parenthesis
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        FixedPrinttokens.print_spec_symbol(")");
        assertEquals("rparen.\n", output.toString());
        System.setOut(System.out);
    }

    @Test
    public void print_spec_symbol_test3() {
        // Test with left square bracket
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        FixedPrinttokens.print_spec_symbol("[");
        assertEquals("lsquare.\n", output.toString());
        System.setOut(System.out);
    }

    @Test
    public void print_spec_symbol_test4() {
        // Test with invalid special symbol
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        FixedPrinttokens.print_spec_symbol("x");
        assertEquals("error,\"x\".\n", output.toString());
        System.setOut(System.out);
    }
}