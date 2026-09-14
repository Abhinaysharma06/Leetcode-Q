class Solution {
    public void nextPermutation(int[] nums) {
    int idx=-1;
    for(int i=nums.length-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            idx=i;
            break;
        }
    }
    if(idx==-1){
       Arrays.sort(nums);
       return;
    }
    for(int i=nums.length-1;i>idx;i--){
        if(nums[i]>nums[idx]){
            int temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;
            break;
        }
    }
    int j=idx+1;
    int k=nums.length-1;
    while(j<k){
        int temp=nums[k];
        nums[k]=nums[j];
        nums[j]=temp;
        j++;
        k--;
    }   
    }
}
    
