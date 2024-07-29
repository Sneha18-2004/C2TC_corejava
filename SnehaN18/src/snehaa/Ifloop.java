package snehaa;
import java.util.Scanner;
public class Ifloop {

	public static void main(String[] args) {
		Scanner sneha=new Scanner(System.in);
		System.out.println("voting eligible age");
		int age=sneha.nextInt();
		if(age>18) {
			System.out.println("you elligible for vote");
		}
		else {
			System.out.println("not elligible for vote");

	}

}
}