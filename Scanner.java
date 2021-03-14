import java.util.Scanner;
class Scanner
{
 public static void main(String[] args)
   {
    Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you want to print number");
        int a= s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(a + "*" +i+"="+a*i);
        }
    }
}