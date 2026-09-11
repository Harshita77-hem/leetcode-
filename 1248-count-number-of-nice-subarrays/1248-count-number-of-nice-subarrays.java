class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int result=0;
        int currsum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            if(num%2!=0){
                currsum++;
            }
            int remaining_sum=currsum-k;
            if(map.containsKey(remaining_sum)){
                result+=map.get(remaining_sum);

            }
            map.put(currsum,map.getOrDefault(currsum,0)+1);

        }
        return result;
        
    }
}