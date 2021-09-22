mimport java.io.*;
class GFG {
 
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++)
        {
            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
 
    public static void main(String args[])
        
    {
        int mat[][] = { {1,2,3},
                        {4,5,6 },
                         };
        print2D(mat);
    }
}
