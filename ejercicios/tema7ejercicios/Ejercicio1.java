/**
 * Ejemplo de uso de arrays
 * 
 * @author Isaias
 */

public class Ejercicio1 {
  public static void main(String[] args) {
        
    int[] n; // se define n como un array de enteros
    n = new int[12]; // se reserva espacio para 12 enteros
            
    n[0] = 39;
    n[1] = -2;
    n[4] = 0;
    n[6] = 14;
    n[8] = 5;
    n[9] = 120;
   
    for (int i = 0; i < 10; i++) {
        System.out.println(n[i]);
        
    }
  }
}
