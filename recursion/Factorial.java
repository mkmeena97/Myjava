import java.util.Scanner;
public class Factorial
{
  public static int fact(int n)
  {
    if(n>0)
      return n*fact(n-1);
    else
      return 1;
  }
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");
    int n=sc.nextInt();
    System.out.println("factorial of "+n+" is : "+fact(n));
  }
}


