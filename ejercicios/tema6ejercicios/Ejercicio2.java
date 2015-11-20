/**. 
 * 

*
*
*
*
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        
    String palo ="";
    String carta ="";
    
    int paloelegido = (int)(Math.random()* 4) + 1;
    
    switch (paloelegido) {
        case 1:
            palo = "Corazones";
            break;
        case 2:
            palo = "Picas";
            break;
        case 3:
            palo = "Treboles";
            break;
        case 4:
            palo = "Rombos";
            break;
            
        default:
        
    }
    
    int cartaelegida = (int)(Math.random()* 13) + 1;
    
    switch (cartaelegida) {
        case 1:
            carta = "As";
            break;
        case 11:
            carta = "J";
            break;
        case 12:
            carta = "Q";
            break;
        case 13:
            carta = "K";
            break;
            
        default:
        carta = String.valueOf(cartaelegida);
        
    }
    
    System.out.println(carta + " de " + palo);
}
    } 
