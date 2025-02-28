import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {    
    
    int row,col,i,j;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the row");
    row = s.nextInt();
    
    System.out.println("Enter the col");
    col = s.nextInt();

    int mat1[][] = new int[row][col];
    int mat2[][] = new int[row][col];
    int res[][] = new int[row][col];
    System.out.println("Enter the elements in matrix 1");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            mat1[i][j]=s.nextInt();
        }
    }
    System.out.println("Enter the ROW");
    row = s.nextInt();

    System.out.println("Enter the elements in matrix 1");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            mat2[i][j]=s.nextInt();
        }
    }
}
}