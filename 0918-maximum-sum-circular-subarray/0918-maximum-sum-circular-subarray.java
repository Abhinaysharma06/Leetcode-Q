class Solution {
    public int maxSubarraySumCircular(int[] nums) {
      int maxsum=Integer.MIN_VALUE;
      int max=0;
      int totalsum=0;
      int minsum=Integer.MAX_VALUE;
      int min=0;
      for(int i =0;i<nums.length;i++){ 
        max+=nums[i];
        maxsum=Math.max(maxsum,max);
        if(max<0){
          max=0; 
        }
        min+=nums[i];
        minsum=Math.min(min,minsum);
        if(min>0){
            min=0;
        }
        totalsum+=nums[i]; 
      }
      if(maxsum<0)return maxsum;
      int circularsum=totalsum-minsum;
      return Math.max(maxsum,circularsum);
    }
}