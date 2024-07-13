
package com.mycompany.transposematrix;
public class TransposeMatrix {
    public static void main(String[] args) {
        int rows = 3, cols = 3;
        
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        
        int[][] transpose = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j =0 ; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        System.out.println("Original Matrix:");
        displayMatrix(matrix);
        
         System.out.println("\nTransposed Matrix:");
         displayMatrix(transpose);
    }
    
    public static void displayMatrix(int[][] mat) {
      for (int[] row : mat) {
          for (int val : row) {
              System.out.print(val + " ");
          }
          System.out.println();
      }
    }   
}