import java.util.*;
class node
{
	int data;
	node next;
	node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class List {
	
	static node head,temp;

 static void insert(int val)
{
	 temp=head;
	node n=new node(val);
	if(head==null)
	{
		head=n;
	}
	else
	{
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n;
	}
}
 static void display()
{
  temp=head;
 while(temp.next!=null)
 {
	 System.out.println(temp.data);
	 temp=temp.next;
 }
 System.out.println(temp.data);
}
 public static void main(String[] args)
 {
	 int a;
	Scanner scan=new Scanner(System.in);
	while(a==1)
	{
	System.out.println("1.insert\n2.display");
	System.out.println("Enter the choice");
	int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			int data1=scan.nextInt();
			List.insert(data1);
			break;
		case 2:
			 List.display();
			 break;
	    default:
	    	break;
		}
	
		System.out.println("Press 1/0 to continue");
		a=scan.nextInt();
 }
}
}
