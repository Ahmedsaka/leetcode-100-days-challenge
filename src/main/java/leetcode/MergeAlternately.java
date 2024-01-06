package leetcode;

public class MergeAlternately {

/**
 * This solution is a linkedlist as data structure to solve it
 * Since a list is effectively an array,
 * then a java StringBuild represents a linkedlist implementation of a String
 * */
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        if (word1.length() == 0 || word2.length() == 0) return result.toString();

        int n = Math.max(word1.length(), word2.length()), idx = 0;

        while (idx < n) {
            if (idx <= word1.length()-1)
                result.append(word1.charAt(idx));
            if (idx <= word2.length()-1)
                result.append(word2.charAt(idx));
            idx++;
        }
        return result.toString();
    }
}
