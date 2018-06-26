package Prod;

import java.util.Scanner;

public class Maxproduct_Subarray {
	
	static int product(int[] x)
	{
		int l=x.length;
		int fwd=Integer.MIN_VALUE,bwd=Integer.MIN_VALUE;
		int prodnow=1;
		for(int i=0;i<l;i++)
		{
			prodnow=prodnow*x[i];
			if(prodnow==0)
			{
				prodnow=1;
				continue;
			}
			if(fwd<prodnow)
			{
				fwd=prodnow;
			}
			}
		prodnow=1;
		for(int i=l-1;i>=0;i--)
		{
			prodnow=prodnow*x[i];
			if(prodnow==0)
			{
				prodnow=1;
				continue;
			}
			if(bwd<prodnow)
			{
				bwd=prodnow;
			}
		}
		int output=Math.max(fwd,bwd);
		return (Math.max(output, 0));
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println(product(a));
	}

}
