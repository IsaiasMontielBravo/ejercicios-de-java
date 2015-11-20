/**. 
 * 

*
*
*
*
*/

public class Ejercicio10 {
    public static void main(String[] args) {
        
        System.out.println("Introduce numeros enteros positivos y se calcurala la media.");
        System.out.println("Para dejar de introducir numero,introduce un numero negativo");
        System.out.println("Introduce numeros positivos");
        
        int num = 0;
        double suma = 0;
        double numeroElementos = 0;
        
        while (numeroElementos >= 0) {
            numeroElementos = Integer.parseInt(System.console().readLine());
            num++;
            suma += numeroElementos;
        }
        
        System.out.println("La media es " + (suma - numeroElementos) / (num - 1));
        
 }
}
