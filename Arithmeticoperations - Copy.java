import java.util.*;
class Arithmeticoperations
{
	public static void main(String args[])
	{
		//creation of Scanner class object
		Scanner sc=new Scanner(System.in);

		int a,b;

		System.out.println("Enter the value of a and b");
		a=sc.nextInt();
		b=sc.nextINt();

		System.out.println("Addition of two numbers="+(a+b));
		System.out.println("Subraction of two numbers="+(a-b));
		System.out.println("Mulitiplication of two numbers="+(a*b));
		System.out.println("Quotient of two numbers="+(a/b));
		System.out.println("Remindar of two numbers="+(a%b));
	}
 }