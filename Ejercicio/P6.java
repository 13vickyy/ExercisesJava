package Ejercicio; //6. Explora los diferentes System println(); más allá de "out".
import java.util.Scanner; //Importa clase Scanner para poder leer entrada desde el teclado


public class P6 {

    public static void main(String[] args) {
        System.out.println("Esto es un system estandar");
        System.err.println("Este system sirve para mostrar mensajes de error");
        Scanner sc = new Scanner(System.in); //Crea un objeto Scanner llamado 'sc' que lee de System.in

        System.out.print("Ingrese aqui su nombre: "); //Muestra mensaje estandar x consola "Ingrese aqui su nombre"
        String nombre = sc.nextLine(); // Creo variable NOMBRE, NEXTLINE lee una línea completa de texto que el usuario escribe, hasta que presiona Enter.
        System.out.println("Hola " + nombre);
        System.out.println("El nombre ingresado es " + nombre); //Muestra mensaje estandar x consola "El nombre ingresado es ...Y se completa con el nombre que ingrese el usuario"

        sc.close(); //cierrp el scanner (buena practica)
    }
    
}
