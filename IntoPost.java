/*************************************************************************************************************
 Name     : Anandu.mv
 Batch    : S4 CSE
 Roll No. : 3
 Pgm No.  : 3.4
 Aim      : To perform infix to postfix conversion
*************************************************************************************************************

import java.io.*;
class Stack
{
	char a[];
	int n,top;
	public Stack(int size)
	{
		n=size;
		a=new char[n];
		top=-1;
	}
	public void push(char x)
	{
		if(!isFull())
		a[++top]=x;
		else
		System.out.println("Stack full");
	}
	public char pop()
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
	public char peek()
	{
		return(a[top]);
	}
};
class InToPost
{
	Stack s=new Stack(20);
	String str;
	char ch;
	public String convert(String input)
	{
 		str=" ";
 		for(int i=0;i<input.length();i++)
 		{
			ch=input.charAt(i);
			switch(ch)
			{
				case'(':
					s.push(ch);
					break;
				case')':
					gopath();
					break;
				case'*':
				case'/':
					goop(ch,2);
					break;		
				case'+':
				case'-':
					goop(ch,1);
					break;
				default:
					str=str+ch;
			}
 		}
 		while(!s.isEmpty())
 		str=str+s.pop();
 		return (str);
 	}
	public void gopath()
	{
 		while(!s.isEmpty())
 		{
			ch=s.pop();
			if(ch=='(')
			break;
			else
			str=str+ch;
 		}
	}
	public void goop(char opThis,int pre)
	{
 		int pretop;
 		while(!s.isEmpty())
 		{
 			ch=s.pop();
			if(ch=='+'||ch=='-')
			pretop=1;
			else
			pretop=2;
			if(ch=='(')
			break;
			else if(pre>pretop)
			{
				s.push(ch);
				break;
			}
			else
			str=str+ch;
 		}
		s.push(opThis);
	}
}
class post
{
 	public static void main(String args[])throws IOException
 	{
  		DataInputStream ob=new DataInputStream(System.in);
  		String input,output;
  		System.out.println("Enter infix expression:");
  		input=ob.readLine();
  		InToPost checker=new InToPost();
  		output=checker.convert(input);
  		System.out.println("Post fix expression: "+output);
 	}
}

/*   OUTPUT

Enter infix expression
a*(b+c)
Post fix expression:  abc+*
*/