class Solution {
    public boolean helper(int r,int c,char[][] board,String word,int index,boolean[][] visited){
        if(r<0 || c<0 || r>=board.length || c>=board[0].length){
            return false;
        }
        if(visited[r][c] || board[r][c]!=word.charAt(index)){
            return false;
        }
        if(index==word.length()-1){
            return true;
        }
        visited[r][c]=true;
        boolean found=helper(r+1,c,board,word,index+1,visited)||
        helper(r-1,c,board,word,index+1,visited)||
        helper(r,c+1,board,word,index+1,visited)||
        helper(r,c-1,board,word,index+1,visited);

        visited[r][c]=false;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(helper(i,j,board,word,0,visited)){
                    return true;
                }


            }
                
                
        }
        return false;

        
    }
}