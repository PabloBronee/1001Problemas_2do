import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Problema271 {
    public static void main(String[] args) {
        List<Integer> lista = capturarLista();
        calcularPromedio(lista);
    }

    public static List<Integer> capturarLista(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una lista de numeros, separados por coma: ");
        String listaStrUnida = sc.nextLine();
        String[] listaStrSeparada = listaStrUnida.split(",");
        List<Integer> listaInt = new ArrayList<>();
        for(String dato : listaStrSeparada){
            int numero = Integer.parseInt(dato.trim());
            listaInt.add(numero);
        }

        return listaInt;
    }

    public static int sumarDatosTotales(List<Integer> lista){
        int resultado = 0;

        for(int dato : lista){
            resultado += dato;
        }

        return resultado;
    }

    public static void calcularPromedio(List<Integer> lista){
        int largo = lista.size();
        int sumaTotal = sumarDatosTotales(lista);
        int promedio = sumaTotal / largo;
        System.out.println("Promedio de la lista ingresada: " + promedio);
    }

}


