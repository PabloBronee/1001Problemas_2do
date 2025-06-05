import java.util.Arrays;
import java.util.Scanner;

public class Problema302 {
    public static void main(String[] args) {
        System.out.println("ingresa 10 numeros enteros, separados por espacios: ");
        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();

        String[] partes = cadena.split(" ");

        System.out.println("Datos ingresados antes de alterarse: ");
        System.out.println(Arrays.toString(partes));

        String aux = partes[0];

        partes[0] = partes[9];

        partes[9] = aux;

        System.out.println("Datos ingresados tras alterarse: ");
        System.out.println(Arrays.toString(partes));

    }
}
