package estudosjava;

public class PilhaDeFuncoes {

    static void fun1(int a) {
        if (a > 0) {
            fun2(a - 1);
        } else {
            System.out.println(a);
        }
        System.out.println(a);
    }

    static void fun2(int a) {
        if (a > 5) {
            fun3(a / 2);
        } else {
            System.out.println(a);
        }
        System.out.println(a);
    }

    static void fun3(int a) {
        for (int i = 0; i < 3; i++) {
            a -= 1;
            System.out.println(a);
        }

        if (a > 0) {
            fun1(a);
        } else {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        fun1(15);
    }
}
