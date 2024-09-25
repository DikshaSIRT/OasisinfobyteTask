import java.util.Random;
import java.util.Scanner;

public class task2oasis {
	public static void main(String[] a) {
		Random r = new Random();
		int number = r.nextInt(101);
		int guess;
		boolean win = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number between 0 to 100 :");
		while (win == false) {
			guess = sc.nextInt();
			if (guess == number) {
				System.out.println("---Congratulation!---");
				win = true;
			} else if (number > guess) {
				System.out.println("Sorry!,----Guess Greater number ");
			} else {
				System.out.println("Sorry!-- Guess small number");
			}
		}
	}
}
