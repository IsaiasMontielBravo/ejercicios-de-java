/** Resuelve una ecuacion de ax + b = 0
 *
 * @author Isaias
 */
 
 public class ejercicio5 { 
  public static void main(String[] args) {
  String linea;
  
  System.out.print("introduzca un valor para a ");
   double a= Double.parseDouble(System.console().readLine());
  System.out.print("introduzca un valor para b ");
   double b= Double.parseDouble(System.console().readLine());
   
   if ((a==0) || (b==0)){
    System.out.print("no tiene solucion");
    }
    
    else {
     System.out.print("x=" + (-b/a));
    }
    
  }
 }
