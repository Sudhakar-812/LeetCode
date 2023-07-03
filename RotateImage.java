public class RotateImage {
    public void rotate(int[][] matrix) {;
        int l=matrix.length;
        int c[][]= new int[l][l];
        for(int i=0; i<l; i++){
            int n =matrix[i].length;
            for(int j=0; j<n; j++){
                c[i][j] = matrix[n-j-1][i];
            }
        }
        for(int i=0; i<l; i++){
            for(int j=0; j<l; j++){
                matrix[i][j] = c[i][j];
            }
        }
    }
}
