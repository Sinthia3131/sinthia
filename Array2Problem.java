package array2problem;

import java.util.Scanner;

public class Array2Problem {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int colums = 4;
        int rows = 2;
        int[][] array = new int[4] [2];
        System.out.println("Enter Number");
        int i;
        int j;
        for (i=0;i<array.length;i++)
        {
            for(j=0;j<array[0].length;j++)
            {
                array[i][j] = sc.nextInt();
         }
             
        System.out.println(" the 2D array is :");
        
    }
      
          for (i=0;i< array.length;i++)
         {
             for(j=0;j<array[0].length;j++)
             {
    System.out.print(array[i][j]+" ");
}
 System.out.println();
 
         }
    }
}