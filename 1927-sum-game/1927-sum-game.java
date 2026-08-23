class Solution {
    public boolean sumGame(String num) {
      int leftsum=0;  
      int rightsum=0;  
      int diff=0;  
      int leftQ=0;  
      int rightQ=0;
      int n=num.length();
      for(int i=0;i<num.length();i++){
        char ch =num.charAt(i);
        if(i>=0 && i<=(n/2)-1){
            if(ch!='?'){
                int sum=ch-'0';
                leftsum+=sum;
            }
            else{
                leftQ++;
            }

        }
        if(i>=0 && i>=(n/2)){
            if(ch!='?'){
                int sum=ch-'0';
                rightsum+=sum;
            }
            else{
                rightQ++;
            }
      }
    }
    diff=leftsum-rightsum;
    int q=leftQ-rightQ;
    if(diff<=9 && Math.abs(q)==1) return true;
    if(diff==-(q*9/2)){
        return false;
    }
    else{
        return true;
    }
    }
}