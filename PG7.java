/***************************************************************************************************
 Name     : ANANDUMV
 Roll No. : 3
 Batch    : s4CSE
 Pgm No   : 1.7
 Aim      : To print days of the week using switch
**************************************************************************************************/

public class week
{
	public static void main(String args[])
	{
		for(int a=1;a<=7;a++)
		{
			switch(a)
			{
			case 1:System.out.println("Sunday");
			       break;
			case 2:System.out.println("Monday");
			       break;	
			case 3:System.out.println("Tuesday");
			       break;
			case 4:System.out.println("Wednesday");
			       break;
			case 5:System.out.println("Thursday");
			       break;
			case 6:System.out.println("Friday");
			       break;
			case 7:System.out.println("Saturday");
			       break;
			}
		}
	}
}

/*OUTPUT:
Sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday */
