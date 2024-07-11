import java.until.*;
class simpleinterst
{ 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		float principle_amount,rate_of_interset,SI;
 		int time_period;

		System.out.println("enter the principle amount");
		principle_amount=sc.nextFloat();

		System.out.println("enter the time period");
		time_period=sc.nextInt();

		Syatem.out.println("enter the rate of interst");
		rate_of_interst=sc.nextFloat();

		SI=(principle_amount*time_period*rate_of_interst)/100;

		System.out.println("simpleInterst="+SI);
	}
}