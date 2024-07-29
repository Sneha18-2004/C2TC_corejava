package snehaa;
import java.util.Scanner;
public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sneha=new Scanner(System.in);
		
		System.out.println("");
		int age=sneha.nextInt();
		if(age>18) {
			System.out.println("u elligible for vote");
		 if(age==17){
			System.out.println("after 1 year elligible for vote");
			
		 
		 if(age==16){
			System.out.println("after 2 year elligible for vote");
		 
		 if(age==15){
			System.out.println("after 3 year elligible for vote");
		
	}
		 else {
				System.out.println("u not elligible for vote");
			 
		 }
		 }
		 }
		}
	}

}
