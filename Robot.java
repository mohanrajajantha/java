import java.util.*;
public class Robot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x,y;
		String input,command;
		System.out.println("Enter x,y,x-y-d,command:");
		x=Integer.parseInt(s.nextLine());
		y=Integer.parseInt(s.nextLine());
		input=s.nextLine();
		command=s.nextLine();
		String output=Robo(x,y,input,command);
		System.out.println(output);
	}
	static String Robo(int xaxis,int yaxis,String input1,String command1)
	{
		String[] io=input1.split("-");
		String op="";
		char[] cmd=command1.toCharArray();
		int xa=Integer.parseInt(io[0]);
		int ya=Integer.parseInt(io[1]);
		String d=io[2];
		for(int i=0;i<cmd.length;i++)
		{
			if(cmd[i]=='L')
				d=left(d);
				else
					if(cmd[i]=='R')
						d=right(d);
					else
						if(cmd[i]=='M')
						{
							String finalop=move(xaxis,yaxis,xa,ya,d);
							if(finalop.equals("ERROR"))
							{
								op="ERROR";
								return op;
							}
							else
							{
							String[] fin=finalop.split("-");
							xa=Integer.parseInt(fin[0]);
							ya=Integer.parseInt(fin[1]);
							d=fin[2];
							}
						}	
		}
		op=(String.valueOf(xa))+"-"+String.valueOf(ya)+"-"+d;
		return op;
		}
	static String left(String x)
	{
		if(x.equals("EAST"))
			return "NORTH";
		else
			if(x.equals("SOUTH"))
				return "EAST";
			else
				if(x.equals("WEST"))
					return "SOUTH";
				else
					return "WEST";
	}
		static String right(String x)
		{
			switch(x)
			{
			case "EAST":
			{
				x="SOUTH";
				break;
			}
			case "WEST":
			{
				x="NORTH";
				break;
			}
			case "NORTH":
			{
				x="EAST";
				break;
			}
			case "SOUTH":
			{
				x="WEST";
				break;
			}
			}
			return x;
			}
		static String move(int X,int Y,int x1,int y1,String Z)
		{
			if(Z.equals("EAST"))
					{
				x1=x1+1;
					}
			else
				if(Z.equals("WEST"))
				{
					x1=x1-1;
				}
				else
					if(Z.equals("NORTH"))
					{
						y1=y1+1;
					}
					else
					{
						y1=y1-1;
					}
			if(x1>X&&x1<0&&y1>Y&&y1<0)
				return "ERROR";
			else
			return String.valueOf(x1)+"-"+String.valueOf(y1)+"-"+Z;
		}
	}


