import java.util.Scanner;

public class Problema200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int n = sc.nextInt();
        int factorial = n;

        for(int i = n - 1; i >= 1; i--){
            factorial *= i;
        }

        System.out.print("factorial de '" + n + "' = " + factorial);
    }
}
