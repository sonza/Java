import java.util.Scanner;
import java.util.*;

public class One
{
	public static void main(String args[])
	{	
		Scanner scan = new Scanner(System.in);
		Account A[]= new Account[3];
		
		System.out.println("\n Enter Account Details: \n");
		int i=0;
		while(i<=3)
		{
			System.out.println("\n Enter AccNo:");
			int a=scan.nextInt();
			System.out.println("\n Enter Name:");
			String n=scan.next();
			System.out.println("\n Enter PhoneNo:");
			int p=scan.nextInt();
			System.out.println("\n Enter Balance:");
			float b=scan.nextFloat();
			A[i] = new Account(a,n,p,b);

			System.out.println("\n Enter Another Account? (1 for yes, anything else for no) \n");
			int ch=scan.nextInt();
			if(ch==1)
			{
				i++;
				continue;
			}
			else 
				break;
		}

		System.out.println("\n MENU \n");
		System.out.println("\n 1. Deposit");
		System.out.println("\n 2. Withdraw");
		System.out.println("\n 3. Display");
		System.out.println("\n 4. Exit");

		int choice;
		do
		{
		System.out.println("\n Enter your choice: \n");
		choice=scan.nextInt();
		
		switch(choice)
		{
			case 1: System.out.println("\n Enter AccountNo. to use: \n");
				int numb=scan.nextInt();
				for(int j=0;j<=i;j++)
				{
					if(A[j].accno==numb)
						A[j].deposit();
				}
			break;
			case 2:  System.out.println("\n Enter AccountNo. to use: \n");
				numb=scan.nextInt();
				for(int j=0;j<=i;j++)
				{
					if(A[j].accno==numb)
						A[j].withdraw();
				}
			break;		
			case 3:  System.out.println("\n Enter AccountNo. to use: \n");
				numb=scan.nextInt();
				for(int j=0;j<=i;j++)
				{
					if(A[j].accno==numb)
						A[j].disp();
				}
			break;
			case 4: System.exit(0);
			break;
			default: System.out.println("\n ERROR \n");
				System.exit(0);
		}
		}while(choice!=4);
	}
}

class Account
{
	int accno,phno;
	double bal;
	String name;
	Scanner scan = new Scanner(System.in);

	Account(int a, String n, int p, float b)
	{
		accno=a;
		phno=p;
		bal=b;
		name=n;	
	}	
	
	void deposit()
	{
		System.out.println("\n Enter deposit amount:");
		float val=scan.nextFloat();
		bal+=val;
		System.out.println("\n Deposit Complete \n");
	}

	void withdraw()
	{
		System.out.println("\n Enter withdrawal amount:");
		float val=scan.nextFloat();
		bal-=val;
		System.out.println("\n Withdrawal Complete \n");
	}

	void disp()
	{
		System.out.println("\n Account Details \n");
		System.out.println("\n Account No.:"+accno);
		System.out.println("\n Name:"+name);
		System.out.println("\n Phone No.:"+phno);
		System.out.println("\n Balance:"+bal);
	}
	
}
