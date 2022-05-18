class Permutations {
// 46. problems/permutations
    List<List<Integer>> rst;
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        rst = new ArrayList<>();
        used = new boolean[nums.length];
        bracktrack(nums, new ArrayList<Integer>(), used);
        return rst;
    }

    private void bracktrack(int[] nums, List<Integer> list, boolean[] used) {
        if (list.size() == nums.length) {
            rst.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            list.add(nums[i]);
            used[i] = true;
            bracktrack(nums, list, used);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}
