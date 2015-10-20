/** Hace la media de 3 notas
 *
 * @author Isaias
 */
 
 public class ejercicio8 { 
  public static void main(String[] args) {
  String linea;
  
  System.out.print("Introduzca las notas correspondientes para poder hacer la media ");
   
   double notas1= Double.parseDouble(System.console().readLine());
   double notas2= Double.parseDouble(System.console().readLine());
   double notas3= Double.parseDouble(System.console().readLine());
   
   double notafinal = (notas1 + notas2 + notas3) / 3 ;
   
   if ((notas1 >= 0) && (notas1 < 5));{
        system.out.println("Insuficiente");
        }
     if ((notas2 >= 5) && (notas2 < 6)){
       system.out.println("suficiente");
       }
    else if   ((notas3 >= 6) && (notas3 < 8)) {
    system.out.println("notable");
    }
    else if   ((notas3 >= 8) && (notas3 <= 10)) {
    system.out.println("Sobresaliente");
    }
    else {
     System.out.print("Los datos introducidos no son correctos");
    }
    
  }
 }
