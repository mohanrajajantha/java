package Camel;

import java.util.Scanner;

public class Camel {
	
	static String camelcase(String x)
	{
		String temp="";
		temp=x.substring(0,1).toUpperCase()+x.substring(1);
		return temp;
	}

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
	        String input=in.nextLine();
	       
	        String[] arr=input.split(" ");
	        int l=arr.length;
	        for(int i=0;i<l;i++)
	        {
	            System.out.print(camelcase(arr[i])+" ");
	        }
	}

}
