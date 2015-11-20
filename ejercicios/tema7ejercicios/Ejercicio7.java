/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
la lista generada anteriormente. Los números que se han cambiado deben aparecer
entrecomillados.
 * 
 * @author Isaias
 */

public class Ejercicio7 {
  public static void main(String[] args) {
      
      
  int[] n = new int[100];
    
     for ( int i = 0; i < 100; i++) {
       n[i] = (int)(Math.random()*21);
       System.out.println(n[i] + "  ");
    }
    
    
    System.out.println("introduzca uno de los numeros aparecidos anteriormente");
    int primerNumero = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca al numero que quiere que se convierta");
    int segundoNumero = Integer.parseInt(System.console().readLine());
 
    for (int i = 0; i < 100; i++){
      if  (primerNumero == segundoNumero){
          n[i] = segundoNumero;
          System.out.println(n[i]);
    } else {
          System.out.println(n[i]);
      }
    }
}
}
