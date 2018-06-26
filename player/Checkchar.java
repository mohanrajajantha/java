package Check;

import java.util.Scanner;
import java.lang.*;

public class Checkchar {

	public static boolean check(String x,String y)
	{
		int count=0;
		if(x.length()!=y.length())
			return false;
		else
			for(int i=0;i<x.length();i++)
			{
				if(x.charAt(i)!=y.charAt(i))
					count++;
			}
		if(count>1)
			return false;
		else
			return true;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String k,l;
		k=in.nextLine();
		l=in.nextLine();
		System.out.println(check(k,l));
	}

}
