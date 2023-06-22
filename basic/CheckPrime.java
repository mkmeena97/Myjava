import java.util.Scanner;
public class CheckPrime{
  public static boolean isPrime(int n)
  {
    if(n==2)
    {
      return true;
    }
    if(n<2)
    {
      return false;
    }
    else
    {
      boolean flag=true;
    for(int i=2;i<n;i++)
      {
        if(n%i==0)
          flag=false;
      }
    if(flag==true)
      return true;
    else
      return false;
    }
  }
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter number ");
    int n=sc.nextInt();
    System.out.println(isPrime(n));
                        
  }
  
}
