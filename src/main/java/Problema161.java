import java.util.Scanner;

public class Problema161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = capturarIntEntero(sc);
        int b = capturarIntEntero(sc);
        int resultado = sumarEnteros(a,b);
        System.out.println("El resultado de sumar '" + a + "' con '" + b + "' es: " + resultado);
    }

    public static int capturarIntEntero(Scanner sc){
        boolean valido = false;
        int num = 0;

        while (!valido){
            System.out.println("Ingresa un numero entero: ");
            String entrada = sc.nextLine();
            try {
                num = Integer.parseInt(entrada);
                valido = true;
            }catch (NumberFormatException e){
                System.out.println("Debes ingresar un numero entero, intenta denuevo");
            }
        }

        return num;
    }

    public static int sumarEnteros(int a, int b){
        return a + b;
    }

}
