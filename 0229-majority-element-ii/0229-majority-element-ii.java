class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int min = nums.length / 3;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) > min && !list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;
    }
}