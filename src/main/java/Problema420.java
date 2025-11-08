public class Problema420 {
    public static void main(String[] args) {
        int[] arreglo = {4, 2, 4, 3, 1, 4, 2, 3, 3, 3};

        int numeroMasFrecuente = arreglo[0];
        int maxFrecuencia = 0;

        for (int i = 0; i < arreglo.length; i++) {
            int contador = 0;

            // Contamos cuántas veces aparece arreglo[i]
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    contador++;
                }
            }

            // Si aparece más veces que el máximo actual, actualizamos
            if (contador > maxFrecuencia) {
                maxFrecuencia = contador;
                numeroMasFrecuente = arreglo[i];
            }
        }

        System.out.println("El número que aparece más veces es: " + numeroMasFrecuente +
                " (aparece " + maxFrecuencia + " veces)");
    }
}
