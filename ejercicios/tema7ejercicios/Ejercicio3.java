/**
 * Ejemplo de uso de arrays
 * 
 * @author Isaias
 */

public class Ejercicio3 {
  public static void main(String[] args) {
        
    double[] n; // se define n como un array de enteros
    n = new double[10]; // se reserva espacio para 10 enteros
    
    System.out.println("Introduzca 10 numero y se mostraran en sentido contrario");
    
    for (int i = 0; i < 10; i++) {
    n[i] = Double.parseDouble(System.console().readLine());
    }
    
    for (int i = 9; i >= 0; i--) {
    System.out.print(n[i]);
    }
  
  }
}
