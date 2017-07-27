/***************************************************************************************************
 Name     : ANANDUMV
 Roll No. : 3
 Batch    : s4CSE
 Pgm No   : 1.5
 Aim      : To print fibonacci series using while loop
**************************************************************************************************/

public class fibanocci
{
	public static void main(String args[])
	{
		int a,b,c;
		a=0;
		b=1;
		c=0;	
		System.out.println(a);
		System.out.println(b);
		while(c<20)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}	
}

/*OUTPUT:
0
1
1
2
3
5
8
13
21*/


		