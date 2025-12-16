import java.util.Scanner;

public class Ex006{
    public static void main(String[] args){
       Scanner sc =  new Scanner(System.in);

       System.out.println("Digite seu primeiro Nome: ");
       String x = sc.nextLine();

       System.out.println("Digite seu segundo Nome: ");
       String y = sc.nextLine();

       name(x,y);
       sc.close();
    }

    static void name(String x, String y) {
    	System.out.println("Seu primeiro nome é "+  x  +" seu segundo nome é "+  y);
    }
}