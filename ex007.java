public class Ex007 {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		if(args[0].equals("somar")) {
			sum(x , y);
		} else if(args[0].equals("subtrair")) {
			sub(x, y);
		}else if(args[0].equals("multi")) {
			multiplicacao(x ,y);
		}else if(args[0].equals("divi")) {
			divisao(x,y);
		}
		
		
	}
	 static void sum(int x, int y) {
		 System.out.println(x+y);
	 }
	 static void sub(int x,int y) {
		 System.out.println(x-y);
	 }
	 static void multiplicacao(int x , int y ) {
		 System.out.println(x*y);
	 }
	 static void divisao(int x , int y) {
		 System.out.println(x/y);
	 }
}
	 