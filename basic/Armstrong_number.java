public class Armstrong_number 
{
	
	public static int countDigit(int m)
	{
		int cdigit=0;
		while(m>0)
		{		
		m=m/10;
		cdigit++;	
		}
		return cdigit;
		
	}
	
	public static void armstrongNumber(int m,int n)
	{
		for(int i=m;i<=n;i++)
		{
			int sum=0;
			int tot_digit=countDigit(i);
			int y=i;
		for(int j=1;j<=tot_digit;j++)
		{
			
				int add=1;
				int d=y%10;
				for(int k=1;k<=tot_digit;k++)
				{
					add=add*d;
				}
				//sum=sum+(int) Math.pow(d, tot_digit);
				sum=sum+add;
				y=y/10;
			}
		
			if(sum==i)
			{
				System.out.print(i+" ");
			}
		}
	}
    public static void main(String[] args) 
    {
	armstrongNumber(1,1000);

    }
}	