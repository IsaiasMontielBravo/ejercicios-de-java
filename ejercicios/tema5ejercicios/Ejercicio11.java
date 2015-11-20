/**. 
 * 

*
*
*
*
*/

public class Ejercicio11 {
    public static void main(String[] args) {
    
    int num;
    int contador = 0;
    
    System.out.println("introduce el numero");
    num = Integer.parseInt(System.console().readLine());
    
        while (contador < 5) {
            System.out.println(num + " al cuadrado es " + (num*num) + " al cubo " + (num*num*num));
            num++;
            contador++;
        }    

            
 
}
}
