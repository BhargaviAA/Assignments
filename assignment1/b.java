import java.util.Scanner;
class A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of rows ");
    int row=sc.nextInt();
     System.out.println("Enter no.of columns ");
         int column=sc.nextInt();
         System.out.println("Enter all elements of 1st matrix");
         int matrix1[][]=new int[row][column];
         for (int i=0;i<row ;i++ )
         {
           for (int j=0; j<column ;j++ )
           {
              matrix1[i][j]= sc.nextInt();
           }
         }

         System.out.println("Enter all elements of 2nd matrix");
         int matrix2[][]=new int[row][column];
         for (int i=0;i<row ;i++ )
         {
           for (int j=0; j<column;j++ )
           {
              matrix2[i][j]= sc.nextInt();
           }
         }
         // AND and OR operations
         int and[][]=new int[row][column];
                  int or[][]=new int[row][column];

         for(int i=0;i<row;i++)
         {
            for(int j=0;j<n;j++)
            {
              and[i][j]=matrix1[i][j] && matrix2[i][j];
              or[i][j]=and[i][j] || matrix1[i][j];
              System.out.print(or[i][j] = " ");
            }
            System.out.println();
         }

         //Converting into 1D Array
        /* int length=row*column;
         int a[]=new int[length];
         for(int i=0; i<length;i++)
         {


            for(int j=0;j<length;j++)
            {
              a[i+j]=or[i][j];
              System.out.print(a[i+j]);
            }
          }
         //Converting from Binary to Decimal

            for(int j=0;j<row;j++)
            {

            }*/










         }

}