import java.util.*;
public class MinimumByes {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=0;
		for(int i=0;;i++)
		{
			k=(int) Math.pow(2,i);
			if(k>n)
				break;
		}
		k=k/2;
		n=n-k;
		System.out.println(n);
	}

}
