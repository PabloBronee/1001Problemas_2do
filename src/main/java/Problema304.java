import java.util.Scanner;

public class Problema304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la primera medicion en Fahrenheit");
        float temp1 = sc.nextFloat();

        System.out.println("Ingresa la segunda medicion en Fahrenheit");
        float temp2 = sc.nextFloat();

        System.out.println("Ingresa la tercera medicion en Fahrenheit");
        float temp3 = sc.nextFloat();

        float mediaFahrenheit = CalcularMedia(temp1,temp2,temp3);

        float mediaCelsius = FarACel(mediaFahrenheit);

        //Se muestra la media en celsius ya calculada
        System.out.println("La media en celsius es: " + mediaCelsius);

    }

    public static float CalcularMedia(float d1, float d2, float d3){
        return (d1+d2+d3)/3;
    }

    public static float FarACel(float far){
        return (far - 32) * 5 / 9;
    }
}
