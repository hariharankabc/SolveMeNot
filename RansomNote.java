class RansomNote {
    // 383.problems/ransom-note/
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charMap = new HashMap<>();
        for(int i=0; i<ransomNote.length(); i++) {
            char key = ransomNote.charAt(i);
            if(charMap.containsKey(key))
                charMap.put(key, charMap.get(key)+1);
            else
                charMap.put(key, 1);
        }
        for(int i=0; i<magazine.length(); i++) {
            char key = magazine.charAt(i);
            if(charMap.containsKey(key)){
                int noOfCharRequired = charMap.get(key)-1;
                if(noOfCharRequired==0){
                    charMap.remove(key);
                    if(charMap.isEmpty()){
                        return true;
                    }
                }else{
                    charMap.put(key, noOfCharRequired);
                }
            }
        }
        return false;
    }
}
