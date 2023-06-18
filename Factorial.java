
public class Factorial
{
  public static int fact(int n)
  {
    if(n>0)
      return n*fact(n-1)
    else
      return 1;
  }
  public static void main(String [] args)
  {
    int n=5;
    System.out.println("factorial of "+n+" is : "+fact(n))
  }
}


