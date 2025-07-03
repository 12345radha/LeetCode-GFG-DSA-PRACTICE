class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        int i = n - 1;

        while (i >= 0) {
            // Skip trailing or multiple spaces
            while (i >= 0 && s.charAt(i) == ' ') i--;

            if (i < 0) break; // End of processing

            int j = i;

            // Find start of the word
            while (j >= 0 && s.charAt(j) != ' ') j--;

            // Append the word
            res.append(s.substring(j + 1, i + 1));

            // Add space only if more words are left
            if(j>0)
            res.append(" ");

            // Move to the next word
            i = j;
        }

        // Remove the trailing space
        return res.toString().trim();
    }
}
