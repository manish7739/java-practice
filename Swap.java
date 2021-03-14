import java.util.Scanner;
class Swap
{
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		int a=sc.nextInt();
		System.out.println("Enter second Number");
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;

		System.out.println("first="+a);
		System.out.println("second="+b);
		



		
	}
}