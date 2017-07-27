/***************************************************************************************************
 Name     : ANANDUMV
 Roll No. : 3
 Batch    : s4CSE
 Pgm No   : 1.8
 Aim      : To check whether the number is prime or not
**************************************************************************************************/

public class prime
{
	public static void main(String args[])
	{
		int a=5;
		int k=10;
		for(int i=2;i<a;i++)
		{	
			if(a%i==0)
			{
				k=1;
			}
		}
		if(k==1)
		{
			System.out.println(a+" is not prime");
		}
		else
		{
			System.out.println(a+" is prime");
		}
	}
}

/*OUTPUT:
5 is prime */