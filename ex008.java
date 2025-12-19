import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade para a verificação da permissão");
		int  x = sc.nextInt();
		
		perm(x);
		sc.close();
		}
		static void perm(int x){
			if(x >=18) {
				System.out.println("Permitido(a)");
			}else {
				System.out.println("Não está Permitido(a)");
			}
			
		}
}
