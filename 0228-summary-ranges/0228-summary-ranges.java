class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> lst = new ArrayList<>();
        if (nums.length == 0) {
            return lst;
        }
        int start = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                if (start == nums[i]) {
                    lst.add(String.valueOf(start));
                } else {
                    lst.add(start + "->" + nums[i]);
                }
                start = nums[i + 1];
            }
        }
        if (start == nums[nums.length - 1]) {
            lst.add(String.valueOf(start));
        } else {
            lst.add(start + "->" + nums[nums.length - 1]);
        }

        return lst;
    }
}