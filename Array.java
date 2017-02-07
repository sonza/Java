import java.util.Scanner;
public class Array
{
public static void main(String args[])
{
	float arr[]=new float[5];
	Scanner scan = new Scanner(System.in);

	//ENTER ARRAY
	System.out.println("\n Enter an array of 5 numbers:");
	for(int i=0;i<5;i++)
	{
		arr[i]=scan.nextFloat();
	}

	//DISPLAY ARRAY
	for(int i=0;i<5;i++)
	{
		System.out.println(arr[i]+"  ");
	}
	
	//ENTER SEARCH KEY
	System.out.println("\n Enter the search key:");
	float key=scan.nextFloat();
	
	//SEARCH ELEMENT
	int flag=0,pos=0;
	for(int i=0;i<5;i++)
	{
		if(key==arr[i])
		{
			flag=1;
			pos=i+1;
			break;
		}
	}
	if(flag==1)
		System.out.println("\n Key found at position "+pos);
	else
		System.out.println("\n Key not found");
}
}
