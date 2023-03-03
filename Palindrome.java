import java.util.Scanner;
public class Palindrome
{
     public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();
	boolean rs=isPalindrome(n);
	if(rs)
	   System.out.println(Palindrome");
	else
	   System.out.println("Not Palindrome");
     }
     public static boolean isPalindrome(int n)
     {
	int temp=n,rev=0;
	while(n!=0)
	{
	    int d=n%10;
	    n=n/10;
	    rev=rev*10+d;
	}
	return temp==rev;
     }
}