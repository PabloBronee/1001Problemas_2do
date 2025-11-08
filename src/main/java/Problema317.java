import java.util.Scanner;

public class Problema317 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Ingrese un número entero: ");
         int num = sc.nextInt();
         int numFinal = siguiente(num);
         System.out.println("El siguiente número es: " + numFinal);
    }

    static int siguiente(int n) {
        return n + 1;
    }

}
