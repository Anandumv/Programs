/*************************************************************************************************************
Name     : ANANDU.M.V
Batch    : S4 CSE
Roll No. : 3
Pgm No.  : 3.5
Aim      : To evaluate postfix expression
*************************************************************************************************************/



import java.io.*;
class Stack
{
	int a[];
	int n,top;
	public Stack(int size)
	{
		n=size;
		a=new int[n];
		top=-1;
	}
	public void push(int x)
	{
		if(!isFull())
		a[++top]=x;
		else
		System.out.println("Stack full");
	}
	public int pop()
	{
		return a[top--];
	}
	public boolean isFull()
	{
		return (top==(n-1));
	}
	public boolean isEmpty()
	{
		return(top==-1);
	}
	public int peek()
	{
		return(a[top]);
	}
}
class evaluate
{
 	public static void main(String args[])throws IOException
 	{
 	 	DataInputStream ob=new DataInputStream(System.in);
  		String input;
  		System.out.println("Enter postfix Expression");
  		input=ob.readLine();
  		eval(input);
  	}
 	public static void eval(String str)
  	{
    		Stack s=new Stack(30);
    		char ch;
    		int num1,num2,num3,res=0;
    		for(int i=0;i<str.length();i++)
    		{
			ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
			s.push((int)(ch-'0'));
        		else
			{
				num1=s.pop();
				num2=s.pop();
  				switch(ch)
				{
					case'+':res=num1+num2;
						break;
					case'-':res=num2-num1;
						break;
 					case'*':res=num2*num1;
						break;
					case'/':res=num2/num1;
						break;
					default:res=0;
				}
				s.push(res);
			}
    		}
   		res=s.pop();
  		System.out.println("Result is "+res);
 	}
}

/*********************************************************************************************************************  
OUTPUT

Enter postfix Expression
85-23+*
Result is 15
 
**********************************************************************************************************************/