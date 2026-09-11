class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int currsum=0;
        int result=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            currsum+=num;
            int remaining_sum=currsum-goal;
            if(map.containsKey(remaining_sum)){
                result+=map.get(remaining_sum);
                
            }
            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
        return result;
        
    }
}