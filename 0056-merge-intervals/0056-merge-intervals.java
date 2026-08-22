class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
      List<List<Integer>>ans=new ArrayList<>();
      int s=intervals[0][0];
      int e=intervals[0][1];
       for(int i=1;i<intervals.length;i++){
           if(intervals[i][0]<=e){
            e=Math.max(e,intervals[i][1]);
           }
           else{
            ans.add(Arrays.asList(s,e));
           
           s=intervals[i][0];
           e=intervals[i][1];
           }
           }
           ans.add(Arrays.asList(s,e));

           int [][]sol=new int[ans.size()][];
           for(int i =0;i<ans.size();i++){
            sol[i]=new int[2];
            sol[i][0]= ans.get(i).get(0); 
            sol[i][1] =ans.get(i).get(1);
           }
           return sol;
    }
       }