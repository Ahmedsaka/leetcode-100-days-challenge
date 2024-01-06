package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeAlternativelyTest {

    MergeAlternately mergeAlternately = new MergeAlternately();
    @Test
    public void test_empty_string_if_either_word_empty() {
        assertEquals("", mergeAlternately.mergeAlternately("", "pqrs"));
        assertEquals("", mergeAlternately.mergeAlternately("ab", ""));
    }

    @Test
    public void test_merge_alternately_equal_length_strings() {
        String result = mergeAlternately.mergeAlternately("abc", "123");
        assertEquals("a1b2c3", result);
    }
}
