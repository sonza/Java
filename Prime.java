import java.util.Scanner;
public class Prime
{
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	System.out.println("\n Enter an integer:");
	int num = scan.nextInt();
	int flag=0;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
		System.out.println(num+" is not a prime number! \n");
	else 
		System.out.println(num+" is a prime number! \n");
}
} 
