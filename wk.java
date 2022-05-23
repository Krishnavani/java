import java.util.*;
class wk
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no");
		int day=s.nextInt();
		switch(day)
		{
			case 1:
				System.out.println("monday");
				break;
			case 2:
				System.out.println("tuesday");
				break;
			case 3:
				System.out.println("wednesday");
				break;
			case 4:
				System.out.println("thursday");
				break;
			case 5:
				System.out.println("friday");
				break;
			default:
				System.out.println("weekend");
				break;
		}
	}
}
	
				
