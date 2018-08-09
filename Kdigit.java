
import java.util.*;
class Kdigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        int l=s.length();
        int no=l-n;
        ArrayList<String> al=new ArrayList<>();
        if(n>0)
        {
        for(int i=0;i<l-n;i++)
        {
        	if((i+no)<=l-1)
        	{
        	String t=s.substring(i,i+no);
        	al.add(t);
            }
        	else
        	{
        		String t=s.substring(i);
        		al.add(t);
        	}
        }
        	
        Collections.sort(al);
        System.out.println(al.get(0));
        }
        else
        	System.out.println(s);
   
    }
}
