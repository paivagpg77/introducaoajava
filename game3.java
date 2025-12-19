package estudosjava;
import java.util.Random;
import java.util.Scanner;
public class Game3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random generate = new Random();
		int comp = generate.nextInt(10) + 1;
		int chances = 3;
		int x = 0;
		
		System.out.println("Adivinhe o número que o computador escolheu!(1 a 10) \n Você tem 3 chances");
		
		while (x != comp && chances > 0) {
			System.out.println("Digite um número: ");
			x = sc.nextInt();
			chances --;
			
			if (x < comp && chances > 0) {
				System.out.println("Dica: O Número é Maior!");
			}else if(x > comp && chances > 0) {
				System.out.println("Dica: O Número é Menor!");
			}else if (x == comp){
				System.out.println("VOCÊ ACERTOU!!");
			}
			
		}
		if(x != comp) {
			System.out.println("Sua Chances acabaram. O número era: "+comp);
			
		}
		
	sc.close();
	
	}
}