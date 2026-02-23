class Solution {
    public void rotate(int[][] matrix) {
        int  arr[][]=new int[matrix.length][matrix.length];
        int l=matrix.length;
        int x=l-1;
        for(int i=0;i<l;i++){      
            for(int j=0;j<l;j++)
            {
               arr[j][x]=matrix[i][j];
       
        }
        x--;}
  for(int i=0;i<matrix.length;i++)
      {
        for(int j=0;j<matrix.length;j++)
        {
         matrix[i][j]=arr[i][j];
        }
      }
    }
}