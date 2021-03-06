/**************************************************************************************************
                                
Name      :Anandu.mv
Batch     :s4 CSE
Roll No   :3
Program No:2
Aim       :To implement Depth first search
***************************************************************************************************/
import java.io.*;
class Stacka
{
  int a[];
  int top;
  public Stacka()
  {
    
    a=new int[20];
    top=-1;
  }
  public void push( int x)
  {
   
    a[++top]=x;
  }
  public int pop()
  {
    return a[top--];
  }
 
  public boolean isEmpty()
  {
    return(top==-1);
  }
  public int peek()
  {
    return a[top];
  }
}
class Vertex
{
 public char label;
 public boolean wasVisited;
 public Vertex(char lab)
 {
   label=lab;
   wasVisited=false;
 }
}
class Graph
{
 private int MAX_VERTS=20; 
 private Vertex vertexList[];
 private int adjMat[][];
 private int nVerts;
 private Stacka theStack;
 public Graph()
 {
   vertexList=new Vertex[MAX_VERTS];
   adjMat=new int[MAX_VERTS][MAX_VERTS];
   nVerts=0;
   for(int j=0;j<MAX_VERTS;j++)
     for(int k=0;k<MAX_VERTS;k++)
       adjMat[j][k]=0;
   theStack=new Stacka();
 }
 public void addVertex(char lab)
 {
  vertexList[nVerts++]=new Vertex(lab);
 }
 public void addEdge(int start,int end)
 {
  adjMat[start][end]=1;
  adjMat[end][start]=1;
 }
 public void displayVertex(int v)
 {
  System.out.println(vertexList[v].label);
 }
 public void dfs()
 {
  vertexList[0].wasVisited=true;
  displayVertex(0);
  theStack.push(0);
  while(!theStack.isEmpty())
  {
    int v=getAdjUnvisitedVertex(theStack.peek());
    if(v==-1)
      theStack.pop();
    else
     {
       vertexList[v].wasVisited=true;
       displayVertex(v);
       theStack.push(v);
     }
   }
 }
 public int getAdjUnvisitedVertex(int v)
 {
   for(int j=0;j<nVerts;j++)
     if(adjMat[v][j]==1&&vertexList[j].wasVisited==false)
       return j;
    return -1;
 }
}
class DFSApp
{
 public static void main(String[]args)throws IOException
 {
   Graph theGraph=new Graph();
   theGraph.addVertex('A');
   theGraph.addVertex('B');
   theGraph.addVertex('C');
   theGraph.addVertex('D');
   theGraph.addVertex('E');
   theGraph.addEdge(0,1);
   theGraph.addEdge(1,2);
   theGraph.addEdge(0,3);
   theGraph.addEdge(3,4);
   System.out.println("Visits :");
   theGraph.dfs();
   System.out.println();
  }
}


\******************************************************************************************
   
OUTPUT 

Visits :
A
B
C
D
E
******************************************************************************************/   
    
     
    
    
         
         