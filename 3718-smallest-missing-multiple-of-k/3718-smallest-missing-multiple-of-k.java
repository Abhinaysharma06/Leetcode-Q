class Solution {
    public int missingMultiple(int[] nums, int k) {
     Set<Integer>set=new HashSet<>();
     for(int num:nums){
        set.add(num);
     }
     List<Integer>list=new ArrayList<>();
     for(int i=1;i<=nums.length+1;i++){
        list.add(i*k);
     }
     int ans=0;
     for(int num=0;num<list.size();num++){
        if(set.contains(list.get(num))){
            continue;
        }
        else{
         ans=list.get(num);
         break;
        }
     } 
     return ans;  
    }
}