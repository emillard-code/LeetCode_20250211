package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(removeAllOccurrencesOfASubstring("daabcbaabcbc", "abc"));
        System.out.println(removeAllOccurrencesOfASubstring("axxxxyyyyb", "xy"));

    }

    // This method removes all occurrences of a substring and returns the final result.
    public static String removeAllOccurrencesOfASubstring(String s, String part) {

        // This while loop will continue as long as string s still contains the substring.
        while (s.contains(part)) {

            // We loop through string s starting from the leftmost index.
            for (int i = 0; i < s.length(); i++) {

                // Whenever we find an occurrence of the substring part, we remove it from string s.
                if (s.startsWith(part, i)) {
                    s = s.substring(0, i) + s.substring(i + part.length());
                }

            }

        }

        // Once we have exited the while loop, we then return string s.
        return s;

    }

}
