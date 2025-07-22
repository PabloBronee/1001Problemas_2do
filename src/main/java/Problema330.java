import java.util.Arrays;

public class Problema330 {
    public static void main(String[] args) {
        // Creamos el grupo de numeros y letras, ambos desordenados
        int[] numerosDesordenados = {5,2,3,1,4};
        String[] letrasDesordenadas = {"b","a","c","e","d"};

        //Mostramos ambos grupos antes de ordenarse
        System.out.println("---Grupos Desordenados---");
        System.out.println(Arrays.toString(numerosDesordenados));
        System.out.println(Arrays.toString(letrasDesordenadas));

        //Ordenamos ambos grupos
        Arrays.sort(numerosDesordenados);
        Arrays.sort(letrasDesordenadas);

        //Mostramos ambos sgrupos ya ordenados
        System.out.println("---Grupos Ordenados---");
        System.out.println(Arrays.toString(numerosDesordenados));
        System.out.println(Arrays.toString(letrasDesordenadas));
    }
}
