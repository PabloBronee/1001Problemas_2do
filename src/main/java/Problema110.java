import java.util.Scanner;

public class Problema110 {
    public static void main(String[] args) {
        System.out.println("Ingresa una cadena numerica");
        Scanner sc = new Scanner(System.in);
        try{
            int cadena1 = Integer.parseInt(sc.next());
            System.out.println(cadena1);
            System.out.println("Cadena numerica confirmada");
        }
        catch (NumberFormatException error){
            System.out.println("Cadena no numerica");
            //Se especifica cual fue el error concreto
            System.out.println(error.getMessage());
        }
    }
}
