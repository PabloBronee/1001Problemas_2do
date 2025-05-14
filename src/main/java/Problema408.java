public class Problema408 {
    public static void main(String[] args) {
        int[] matriz1 = {1,2,3,4,5};
        int[] matriz2 = {6,7,8,9,10};

        muestraMatriz(devuelveMatriz(matriz2,matriz1));
    }

    public static void muestraMatriz(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public static int[] devuelveMatriz(int[] a, int[] b){
        return a;
    }
}
