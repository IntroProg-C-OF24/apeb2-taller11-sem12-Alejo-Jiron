package taller11;

import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura para calcular el área:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triángulo");
        System.out.println("3. Rectángulo");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                obtenerAreaCuadrado();
                break;
            case 2:
                obtenerAreaTriangulo();
                break;
            case 3:
                obtenerAreaRectangulo();
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }

    public static void obtenerAreaCuadrado() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();

        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();

        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}
/*
run:
Seleccione la figura para calcular el área:
1. Cuadrado
2. Triángulo
3. Rectángulo
1
Ingrese el lado del cuadrado:
5
El área del cuadrado es: 25.0


Seleccione la figura para calcular el área:
1. Cuadrado
2. Triángulo
3. Rectángulo
2
Ingrese la base del triángulo:
5
Ingrese la altura del triángulo:
7
El área del triángulo es: 17.5


run:
Seleccione la figura para calcular el área:
1. Cuadrado
2. Triángulo
3. Rectángulo
3
Ingrese la base del rectángulo:
56
Ingrese la altura del rectángulo:
23
El área del rectángulo es: 1288.0
*/