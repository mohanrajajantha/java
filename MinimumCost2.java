import java.util.*;
public class MinimumCost2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		str1=str1.toUpperCase();
		str2=str2.toUpperCase();
		char[] strar1=str1.toCharArray();
		char[] strar2=str2.toCharArray();
		int l1=strar1.length;
		int l2=strar2.length;
		int cost=0;
		String extra="";
		if(l1>l2)
		{
			extra=str1.substring(l2);
		}
		else if(l2>l1)
		{
			extra=str2.substring(l1);
		}
		int strlen=l1>=l2?l2:l1;
		for(int i=0;i<strlen;i++)
		{
			if(strar1[i]!=strar2[i])
			{
				cost=cost+Math.abs(strar1[i]-strar2[i]);
			}
		}
		char[] ex=extra.toCharArray();
		for(int i=0;i<ex.length;i++)
		{
			cost=cost+ex[i]-'A';
		}
		System.out.println(cost);

	}

}
