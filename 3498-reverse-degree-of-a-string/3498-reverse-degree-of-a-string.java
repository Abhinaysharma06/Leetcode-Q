class Solution {
    public int reverseDegree(String s) {
        int total=0;
      for(int i =0;i<s.length();i++){
        char ch =s.charAt(i);
        int idx=(i+1)*Math.abs('z'-ch+1);
        total+=idx;
      }  
      return total;
    }
}