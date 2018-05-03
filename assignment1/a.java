
import java.util.Scanner;
class A
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length of array");
    int n=sc.nextInt();
    System.out.println("Enter a number");
    int k=sc.nextInt();
    System.out.println("Enter array elements");
    int arr[]=new int[n];
    for (int i=0;i<n;i++ ) {
      arr[i]=sc.nextInt();

    }
    int result=n/k;
    int count=0;
    for (int i=0;i<n ;i++ ) {
      for (int j=i+1 ;j<n ;j++) {
        if(arr[i]==arr[j])
        {
          count=count+1;
        }
        if (result==arr[i]) {
          System.out.println(a[i]);

        }

      }

    }


  }
}