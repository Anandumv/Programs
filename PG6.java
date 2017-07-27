/***************************************************************************************************
 Name     : ANANDUMV
 Roll No. : 3
 Batch    : s4CSE
 Pgm No   : 1.6
 Aim      : To check whether the number is palindrome or not
**************************************************************************************************/

public class palindrome
{
	public static void main(String args[])
	{
		int a=3883;
		int d,n;
		d=0;
		n=0;
		int num=a;	
		while(a!=0)
		{
			d=a%10;
			a=a/10;	
			n=(n*10)+d;
		}
		if(num==n)
		{
			System.out.println(num+" is a palindrome");
		}
		else
		{
			System.out.println(num+" is not a palindrome");
		}
	}
}

/*OUTPUT:
3883is a palindrome */