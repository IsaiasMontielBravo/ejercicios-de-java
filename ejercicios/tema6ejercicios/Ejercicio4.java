/**. Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por
espacios.
*/

public class Ejercicio4 {
    public static void main(String[] args) {

    System.out.println("20 numeros entre el 0 y el 10 aleatorios");
    
    for (int i = 0; i < 20; i++) {
       System.out.println((int)(Math.random()* 11)); 
        
        }
}
}
