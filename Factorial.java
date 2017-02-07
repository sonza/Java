import java.util.Scanner;
public class Factorial
{
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	System.out.println("\n Enter a number:");
	int num=scan.nextInt();
	int result=fact(num);
	System.out.println("\n The factorial of "+num+" is "+result); 
}
public static int fact(int n)
{
	if (n>=1)
		return n*fact(n-1);
	else
		return 1;
	
}
}
