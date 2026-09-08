class Solution {
    public int[][] transpose(int[][] matrix) {
        int noRows=matrix.length;
        int noCols=matrix[0].length;
        int[][]result=new int[noCols][noRows];
        for(int row=0;row<noRows;row++){
            for(int col=0;col<noCols;col++){
                result[col][row]=matrix[row][col];
            }
        }
        return result;
        
    }
}