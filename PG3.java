/***************************************************************************************************
 Name     : ANANDUMV
 Roll No. : 3
 Batch    : s4CSE
 Pgm No   : 1.3
 Aim      : To find the biggest among three numbers
**************************************************************************************************/

public class biggest
{
	public static void main(String args[])
	{
		int a,b,c;
		a=10;
		b=40;
		c=90;
		if(a>b&&a>c)
		{
			System.out.println(a+" is the biggest number");
		}
		else if(b>c)
		{	
			System.out.println(b+" is the biggest number");
		}
		else
		{
			System.out.println(c+" is the biggest number");
		}
	}
}

/*OUTPUT:
90 is the biggest number*/
