import java.io.*;
class stack 
 {
  int st[],top;
  public stack()
    {
     st=new int [25];
     top=-1;
   }
public void push (int j)
  {
   st[++top]=j;
  }
public int pop ()
 {
 return st[top--];
  }
public int peek ()
 {
 return st[top];
 }
public boolean isempty()
 {
 return (top==-1);
 }
public boolean isempty ()
   {
  return(rear+1==front||front+24==rear);
  }
}

class vertex
 {
 public char label;
 public boolean visited;
 public vertex (char l)
  	{
  	label=l;
  	visited=false;
 	}
 }
class graph
 {
  vertex verlist[];
  stack s;
int nverts,adjver[][],i,j;
  public graph ()
      {
        s= new stack();
verlist=new vertex[25];
       nverts=0;
       adjver=new int[25][25];
        for(i=0;i<25;i++)
            for(j=0;j<25;j++)
                 adjver[i][j]=0;
    }  
 public void addvertex ( char c)
   {
    verlist[nverts++]=new vertex(c);
   }
public void addedge (int s , int e)
  {
      adjver[s][e]=1;
      adjver[e][s]=1;
  }
public void dfs ()
  {
 verlist[0].visited=true;
 System.out.print( "  "+verlist[0].label);
 s.push(0);
     while(!s.isempty())
	{
	int v=getadjacent(s.peek());
	if(v==-1)
	s.pop();
	else
		{
		 verlist[v].visited=true;
 		System.out.print( "  "+verlist[v].label);
		 s.push(v);
		}
	}
for(int k=0;k<nverts;k++)
verlist[k].visited=false;
}
public int getadjacent (int v)
  {
   for(int k=0; k<nverts;k++)
   if((adjver[v][k]==1)&&(verlist[k].visited==false))
	return k;
   return -1;
  }
public void displayall ()
 {
 for(i=0;i<nverts;i++)
  System.out.print( "   " +verlist[i].label);
 System.out.println( "adjacency  matrix : \n  ");
     for(i=0;i<nverts;i++)
         {
          System.out.print("\n");   
         for(j=0;j<nverts;j++)
         System.out.print(adjver[i][j]+"    " );			
         }
}

}
class DFS
	{
 	public static void main(String arg[]) throws IOException
     		{
        		DataInputStream in =new DataInputStream(System.in);
         		int c1;
         		graph g=new graph();
         		while(true)
            			{
                 			System.out.println( "\n1.Insert a vertex \n2. Add Edge\n3.display all \n4. bfs\n 5.dfs \n Enter the choice :   ");
                 			c1=Integer.parseInt(in.readLine());
                 			switch(c1)
                     			{
 				case 1:
                         			System.out.println( "Enter the vertex :   "); 
                         			String c5=in.readLine();
                         			g.addvertex(c5.charAt(0));
                     			break;
                 				case 2 :
                          			System.out.println( "enter the start and end vertex : ");
                           			g.displayall();
				System.out.println( "\n ");
	         			int a=Integer.parseInt(in.readLine());
	         			int b=Integer.parseInt(in.readLine()); 
                           			g.addedge(a,b);
	         			break;
				case 3 : g.displayall();
					break;
				case 4 : g.dfs();
				 	break;
			default  :return;
          			 }
		}
}
}
                             