/** Resuelve una ecuacion de t =raiz(2h/g)
siendo g = 9.81m/s 2
 *
 * @author Isaias
 */
 
 public class ejercicio6 { 
  public static void main(String[] args) {
  String linea;
  
  System.out.print("introduzca un valor para la altura ");
    double h= Double.parseDouble(System.console().readLine());
    
 
    double resultado = Math.sqrt ((2*h)/ 9.81 );
     System.out.print("t=" + resultado);
     
    }
    
    
 }

