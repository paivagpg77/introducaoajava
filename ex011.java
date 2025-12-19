package estudosjava;
import java.util.Scanner;
public class Main8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número que você quer a tabuada: ");
		int x = sc.nextInt();
		
		tabu(x);
		sc.close();

	}
	static void tabu(int  x) {
		int i = 0;
		while (i <= 10) {
			System.out.println(x + " x " + i + " = " + (x * i));
			i += 1; 
		}
	}
}
