import java.util.Scanner;
public class Ex009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua primeira nota:");
		System.out.println("Digite sua segunda nota:");
		System.out.println("Digite sua terceira nota:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		veri(a ,b ,c);
		sc.close();
		
	}
	static void veri(int a, int b ,int c) {
		double media = (a+b+c)/3;
		if(media >= 7) {
			System.out.println("Sua média foi: "+media+" APROVADO!!");
		}else if(media<=5) {
			System.out.println("Sua média foi: "+media+ " RECUPERAÇÃO!!");
		}else {
			System.out.println("Sua média foi "+media+" REPROVADO!!");
		}
	}
}
