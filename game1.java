import java.util.Random;
import java.util.Scanner;
public class Game1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random generate = new Random();
		int comp = generate.nextInt(10) + 1;
		System.out.println("Adivinhe o número que o computador escolheu!(1 a 10) ");
		int x = sc.nextInt();
		
		ad(x, comp);
		sc.close();
		
		
	}
	static void ad(int x, int comp) {
		if (x == comp) {
			System.out.println("VOCÊ ACERTOU!!, o número era "+comp);
		}else {
			System.out.println("VOCÊ ERROU!!, O número  era  "+comp);
		}

	
	}
}
