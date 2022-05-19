class LetterCasePermutation {
// 784. problems/letter-case-permutation
    List<String> result = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        char[] array = s.toCharArray();
        helper(array, 0);         
        return result;
    }
    private void helper(char[] array, int i) {
        if (i == array.length) {
            result.add(String.valueOf(array));
            return;
        }
        if (Character.isLetter(array[i])) {
            array[i] = Character.toLowerCase(array[i]);
            helper(array, i + 1);
            array[i] = Character.toUpperCase(array[i]);
            helper(array, i + 1);
        } else helper(array, i + 1);
    }
}
