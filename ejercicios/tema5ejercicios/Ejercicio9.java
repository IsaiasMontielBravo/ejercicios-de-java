/**. 
 * 

*
*
*
*
*/

public class Ejercicio9 {
    public static void main(String[] args) {
        
        int digitos = 1, n, numeroIntroducido;

    System.out.println("introduzca un numero entero");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    n = numeroIntroducido;
    
    while (n > 10) {
        n /= 10;
        digitos++;
    }
    
    System.out.println("Tiene " + digitos + " digito/s");
 }
}
