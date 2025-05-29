import java.util.Scanner;

public class Problema77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero > 0){
            System.out.println("El numero ingresado es positivo");
        } else if (numero < 0) {
            System.out.println("El numero ingresado es negativo");
        }
        else {
            System.out.println("El numero ingresado es cero");
        }
    }
}
