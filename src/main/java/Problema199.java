import java.util.Scanner;

public class Problema199 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf(num + " * " + i + " = " + num*i + "\n");
        }
    }
}
