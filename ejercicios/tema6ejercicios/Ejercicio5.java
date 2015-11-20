/**. Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
espacios.
*/

public class Ejercicio5 {
    public static void main(String[] args) {
       
        int mayor = 100;
        int menor = 199;
        int suma = 0;
        int numero = 0;
        
    System.out.println("50 numeros entre el 100 y el 199 aleatorios");
    
        for (int i = 0; i < 50; i++) {
          numero = (int)(Math.random() * 100) + 100; 
          System.out.println(numero + "  ");
          suma += numero;
        if (numero < menor) {
        menor = numero;
    }
    
        if (numero > mayor) {
        mayor = numero;
    }
}
    
    System.out.println("Numero menor " + menor + " Numero mayor " + mayor + " Media " + suma / 50 );
    
    }
}

