/**
 * Ejemplo de uso de arrays
 * 
 * @author Isaias
 */

public class Ejercicio2 {
  public static void main(String[] args) {
    
    
    char[] s = new char[10]; // se reserva espacio para 10 enteros
            
    s[0] = 'a';
    s[1] = 'x';
    s[4] = '@';
    s[6] = ' ';
    s[7] = '+';
    s[8] = 'Q'; 
    
    for (int i = 0; i < 10; i++) {
        System.out.println( s[i]);
    }
  }
}
