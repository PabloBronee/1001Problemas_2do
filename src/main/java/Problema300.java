import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Problema300 {
    public static void main(String[] args) {
        int[] parametros = parametrosEspecificos();
        comprobarTodos(parametros[0],parametros[1]);

    }
    public static boolean esPerfecto (int num){
        int colaDeSuma = 0;

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                colaDeSuma += i;
            }
        }
        if(colaDeSuma == num){
            return true;
        }
        else{
            return false;
        }
    }

    public static int[] parametrosEspecificos (){
        Scanner sc = new Scanner(System.in);
        int[] parametros = new int[2];
        do{
            System.out.println("Ingresa el minimo valor de busqueda: ");
            parametros[0] = sc.nextInt();
        }while (parametros[0] <= 0);
        do{
            System.out.println("Ingresa el maximo valor de busqueda, mayor que el minimo: ");
            parametros[1] = sc.nextInt();
        }while (parametros[1] < 2 || parametros[1] < parametros[0]);

        return parametros;
    }

    public static void comprobarTodos(int num1, int num2){
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = num1; i < num2; i++){
            if(esPerfecto(i)){
                lista.add(i);
            }
        }
        if(!lista.isEmpty()){
            System.out.println("Numeros perfectos entre " + num1 + " y " + num2 + ": " + lista);
        }
        else{
            System.out.println("No hay ningun numero perfecto entre " + num1 + " y " + num2);
        }
    }
}
