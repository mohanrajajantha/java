import java.util.*;
public class Prefix {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.nextLine();
		}
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<n-1;i++)
		{
			String commonword=common(str[i],str[i+1]);
			al.add(commonword);
		}
		Collections.sort(al);
		System.out.println(al.get(0));

	}
	static String common(String x,String y)
	{
		String comm="";
		char[] x1=x.toCharArray();
		char[] y1=y.toCharArray();
		int min=Math.min(x1.length,y1.length);
		for(int i=0;i<min;i++)
		{
			if(x1[i]==y1[i])
				comm=comm+String.valueOf(x1[i]);
			else
				break;
		}
		return comm;
	}

}
