/**
 * Matrices
 */
public class Matrices {

    public static void imprimirMatriz(int [][] m){ //m es parametro
        System.out.println();
        for(int i = 0; i < m.length; i++ ){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + "      ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int numero = 1;

        for(int i = 0; i < matriz1.length; i++){
            // numero ++; ESTO ALTERA EL FUNCIONAMIENTO IMPRIMIENDO 2345678910
            for ( int j = 0; j < matriz1[i].length; j++ ){
                matriz1[i][j] = numero;
                numero++;
            }
        }
        System.out.println("Los valores de matriz1 son: ");
        imprimirMatriz(matriz1); //Llamado con argumento = tiene valor
    }
}