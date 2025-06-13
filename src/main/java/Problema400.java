import  java.util.Scanner;
import java.util.Arrays;

public class Problema400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Se ingresa una lista numerica manualmente
        System.out.println("Ingresa una lista de numeros, separados por coma");
        String txtStrIngresado = sc.nextLine();

        //Se convierte la cadena de string en una lista de strings
        String[] listaStr = DevolverComoLista(txtStrIngresado);

        //Se pasa la lista de strings a una lista de ints
        int[] listaInt = ListaStrPasaListaInt(listaStr);

        //Se ordena la lista de ints, de menores a mayores
        Arrays.sort(listaInt);

        /*
        Se calcula la mediana, usando la lista previa ya trabajada, con el metodo
        "CalcularMediana", partiendo de comprobar si la lista es impar o par,
        usando el metodo "EsParOImpar" en su interior.
         */
        CalcularMediana(listaInt);
    }

    public static String[] DevolverComoLista(String s){
        return s.split(",");
    }

    public static int[] ListaStrPasaListaInt(String[] s){
        int[] resultado = new int[s.length];

        int i = 0;
        for (String x : s){
            resultado[i] = Integer.parseInt(x.trim());
            i++;
        }

        return resultado;
    }

    public static Boolean EsParOImpar(int[] s){
        double largoDeLista = s.length;
        if ((double) largoDeLista / 2 % 1 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void CalcularMediana(int[] s){
        int x = s.length;

        if (EsParOImpar(s)){
            //Si la lista es par
            System.out.println("La mediana son: " + s[x/2 - 1] + " y " + s[x/2]);
        }
        else{
            //si la lista es impar
            System.out.println("La mediana es: " + s[x/2]);
        }
    }

}
