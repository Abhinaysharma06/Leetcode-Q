class Solution {
    public boolean canReach(int[] arr, int start) {
       boolean[]check=new boolean[arr.length];
       return helper(arr,start,check);
    }
    public boolean helper(int []arr,int start,boolean[]check){
    if(start<0||start>=arr.length)return false;
       if(check[start])return false;
        if(arr[start]==0) return true;
        check[start]=true;
     return helper(arr,start+arr[start],check)||helper(arr,start-arr[start],check);
}
}