import java.util.Scanner;
public class Ex013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit:");
		double x = sc.nextInt();
		
		celc(x);
		sc.close();
		
	}
	static void celc(double x) {
		double celsius = ((x - 32 ) * 5.0 / 9.0);
		System.out.println("A temperatura é " + celsius + " °C");
		
	}
}
