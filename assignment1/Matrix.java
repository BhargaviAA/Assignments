class Matrix
{
  public static void main(string[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size: ");
    int n=sc.nextInt();
    System.out.println("Enter all elements : ");
    int a[][]=new int[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    int sum;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        sum=a[i][j]+a[j][i];
        int m=2,factors=0;
        while(m<sum)
        {
          if(sum%m==0)
          {
            factors=factors+1;
            m++;
            break;
          }
        }

          while(sum>0)
          {
            int r, sum1=0;
            r=sum%10;
            sum1=sum1+r;
            sum=sum/10;
          }
          if(sum1%2!=0 && factors==0)
          {
            System.out.println(sum + "is prime and is digit addition is odd");
            break;
          }



      }
    }

  }
}