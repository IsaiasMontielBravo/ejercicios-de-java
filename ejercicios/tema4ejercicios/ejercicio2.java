/**
* Dia de la semana y resultado la clase a primera
*
* @author Isaias Montiel
*/

public class ejercicio2 {
  public static void main(String[] args) {
    
    System.out.println("¿Que hora es?: ");
    String linea = System.console().readLine();
    int n = Integer.parseInt( linea );
    
    if ((n >= 6) && (n <= 12)) {
    System.out.print("Buenos Dias: ");
    linea = System.console().readLine();
    n = Integer.parseInt( linea );
    }
    
    if ((n >= 13) && (n <= 20)) {
    System.out.print("Buenas Tardes: ");
    linea = System.console().readLine();
    n = Integer.parseInt( linea );
    }
    
    if(((n >=21) && (n <= 23)) || ((n >=0) && (n <= 5))){
    System.out.print("Buenas Noches: ");
    linea = System.console().readLine();
    n = Integer.parseInt( linea );
    }
    
    if (n > 24) {
    System.out.print("Lo siento te has equivocado ");
    linea = System.console().readLine();
    n = Integer.parseInt( linea );
    }
    
  }
}
