package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class NonMainMethodsTest {

    @Test
    public void is_token_end_test1() {
        // Test when char is space
        assertTrue(org.example.Printtokens.is_token_end(' ', 0));
    }

    @Test
    public void is_token_end_test2() {
        // Test when char is tab
        assertTrue(org.example.Printtokens.is_token_end('\t', 0));
    }

    @Test
    public void is_token_end_test3() {
        // Test when char is newline
        assertTrue(org.example.Printtokens.is_token_end('\n', 0));
    }

    @Test
    public void is_token_end_test4() {
        // Test when char is carriage return
        assertTrue(org.example.Printtokens.is_token_end('\r', 0));
    }

    @Test
    public void is_token_end_test5() {
        // Test when char is null character
        assertTrue(org.example.Printtokens.is_token_end('\0', 0));
    }

    @Test
    public void is_token_end_test6() {
        // Test when char is opening parenthesis
        assertTrue(org.example.Printtokens.is_token_end('(', 0));
    }

    @Test
    public void is_token_end_test7() {
        // Test when char is not a token end
        assertFalse(org.example.Printtokens.is_token_end('a', 0));
    }

    @Test
    public void is_comment_test1() {
        // Test with semicolon (comment)
        assertTrue(org.example.Printtokens.is_comment(";"));
    }

    @Test
    public void is_comment_test2() {
        // Test with non-comment character
        assertFalse(org.example.Printtokens.is_comment("a"));
    }

    @Test
    public void is_keyword_test1() {
        // Test with "and" keyword
        assertTrue(org.example.Printtokens.is_keyword("and"));
    }

    @Test
    public void is_keyword_test2() {
        // Test with "or" keyword
        assertTrue(org.example.Printtokens.is_keyword("or"));
    }

    @Test
    public void is_keyword_test3() {
        // Test with "if" keyword
        assertTrue(org.example.Printtokens.is_keyword("if"));
    }

    @Test
    public void is_keyword_test4() {
        // Test with "xor" keyword
        assertTrue(org.example.Printtokens.is_keyword("xor"));
    }

    @Test
    public void is_keyword_test5() {
        // Test with "lambda" keyword
        assertTrue(org.example.Printtokens.is_keyword("lambda"));
    }

    @Test
    public void is_keyword_test6() {
        // Test with "=>" keyword
        assertTrue(org.example.Printtokens.is_keyword("=>"));
    }

    @Test
    public void is_keyword_test7() {
        // Test with non-keyword
        assertFalse(org.example.Printtokens.is_keyword("notakeyword"));
    }

    @Test
    public void is_char_constant_test1() {
        // Test with valid character constant format
        assertTrue(org.example.Printtokens.is_char_constant("#a"));
    }

    @Test
    public void is_char_constant_test2() {
        // Test with invalid character constant (no #)
        assertFalse(org.example.Printtokens.is_char_constant("a"));
    }

    @Test
    public void is_char_constant_test3() {
        // Test with invalid character constant (number)
        assertFalse(org.example.Printtokens.is_char_constant("#1"));
    }

    @Test
    public void is_char_constant_test4() {
        // Test with invalid character constant (too long)
        assertFalse(org.example.Printtokens.is_char_constant("#ab"));
    }

    @Test
    public void is_num_constant_test1() {
        // Test with single digit
        assertTrue(org.example.Printtokens.is_num_constant("5"));
    }

    @Test
    public void is_num_constant_test2() {
        // Test with multiple digits
        assertTrue(org.example.Printtokens.is_num_constant("123"));
    }

    @Test
    public void is_num_constant_test3() {
        // Test with non-numeric string
        assertFalse(org.example.Printtokens.is_num_constant("abc"));
    }

    @Test
    public void is_num_constant_test4() {
        // Test with mixed numeric and alpha
        assertFalse(org.example.Printtokens.is_num_constant("123a"));
    }

    @Test
    public void is_str_constant_test1() {
        // Test with valid string constant
        assertTrue(org.example.Printtokens.is_str_constant("\"hello\""));
    }

    @Test
    public void is_str_constant_test2() {
        // Test with empty string
        assertTrue(org.example.Printtokens.is_str_constant("\"\""));
    }

    @Test
    public void is_str_constant_test3() {
        // Test with invalid string (missing end quote)
        assertFalse(org.example.Printtokens.is_str_constant("\"hello"));
    }

    @Test
    public void is_str_constant_test4() {
        // Test with invalid string (missing start quote)
        assertFalse(org.example.Printtokens.is_str_constant("hello\""));
    }

    @Test
    public void is_identifier_test1() {
        // Test with valid identifier (single letter)
        assertTrue(org.example.Printtokens.is_identifier("a"));
    }

    @Test
    public void is_identifier_test2() {
        // Test with valid identifier (letters and numbers)
        assertTrue(org.example.Printtokens.is_identifier("abc123"));
    }

    @Test
    public void is_identifier_test3() {
        // Test with invalid identifier (starts with number)
        assertFalse(org.example.Printtokens.is_identifier("1abc"));
    }

    @Test
    public void is_identifier_test4() {
        // Test with invalid identifier (special characters)
        assertFalse(org.example.Printtokens.is_identifier("abc!"));
    }

    @Test
    public void is_identifier_test5() {
        // Test with keyword (should not be identifier)
        assertFalse(org.example.Printtokens.is_identifier("and"));
    }

    @Test
    public void print_spec_symbol_test1() {
        // Test with left parenthesis
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        org.example.Printtokens.print_spec_symbol("(");
        assertEquals("lparen.\n", output.toString());
    }

    @Test
    public void print_spec_symbol_test2() {
        // Test with right parenthesis
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        org.example.Printtokens.print_spec_symbol(")");
        assertEquals("rparen.\n", output.toString());
    }

    @Test
    public void print_spec_symbol_test3() {
        // Test with left square bracket
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        org.example.Printtokens.print_spec_symbol("[");
        assertEquals("lsquare.\n", output.toString());
    }

    @Test
    public void print_spec_symbol_test4() {
        // Test with invalid special symbol
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        org.example.Printtokens.print_spec_symbol("x");
        assertEquals("error,\"x\".\n", output.toString());
    }
}