import java.util.Scanner;

public class Problema315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int x = sc.nextInt();

        if (esPar(x))
            System.out.println("El número es par");
        else
            System.out.println("El número es impar");
    }

    static boolean esPar(int x) {
        return x % 2 == 0;
    }
}
