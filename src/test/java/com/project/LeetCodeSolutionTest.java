package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void removeAllOccurrencesOfASubstringTest() {

        assertEquals("dab", LeetCodeSolution.removeOccurrences("daabcbaabcbc", "abc"));
        assertEquals("ab", LeetCodeSolution.removeOccurrences("axxxxyyyyb", "xy"));

    }

}
