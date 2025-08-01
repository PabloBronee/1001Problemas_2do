import java.util.Scanner;

public class Problema160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println("Ingresa el segundo numero: ");
        int b = Integer.parseInt(sc.nextLine());

        float resultado = calcularProducto(a, b);
        System.out.printf("El resultado de '" + a + "' por '" + b + "' es: " + resultado);
    }

    public static float calcularProducto(int a, int b) {
        return a * b;
    }
}
