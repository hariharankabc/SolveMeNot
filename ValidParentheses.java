class ValidParentheses {
  // 20.problems/valid-parentheses/ [NB]
    public boolean isValid(String s) {
        HashMap<Character, Character> parentheses = new HashMap<Character, Character>();
        parentheses.put(')','(');
        parentheses.put('}','{');
        parentheses.put(']','[');
        Stack<Character> stk = new Stack<>();  
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(parentheses.containsKey(c)){
                if(stk.isEmpty()){
                    return false;
                }
                if(!(stk.pop()).equals(parentheses.get(c))){
                    return false;
                }
            }else{
                stk.push(c);
            }
        }
        return stk.isEmpty()? true:false;
    }
}
