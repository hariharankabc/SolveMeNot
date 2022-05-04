class PermutationInString {
// 567. problems/permutation-in-string
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Map = new int[26];  // s1 MAP
        int[] wMap = new int[26];   // Window MAP
        for(int i=0; i<s1.length(); i++) {
            char ch = s1.charAt(i);  
            s1Map[ch - 'a']++;
        }
        int start = 0;
        for(int i=0; i<s2.length(); i++) {
            wMap[s2.charAt(i) - 'a']++;
            if(i - start + 1 == s1.length()) {
                if(check(s1Map, wMap))
                    return true;
                else {
                    wMap[s2.charAt(start) - 'a']--;
                    start++;
                }
            }
        } 
        return false;
    }
    
    public boolean check(int[] s1Map, int[] wMap) {
        for(int i=0; i<26; i++) {
            if(s1Map[i] != wMap[i])
                return false;
        }
        return true;
    }
}
