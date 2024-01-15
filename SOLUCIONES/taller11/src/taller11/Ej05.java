package taller11;
import java.util.Scanner;
import java.util.Random;

public class Ej05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ingrese el tamaño de las matrices cuadradas: ");
        int n = scanner.nextInt();
        
        int[][] matrizA = generarMatrizAleatoria(n, random);
        int[][] matrizB = generarMatrizAleatoria(n, random);

        
        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);

        System.out.println("\nMatriz B:");
        imprimirMatriz(matrizB);

        
        System.out.println("\nElija una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");

        int opcion = scanner.nextInt();

        // Realizar la operación seleccionada
        int[][] resultado = null;

        switch (opcion) {
            case 1:
                resultado = sumarMatrices(matrizA, matrizB);
                break;
            case 2:
                resultado = restarMatrices(matrizA, matrizB);
                break;
            case 3:
                resultado = multiplicarMatrices(matrizA, matrizB);
                break;
            default:
                System.out.println("Opción no válida");
                System.exit(0);
        }

        System.out.println("\nResultado de la operación:");
        imprimirMatriz(resultado);

        scanner.close();
    }

    public static int[][] generarMatrizAleatoria(int n, Random random) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int n = matrizA.length;
        int[][] resultado = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return resultado;
    }

    public static int[][] restarMatrices(int[][] matrizA, int[][] matrizB) {
        int n = matrizA.length;
        int[][] resultado = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        return resultado;
    }

    public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int n = matrizA.length;
        int[][] resultado = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }
}
/*

*/