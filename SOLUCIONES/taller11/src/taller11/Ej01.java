package taller11;

public class Ej01 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        imprimirValoresPares(matriz);
        imprimirValoresImpares(matriz);
        imprimirPromedio(matriz);
    }

    public static void imprimirValoresPares(int[][] arreglo) {
        System.out.println("Valores pares:");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] % 2 == 0) {
                    System.out.print(arreglo[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void imprimirValoresImpares(int[][] arreglo) {
        System.out.println("Valores impares:");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] % 2 != 0) {
                    System.out.print(arreglo[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void imprimirPromedio(int[][] arreglo) {
        System.out.println("Promedio:");
        int totalValores = 0;
        int cantidadValores = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                totalValores += arreglo[i][j];
                cantidadValores++;
            }
        }
        double promedio = (double) totalValores / cantidadValores;
        System.out.println(promedio);
    }
}
/*
run:
Valores pares:
2 4 6 8 10 12 
Valores impares:
1 3 5 7 9 11 
Promedio:
6.5
BUILD SUCCESSFUL (total time: 0 seconds)

*/