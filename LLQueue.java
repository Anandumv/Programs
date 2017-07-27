 /***********************************************************************************************************************
Name   :Anandu mv
Roll no:3
Batch  :s4 CSE
pgm no :3.7
Aim    :To implement queue using linkedlist
***********************************************************************************************************************/

import java.io.*;
class Link
{
 public int iData;
 public Link last;
 public Link next;
 public Link(int id)
 {
 	iData=id;
 }
 public void displayLink()
 {
 	System.out.println( iData);
 }
}
class LinkList
{
  private Link last;
  private Link first;
  public LinkList()
{
	first=null;
}
public boolean isEmpty()
{
 	return(first==null);
}
public void insertlast(int id)
{
 Link newLink=new Link(id);
 if(isEmpty())
 	first=newLink;
 else
        last.next=newLink;

 last=newLink;
 System.out.println("The item has been inserted");
}
public int deletelast()
{
 int temp=first.iData;
 if(first.next==null)
 last=null;
 first=first.next;
 return temp;
}
public void displayList()
{
 Link current=first;
 while(current !=null)
 {
 	current.displayLink();
 	current=current.next;
 }
System.out.println(" ");
}
}
class LLQueue
{
public static void main(String args[])throws IOException
 {
  LinkList theList=new LinkList();
  DataInputStream ob=new DataInputStream(System.in);
  int item,b,ch,c,x=1;
do
{
 System.out.println("\n___MENU___\n1.Insert ");
 System.out.println("2.Delete ");
 System.out.println("3.Display ");
 System.out.println("4.Exit");
 System.out.println("Enter your choice");
 int n;
 n=Integer.parseInt(ob.readLine());
 switch(n)
 {
  case 1 :
          System.out.println("Enter the item");
          item=Integer.parseInt(ob.readLine());
          theList.insertlast(item); 	     
          break;
  case 2 : 	
	  int theList2=theList.deletelast();
	  System.out.println("The item has been deleted");
	  break;
  case 3 :
	  System.out.println("The content of queue is");
	  theList.displayList();
 	  break;
  case 4 :
	  System.exit(0);
  }     
 }while(x!=0);
}
}

/*OUTPUT:
___MENU___
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice
1
Enter the item
23
The item has been inserted
___MENU___
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice
1
Enter the item
34
The item has been inserted

___MENU___
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice
1
Enter the item
45
The item has been inserted

___MENU___
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice
1
Enter the item
78
The item has been inserted

___MENU___
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice
2
The item has been deleted

___MENU___
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice
3
The content of queue is
34
45
78

___MENU___
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice
4***/