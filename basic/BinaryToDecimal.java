import java.util.Scanner;
public class BinaryToDecimal
{
  public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number");
		int num=sc.nextInt();
		int tot_digit=0;
		int sum=0;
		int n=num;     //need to store input number bcz it is going to become zero in this while loop  
		while(num>0)
		{
			tot_digit++;
			num=num/10;
			
		}
		//System.out.println(tot_digit);
		for(int i=0;i<=tot_digit-1;i++)
		{
			int d = n % 10;
			int add=(int) (d*Math.pow(2, i));
			sum=sum+add;
			n=n/10;
		
		}
		System.out.println(sum);
		
	}
}
