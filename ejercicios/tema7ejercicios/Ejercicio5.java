/**
 * Ejemplo de uso de arrays
 * 
 * @author Isaias
 */

public class Ejercicio4 {
  public static void main(String[] args) {
  String numero;
  int[] n = new int[10]; 
  int maximo = 0;
  int minimo = 0;
  
  
  System.out.print(": introduce 10 numeros ");
  
  
  for (i = 0; i < 10; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
  }
      if (numero[i] < minimo) {
        minimo = numero[i];
      }
      
      if (numero[i] > maximo)	{
        maximo = numero[i];
      }
    }
  
  
  for (i = 0; i < 10; i++) {
      System.out.print(numero[i]);
  }
      if (numero[i] == maximo) {
        System.out.print(" Máximo");
      }
      
      if (numero[i] == minimo) {
        System.out.print(" Mínimo");
      }
    
}
}
