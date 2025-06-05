import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Problema308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu año de nacimiento: ");
        int anio = sc.nextInt();

        System.out.println("Ingresa tu mes de nacimiento (de 1 a 12)");
        int mes = sc.nextInt();

        System.out.println("Ingresa tu dia de nacimiento");
        int dia = sc.nextInt();

        LocalDate fechaDeNacimiento = LocalDate.of(anio, mes, dia);

        LocalDate fechaActual = LocalDate.now();

        long diasDesdeNacimiento = ChronoUnit.DAYS.between(fechaDeNacimiento, fechaActual);

        System.out.println("Han pasado '" + diasDesdeNacimiento + "' dias desde tu nacimiento");
    }
}
