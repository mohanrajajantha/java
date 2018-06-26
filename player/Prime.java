package prime;

import java.util.Scanner;

public class Prime {
	static void checkprime(int n,int k)
	{
		boolean b[]=new boolean[k];
		for(int i=0;i<k;i++)
		{
			b[i]=true;
		}
		for(int p=2;p*p<=k;p++)
		{
			if(b[p]==true)
			{
				for(int i=p;i<=k;i+=p)
				{
					b[i]=false;
				}
			}
		}
		for(int i=0;i<k;i++)
		{
			if(b[i]==true)
			{
				if(i>n&&i<k)
					System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		checkprime(n,k);
	}

}
