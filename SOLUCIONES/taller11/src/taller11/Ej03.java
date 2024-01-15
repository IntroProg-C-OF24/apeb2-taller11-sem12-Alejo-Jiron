package taller11;

import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor las calificaciones son del 1 - 10 no sera pdjo");

        System.out.println("Ingrese la priemra calificacion: ");
        double calificacion1 = scanner.nextDouble();

        System.out.println("Ingrese la segunda calificacion:");
        double calificacion2 = scanner.nextDouble();

        System.out.println("Ingrese la tercera calificaion:");
        double calificacion3 = scanner.nextDouble();

        System.out.println("Ingrese la cuarta calificacion:");
        double calificacion4 = scanner.nextDouble();

        double promedio = calcularPromedio(calificacion1, calificacion2, calificacion3, calificacion4);
        String resultadoCualitativo = obtenerPromedioCualitativo(promedio);

        System.out.println("El promedio es: " + promedio);
        System.out.println("El promedio cualitativo es: " + resultadoCualitativo);

        scanner.close();
    }

    public static double calcularPromedio(double valor1, double valor2, double valor3, double valor4) {
        return (valor1 + valor2 + valor3 + valor4) / 4.0;
    }

    public static String obtenerPromedioCualitativo(double promedio) {
        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio <= 8) {
            return "Bueno";
        } else if (promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Promedio fuera de rango";
        }
    }
}
/*
Porfavor las calificaciones son del 1 - 10 no sera pdjo
Ingrese la priemra calificacion: 
7
Ingrese la segunda calificacion:
8.6
Ingrese la tercera calificaion:
9.9
Ingrese la cuarta calificacion:
8.9
El promedio es: 8.6
El promedio cualitativo es: Muy Bueno
*/