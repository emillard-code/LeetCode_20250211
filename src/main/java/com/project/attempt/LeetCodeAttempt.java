package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(removeAllOccurrencesOfASubstring("daabcbaabcbc", "abc"));
        System.out.println(removeAllOccurrencesOfASubstring("axxxxyyyyb", "xy"));

    }

    public static String removeAllOccurrencesOfASubstring(String s, String part) {

        while (s.contains(part)) {

            for (int i = 0; i < s.length(); i++) {

                if (s.startsWith(part, i)) {
                    s = s.substring(0, i) + s.substring(i + part.length());
                }

            }

        }

        return s;

    }

}
