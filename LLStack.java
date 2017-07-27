/***********************************************************************************************************************
Name   :Anandu mv
Roll no:3
Batch  :s4 CSE
Pgm no :3.8
Aim    :To implement stack using linkedlist
***********************************************************************************************************************/
/*PROGRAM:*/  
import java.io.*;
class Link
{
 public int iData;

 public Link next;
 public Link(int id)
 {
 	iData=id;
 }
 public void displayLink()
 {
 	System.out.println("{" +iData+ "} ");
 }
}
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
public void insertFirst(int id)
{
 Link newLink=new Link(id);
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
 Link current=first;
 while(current !=null)
 {
 	current.displayLink();
 	current=current.next;
 }
System.out.println(" ");
}
}
class LLStack
{
public static void main(String args[])throws IOException
 {
  LinkList theList=new LinkList();
  DataInputStream ob=new DataInputStream(System.in);
  int item,b,ch,c,x=1;
do
{
 System.out.println("\n***MENU***\n1.Push ");
 System.out.println("2.Pop ");
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
          theList.insertFirst(item); 	     
          break;
  case 2 : 	
	  Link theList2=theList.deleteFirst();
	  System.out.println(" The item has been deleted");
	  break;
  case 3 :
	  System.out.println("The stack content is");
	  theList.displayList();
 	  break;
  case 4 :
	  System.exit(0);
  }     
 }while(x!=0);
}
}
/*OUTPUT:



***MENU***
1.Push
2.Pop
3.Display
4.Exit
Enter your choice
1
Enter the item
23
The item has been inserted

***MENU***
1.Push
2.Pop
3.Display
4.Exit
Enter your choice
1
Enter the item
45
The item has been inserted

***MENU***
1.Push
2.Pop
3.Display
4.Exit
Enter your choice
1
Enter the item
89
The item has been inserted

***MENU***
1.Push
2.Pop
3.Display
4.Exit
Enter your choice
2
 The item has been deleted

***MENU***
1.Push
2.Pop
3.Display
4.Exit
Enter your choice
3
The stack content is
{45}
{23}


***MENU***
1.Push
2.Pop
3.Display
4.Exit
Enter your choice
4****/