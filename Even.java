import java.util.Scanner;
class Even
{
	public static void main(String[] args) {
	int r=8;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a Number");
	int a=s.nextInt();
	if(a%2==0)
	{
       System.out.println("Even Number");

	}
	else{
		 System.out.println("Odd Number");
	}

	}
}