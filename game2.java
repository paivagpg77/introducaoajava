import java.util.Random;
import java.util.Scanner;
public class Game2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random generate = new Random();
		int comp = generate.nextInt(10) + 1;
		int tentativas = 0;
		int x = 0;
		
		System.out.println("Adivinhe o número que o computador escolheu!(1 a 10) ");
		
		while (x != comp) {
			System.out.println("Digite um número: ");
			x = sc.nextInt();
			tentativas ++;
			
			if (x<comp) {
				System.out.println("Dica: O Número é Maior!");
			}else if(x>comp) {
				System.out.println("Dica: O Número é Menor!");
			}else {
				System.out.println("VOCÊ ACERTOU!!");
				System.out.println("Número de tentativas "+ tentativas);
			}
		
	}

	sc.close();
	
	}
}