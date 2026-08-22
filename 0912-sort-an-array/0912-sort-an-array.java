class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1); 
        return nums;
    }
    public void mergeSort(int []arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid =l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,r,mid);
    }
    public void merge(int []arr,int left,int right,int mid){
        int []temp=new int[right-left+1];
       int i=left;
       int j=mid+1;
       int k=0;
       while(i<=mid &&j<=right){
        if(arr[i]<=arr[j]){
            temp[k]=arr[i];
            i++;
            k++;
            }
        else{
            temp[k]=arr[j];
            j++;
            k++;}}

       while(i<=mid){
        temp[k++]=arr[i++];
       }
     while(j<=right){
        temp[k++]=arr[j++];}
        for(int p=0;p<temp.length;p++){
            arr[left+p]=temp[p];
    }}
}