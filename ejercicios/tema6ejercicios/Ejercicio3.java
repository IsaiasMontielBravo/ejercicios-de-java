/**. 
 * 

*
*
*
*
*/

public class Ejercicio3 {
    public static void main(String[] args) {


String palo ="";
    String carta ="";
    
    int paloelegido = (int)(Math.random()* 4) + 1;
    
    switch (paloelegido) {
        case 1:
            palo = "oro";
            break;
        case 2:
            palo = "bastos";
            break;
        case 3:
            palo = "Espadas";
            break;
        case 4:
            palo = "Copas";
            break;
            
        default:
        
    }
    
    int cartaelegida = (int)(Math.random()* 10) + 1;
    
    switch (cartaelegida) {
        case 1:
            carta = "As";
            break;
        case 11:
            carta = "Sota";
            break;
        case 12:
            carta = "Caballo";
            break;
        case 13:
            carta = "Rey";
            break;
            
        default:
        carta = String.valueOf(cartaelegida);
        
    }
    
    System.out.println(carta + " de " + palo);
}
    } 
