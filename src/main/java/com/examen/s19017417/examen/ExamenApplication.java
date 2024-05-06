package com.examen.s19017417.examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
		Scanner scanner = new Scanner(System.in);
int opcion;

System.out.print("Por favor, ingrese su nombre: ");
String nombreUsuario = scanner.nextLine(); // Solicitar el nombre del usuario

do {
    System.out.println("¡Hola, " + nombreUsuario + "!"); // Saludar al usuario
    System.out.println("Menú de Tablas de Multiplicar:");
    System.out.println("1. Mostrar una tabla");
    System.out.println("2. Mostrar tablas del 2 al 5");
    System.out.println("3. Salir");
    System.out.print("Seleccione una opción: ");
    opcion = scanner.nextInt();

    switch (opcion) {
        case 1:
            System.out.print("Ingrese el número de la tabla que desea ver: ");
            int numeroTabla = scanner.nextInt();
            mostrarTabla(numeroTabla);
            break;
        case 2:
            mostrarTablasDelDosAlCinco();
            break;
        case 3:
            System.out.println("¡Hasta luego, " + nombreUsuario + "!");
            break;
        default:
            System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
    }

} while (opcion != 3);
		scanner.close();
    }

   		 public static void mostrarTabla(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
       	 for (int i = 1; i <= 10; i++) {
      	      System.out.println(numero + " x " + i + " = " + (numero * i));
     	   }
   		 }

    public static void mostrarTablasDelDosAlCinco() {
        for (int i = 2; i <= 5; i++) {
            mostrarTabla(i);
            System.out.println(); // Agrega una línea en blanco entre cada tabla
        }
	}

}
