/** Hace la media de 3 notas
 *
 * @author Isaias
 */
 
 public class ejercicio7 { 
  public static void main(String[] args) {
  String linea;
  
  System.out.print("Introduzca las notas correspondientes para poder hacer la media ");
   
   double notas1= Double.parseDouble(System.console().readLine());
   double notas2= Double.parseDouble(System.console().readLine());
   double notas3= Double.parseDouble(System.console().readLine());
   
   if ((notas1 >= 0) && (notas1 <= 10) && 
       (notas2 >= 0) && (notas2 <= 10) &&
       (notas3 >= 0) && (notas3 <= 10)) {
    System.out.print("La media obtenida es: " + (notas1 + notas2 + notas3) / 3);
    } else {
     System.out.print("Los datos introducidos no son correctos");
    }
    
  }
 }
