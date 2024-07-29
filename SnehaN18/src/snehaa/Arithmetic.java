package snehaa;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[]args) {
	    int e;
	    Scanner obj=new Scanner(System.in);
	    System.out.println("enter");
	    int a=obj.nextInt();
	    int b=obj.nextInt();
	    int c=obj.nextInt();
	    int d=obj.nextInt();
	    e=a+b;
	    System.out.println(e);
	    e=a-b;
	    System.out.println(e);
	    e=a*b;
	    System.out.println(e);
	    e=a/b;
	    System.out.println(e);
	    e=a%b;
	    System.out.println(e);
	}
}

