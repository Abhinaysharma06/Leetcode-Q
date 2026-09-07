class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
     StringBuilder s1=new StringBuilder("");
     StringBuilder s2=new StringBuilder("");
      for(String str:word2){
        s1.append(str);
      }
       for(String str:word1){
        s2.append(str);
      }
      if(!s1.toString().equals(s2.toString()))return false; 
      else{
        return true;
      } 
    }
}