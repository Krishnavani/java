import java.util.*;
class pls
{
	public static void main(String args[])
	{
		String original,reverse="";
		Scanner inn=new Scanner(System.in);
		System.out.println("enter a string/number to check if it is palindrome");
		original=inn.nextLine();
		int length=orginal.length();
		for(int i=length-1;i>=0;i--)
			reverse=reverse + orginal.charAt(i);
			if(orginal.equals(reverse))
			System.out.println("Entered string/number is a palindrome");
			else
			System.out.println("entered string/number is not a palindrome");
		}
}