/**
 * Ejemplo de uso de arrays
 * 
 * @author Isaias
 */

public class Ejercicio6 {
  public static void main(String[] args) {
      
    
    int[] n = new int[15];
    int ultimo = 0;
   
   
   
    for (int i = 0; i < 15; i++) {
        System.out.print(" introduce 15 numeros: ");
       n[i] = Integer.parseInt(System.console().readLine());
    
    }
    ultimo = n[14];
      
    
    for (int i = 14; i > 0; i--){
        n[i] = n[i-1];
       
    }    
   
   n[0] = ultimo;
   
    for (int i = 0; i < 15; i++) {
    System.out.print(n[i] + "  ");
    }
}
}
