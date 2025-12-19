import java.util.Scanner;
public class Ex010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número para verificarmos: ");
		int x = sc.nextInt();
		
		parorimpar(x);
		sc.close();
	}
	static  void parorimpar(int x) {
		if (x % 2 == 0) {
			System.out.println("O número "+x+" é PAR");
		}else if (x % 2!= 0) {
			System.out.println("O número "+x+" é IMPAR");
		}
	}
}
