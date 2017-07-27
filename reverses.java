/**********************************************************************************************************
NAME		:Anandu mv
PROGRAM NO.	:3.2
BATCH		:S4 CSE
ROLL NO.	:3
AIM		:TO PERFORM STRING REVERSAL USING STACK
***********************************************************************************************************\
import java.io.*;


class reverses
{

	int top,x;
	char a[];
	public reverses()
	{
	 
		top=-1;
		a=new char[20];
	}
public boolean isfull()
	{
		return(top==19);
	}
	public boolean isempty()
	{
		return(top==(-1));
	}


public void push(char y)
	{
		if(!isfull())
		{
			a[++top]=y;
		}
		else
		System.out.println("Stack is full");
	}
	public void pop()
	{
                char j;
		
		if (!isempty())
		{
			j=a[top--];
		System.out.print(j);
		}
		else
		System.out.println("Stack is empty");
	}
	
	
	public static void main(String arg[])throws IOException
	{
                String input,output;
		DataInputStream br=new DataInputStream(System.in);
                reverses s=new reverses();
		int i;
		System.out.println("Enter the string");
		input=br.readLine();
		int n=input.length();
		for(i=0;i<n;i++)
		{
			char v=input.charAt(i);
			s.push(v);
		}
		System.out.println("The reversed string is");			
		for(i=0;i<n;i++)
		{
		s.pop();
		}
			
	}
}

/********************************************************************************************************** 
 OUTPUT
Enter the string
post
The reversed srting is
tsop
***********************************************************************************************************/