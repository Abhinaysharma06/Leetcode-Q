class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
       List<List<Integer>>result=new ArrayList<>();
        Arrays.sort(nums);
        int s=lower;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<lower||nums[i]>upper){
                continue;
            }
         if( s<nums[i]){
           result.add(Arrays.asList(s,nums[i]-1));
         }
         s=nums[i]+1;      
            }
            if(s<=upper){
            result.add(Arrays.asList(s,upper));
            }
            return result;
    }}