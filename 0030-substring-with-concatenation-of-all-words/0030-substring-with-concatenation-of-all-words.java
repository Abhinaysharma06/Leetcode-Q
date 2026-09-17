class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
    List<Integer> ans = new ArrayList<>();
    HashMap<String, Integer> map = new HashMap<>();
    for (String ch : words) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    int totalsize = words.length;
    int wsize = words[0].length();

    for (int start = 0; start < wsize; start++) {
        HashMap<String, Integer> curr = new HashMap<>();
        int formed = 0;
        int i = start;
        while (i + wsize <= s.length()) {
            String word = s.substring(i, i + wsize);
            if (map.containsKey(word)) {
                curr.put(word, curr.getOrDefault(word, 0) + 1);
                formed++;
                while (curr.get(word) > map.get(word)) {
                    String remove = s.substring(
                        i - (formed - 1) * wsize,
                        i - (formed - 2) * wsize
                    );

                    curr.put(remove, curr.get(remove) - 1);
                    formed--;
                }
                if (formed == totalsize) {
                    ans.add(i - (totalsize - 1) * wsize);
                }
            }
             else {
                curr.clear();
                formed = 0;
            }

            i += wsize;
        }
    }

    return ans;
}
//     public List<Integer> findSubstring(String s, String[] words) {
//         List<Integer>ans=new ArrayList<>();
//     HashMap<String,Integer>map=new HashMap<>();
//     for(String ch :words){
//         map.put(ch,map.getOrDefault(ch,0)+1);
//         totalsize+=map.get(ch);
//     }
//     String sb=words[0];
//     int wsize=sb.length();
//     int size=map.size();
//    // int i=0;
//    int formed=0;
//     int j=wsize-1;
//     while(j<s.length()){
//         for(int i =0;i<=wsize;i++){
//             String word = s.substring(i, i + wsize);
//         }
//         if(map.containsKey(sb)&&map.get.intValues(sb)>0){
//            formed++;
//            map.get(word)-1;
//         }
//         if(formed==totalsize){
//             ans.add()
//         }
//         i=j+1;
//     }



//     }
}