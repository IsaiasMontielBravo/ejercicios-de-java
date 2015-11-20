/**. 
 * 

*
*
*
*
*/

public class Ejercicio1 {
    public static void main(String[] args) {
    
    int mano;
    int total = 0;
    
    System.out.println("Muestra 3 tiradas de dados y su suma global");
    
    for (int i = 0; i < 3; i++) {
        mano = (int)(Math.random() * 6) + 1;
        System.out.println(mano + "  ");
        total += mano;
    }
    System.out.println("total " + total);

}
 }
