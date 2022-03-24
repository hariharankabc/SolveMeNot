class ValidAnagram {
    // 242.problems/valid-anagram/ [NB]
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> charMap = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char key = s.charAt(i);
            if(charMap.containsKey(key))
                charMap.put(key, charMap.get(key)+1);
            else
                charMap.put(key, 1);
        }
        for(int i=0; i<t.length(); i++) {
            char key = t.charAt(i);
            if(charMap.containsKey(key)){
                int noOfCharRequired = charMap.get(key)-1;
                if(noOfCharRequired==0){
                    charMap.remove(key);
                }else{
                    charMap.put(key, noOfCharRequired);
                }
            }else{
                return false;
            }
        }
        if(charMap.isEmpty()){
            return true;
        }
        return false;
    }
}
