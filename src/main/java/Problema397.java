public class Problema397 {
    public static void main(String[] args) {
        /*
        Se instancian las dos matrices a usar
         */
        int[][] matrizA = {
                {2, 5},
                {10, 15}
        };

        int[][] matrizB = {
                {3, 6},
                {11, 16}
        };

        /*
        Se muestran las dos matrices a usar
         */
        System.out.println("Matriz A: ");
        MostrarMatriz(matrizA);
        System.out.println("Matriz B: ");
        MostrarMatriz(matrizB);

        //Se realiza la multiplicacion de las dos matrices
        int[][] matrizC = ProductoMatriz(matrizA, matrizB);

        //Se muestra el resultado final
        System.out.println("Resultado: ");
        MostrarMatriz(matrizC);

    }

    public static int[][] ProductoMatriz(int[][] a, int[][] b){
        int yDeA = a.length;
        int xDeA = a[0].length;
        int xDeB = b[0].length;

        int[][] resultado = new int[yDeA][xDeB];

        for (int i = 0; i < yDeA; i++){
            for (int j = 0; j < xDeB; j++){
                int suma = 0;
                for (int k = 0; k < xDeA; k++){
                    suma += a[i][k] * b[k][j];
                }
                resultado[i][j] = suma;
            }
        }

        return resultado;
    }

    public static void MostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
