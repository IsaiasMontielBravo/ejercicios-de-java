/**
 * Ejemplo de uso de arrays
 * 
 * @author Isaias
 */

public class Ejercicio4 {
  public static void main(String[] args) {
        
    int[] n = new int[20]; 
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    int i;
    
    System.out.print(": se mostraran 20 numeros aleatorios");
    System.out.print("y sus respectivos cuadrados y cubos");
    
    for (i = 0; i < 20; i++) {
        n[i] =  (int)(Math.random()*101);
        cuadrado[i] = n[i] * n[i];
        cubo[i] = cuadrado[i] * n[i];
        }
    
    
     
      for (i = 0; i < 20; i++) {
        System.out.println("numero " + n[i] + " cuadrado " + cuadrado[i] + " cubo " + cubo[i]);
      }
    
    }
}
