import java.util.Scanner;

public class Problema89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la base: ");
        double base = sc.nextDouble();
        System.out.println("Ingresa el exponente: ");
        double exponente = sc.nextDouble();
        System.out.println("El resultado de la base elevada al exponente es: " + Math.pow(base, exponente));

    }
}
