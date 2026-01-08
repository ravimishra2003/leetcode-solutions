class Solution {
    public int compress(char[] chars) {
        int idx = 0;  // write pointer
        int i = 0;    // read pointer

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            // count consecutive characters
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            // write character
            chars[idx++] = current;

            // write count if > 1
            if (count > 1) {
                char[] freq = Integer.toString(count).toCharArray();
                for (char c : freq) {
                    chars[idx++] = c;
                }
            }
        }
        return idx;
    }
}