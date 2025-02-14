package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void removeAllOccurrencesOfASubstringTest() {

        assertEquals("dab", LeetCodeAttempt.removeAllOccurrencesOfASubstring("daabcbaabcbc", "abc"));
        assertEquals("ab", LeetCodeAttempt.removeAllOccurrencesOfASubstring("axxxxyyyyb", "xy"));

    }

}
