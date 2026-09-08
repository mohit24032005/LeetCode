class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int x : nums1) {
            set.add(x);
        }
        for (int x : nums2) {
            if (set.contains(x)) {
                res.add(x);
                set.remove(x);
            }
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}