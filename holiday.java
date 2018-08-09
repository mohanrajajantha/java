import java.util.Scanner;

public class Holiday {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				String x=sc.nextLine();
				x=x.toLowerCase();
				if(x.equals("monday")||x.equals("tuesday")||x.equals("wednesday")||x.equals("thursday")||x.equals("friday")||x.equals("saturday")||x.equals("sunday"))
				
					{
					if(x.equals("saturady")||x.equals("sunday"))
					
					System.out.println("yes");
					else
						System.out.println("no");
					}
				else
					System.out.println("Invalid");

	}

}
