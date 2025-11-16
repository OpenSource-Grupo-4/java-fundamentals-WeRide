/**
 * Recuerda copiar el codigo en un entorno de replit
 * O iniciar un proyecto vacío con IntelliJ IDEA Ultimate
 */

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner; 

public class Main {

  public static void mostrarSaludoPersonalizado(String nombre) {
    System.out.println("------------------"); 
    System.out.println("¡Bienvenido, " + nombre + "!"); 
    System.out.println("Es un gusto tenerte aquí.");
    System.out.println("------------------");
  }


  public static void main(String[] args){
    Scanner lector = new Scanner(System.in); 

    System.out.println("¡Iniciando programa!");

    System.out.println("Ingresa tu nombre: "); 

    String nombreUsuario = lector.nextLine(); 

    mostrarSaludoPersonalizado(nombreUsuario); 

    System.out.print("¿Cuantos años tienes? "); 
    int edad = lector.nextInt(); 

    System.out.println("¡Genial! " + edad + " es una edad muy buena para aprender a programar.");

    lector.close();
  }
}
