/*************************************************************************************************************
Name     : ANANDU.M.V
Batch    : S4 CSE
Roll No. : 3
Pgm No.  : 3.6
Aim      : To perform linked list operations
*************************************************************************************************************/


import java.io.*;
class Link
{
 public int iData;
 public double dData;
 public Link next;
 public Link(int id,double dd)
 {
 iData=id;
 dData=dd;
 }
 public void displayLink()
 {
 System.out.println("{" +iData+ ","+dData+ "} ");
 }}
class LinkList
{
 private Link first;
public LinkList()
{
 first=null;
}
public boolean isEmpty()
{
return(first==null);
}
public void insertFirst(int id,double dd)
{
Link newLink=new Link(id,dd);
newLink.next=first;
first=newLink;
System.out.println("The item has been inserted");
}
public Link deleteFirst()
{
 Link temp=first;
first=first.next;
return temp;
}
public void displayList()
 {
System.out.println("List(First--->Last)");
Link current=first;
while(current !=null)
{
 current.displayLink();
 current=current.next;
 }
System.out.println(" ");
}
}
class LinkListop
{

public static void main(String args[])throws IOException
 {
LinkList theList=new LinkList();
DataInputStream ob=new DataInputStream(System.in);
int b,ch,c;
 do
{
 System.out.println("1.insert\n2.delete\n3.display\n4.exit");
 System.out.println("Enter the choice");
 ch=Integer.parseInt(ob.readLine());
 switch(ch)
 {
 case 1:
	{
      System.out.println("Insert item");
      b=Integer.parseInt(ob.readLine()) ;
      theList.insertFirst(b,2.99);
      break;
	}
 case 2:
      while(!theList.isEmpty())
      {
	Link sLink=theList.deleteFirst();
	theList.displayList();
	System.out.println(" ");
       }
 
      
	if(theList.isEmpty()) 
	{
	 System.out.println("The items are deleted");
	}
	break;
 case 3:
	theList.displayList();
	break;
 case 4:
	System.exit(0);
 default:
	System.out.println("Wrong Entry");
	break;
 }
 System.out.println("Do you want to continue");
  c=Integer.parseInt(ob.readLine());
 }
 while(c==1);
}
}

/**********************************************************************************************************************
OUTPUT:
1.Insert
2.delete
3.display
4.exit
Enter the choice
1
Insert item
4
The item has been inserted 
Do you want to continue
1
1.insert
2.delete
3.display
4.exit
Enter the choice
3
List(First--->Last)
{4,2.99}
Do you want to continue
1
1.insert
2.delete
3.display
4.exit
Enter the choice
4
***********************************************************************************************************************/