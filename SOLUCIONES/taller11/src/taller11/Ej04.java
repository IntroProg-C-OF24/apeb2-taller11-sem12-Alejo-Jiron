package taller11;
import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Calcular valor de la planilla de luz");
        System.out.println("2. Calcular valor del predio de un bien inmueble");

        int opcion = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer de entrada

        System.out.println("Ingrese el nombre del cliente:");
        String nombreCliente = scanner.nextLine();

        System.out.println("Ingrese la cédula del cliente:");
        String cedulaCliente = scanner.nextLine();

        switch (opcion) {
            case 1:
                calcularValorLuz(nombreCliente, cedulaCliente);
                break;
            case 2:
                calcularPredio(nombreCliente, cedulaCliente);
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }

    public static void calcularValorLuz(String nombreCliente, String cedulaCliente) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del kilowatio:");
        double valorKilowatio = scanner.nextDouble();

        System.out.println("Ingrese el número de kilowatios del mes:");
        double numeroKilowatios = scanner.nextDouble();

        double valorPlanilla = valorKilowatio * numeroKilowatios;
        System.out.println("Cliente " + nombreCliente + " con cédula " + cedulaCliente +
                " debe cancelar el valor de $" + valorPlanilla + " por la planilla de luz.");
    }

    public static void calcularPredio(String nombreCliente, String cedulaCliente) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del bien inmueble:");
        double valorInmueble = scanner.nextDouble();

        double valorPredio = valorInmueble * 0.02;
        System.out.println("Cliente " + nombreCliente + " con cédula " + cedulaCliente +
                " tiene un bien inmueble valorado en $" + valorInmueble +
                " y tiene que pagar de predio $" + valorPredio + ".");
    }
}

/*
run:
Seleccione una opción:
1. Calcular valor de la planilla de luz
2. Calcular valor del predio de un bien inmueble
1
Ingrese el nombre del cliente:
Alejandro
Ingrese la cédula del cliente:
1105839243
Ingrese el valor del kilowatio:
5
Ingrese el número de kilowatios del mes:
25
Cliente Alejandro con cédula 1105839243 debe cancelar el valor de $125.0 por la planilla de luz.


1. Calcular valor de la planilla de luz
2. Calcular valor del predio de un bien inmueble
2
Ingrese el nombre del cliente:
alejandro
Ingrese la cédula del cliente:
1105839243
Ingrese el valor del bien inmueble:
2500
Cliente alejandro con cédula 1105839243 tiene un bien inmueble valorado en $2500.0 y tiene que pagar de predio $50.0.
*/