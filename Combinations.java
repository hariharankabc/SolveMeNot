class Combinations {
// 77. problems/combinations [NWS]
    List<List<Integer>> result = new ArrayList<>();
    int combLen, range; 
    public List<List<Integer>> combine(int n, int k) {
        combLen = k;
        range = n;
        List<Integer> pairs = new ArrayList<>(k);
        helper(0, 1, pairs);
        return result;
    }
    
    public void helper(int level, int start, List<Integer> pairs) {
        if(level == combLen) {
            result.add(new ArrayList<Integer>(pairs));
            return;
        }
        
        int remaining = combLen - level -1;
        for(int i=start; i<=range-remaining; i++) {
            pairs.add(i);
            helper(level+1, i+1, pairs);
            pairs.remove(pairs.size()-1);
        }
    }
}
