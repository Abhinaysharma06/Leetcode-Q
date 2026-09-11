class Solution {
    public boolean exist(char[][] board, String word) {
      for(int i =0;i<board.length;i++){
       for(int j =0;j<board[0].length;j++){
        if(word(board,i,j,0,word)){
            return true;
        }
        }
      }
      return false; 
        
    }
    public boolean word(char[][]board,int row,int col,int idx,String word){
    if(idx==word.length()){
        return true;
    }
    if(row>=board.length||col>=board[0].length||row<0||col<0||board[row][col]!=word.charAt(idx)){
        return false;
    }
    char temp=board[row][col];
    board[row][col]='#';
     boolean check=word(board,row+1,col,idx+1,word)||word(board,row-1,col,idx+1,word)||word(board,row,col+1,idx+1,word)||word(board,row,col-1,idx+1,word);

    board[row][col]=temp;

    return check;
    }   
}