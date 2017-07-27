/****************************************************************************************
 Name     : ANANDU.M.V
 Roll No. : 3
 Batch    : s4CSE
 Pgm No   : 3.3
 Aim      : To perform delimiter match checking
******************************************************************************************/
import java.io.*;
class Stacka
{
	char a[];
  	int n,top;
  	public Stacka(int size)
  	{
    		n=size;
    		a=new char[n];
    		top=-1;
  	}
  	public void push( char x)
  	{
   		a[++top]=x;
  	}
  	public char pop()
  	{
   		return a[top--];
  	}
  	public boolean isfull()
  	{
    		return(top==n-1);
  	}
  	public boolean isempty()
  	{
    		return(top==-1);
  	}
  	public char peek()
  	{
    		return a[top];
  	}
}

class delimit
{
 	public static void main(String args[])throws IOException
 	{
   		DataInputStream o=new DataInputStream(System.in);
   		String str;
   		System.out.println("Enter string:");
   		str=o.readLine();
   		check(str);
   
  	}
 	public static void check(String input)
 	{
   		Stacka s=new Stacka(50);
   		char ch,chx;
   		int b=0; 
   		for(int i=0;i<input.length();i++)
   		{
     			ch=input.charAt(i);
     			switch(ch)
     			{
        			case '(':case '[':case '{':
          					   	   s.push(ch);
             					   	   break;
          			case ')':case ']':case'}':
          				          	  if(!s.isempty())
            					  	  {
              							chx=s.pop();
              							if(ch==')'&&chx!='('||ch==']'&&chx!='['||ch=='}'&&chx!='{')
                						{
                 							System.out.println("Delimiter not matching");
                  							b=1;
                  							break;
                						}   
            					   	  }
       				default:
          				break;
    			}
  		} 
  		if(!s.isempty())
   		{
     			System.out.println("Delimiter missing ");
     			b=1;
   		}
  		if(b==0)
  		{
    			System.out.println("Delimiter matching");      
  		}
 	}
}

/**********************************************************************************************
OUTPUT:
Enter string:
a[fgh]
Delimiter matching

Enter string:
a{mn
Delimiter missing
***********************************************************************************************/



