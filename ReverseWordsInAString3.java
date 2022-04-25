class ReverseWordsInAString3 {
// 557. problems/reverse-words-in-a-string-iii/
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        reverse(chars, 0);
        return String.valueOf(chars);
    }

    void reverse(char[] chars, int i) {
        int l = i, r = i;
        while (r < chars.length && chars[r] != ' ') {
            r++;
        }
        
        i = r;

        while (l < --r) {
            char temp = chars[l];
            chars[l++] = chars[r];
            chars[r] = temp;
        }

        if (i < chars.length) {
            reverse(chars, i + 1);
        }
    }
}
