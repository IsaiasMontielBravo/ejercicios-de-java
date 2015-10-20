/**
* Dia de la semana y resultado la clase a primera
*
* @author Isaias Montiel
*/

public class ejercicio1 {
  public static void main(String[] args) {
    

    System.out.println("¿Introduce el dia de la semana y sabras que hay a primera hora?: ");
    System.out.println(" Lunes");
    System.out.println(" Martes ");
    System.out.println(" Miercoles");
    System.out.println(" Jueves");
    System.out.println(" Viernes");
    
    String dia = System.console().readLine().toLowerCase();
        
    switch(dia) {
        case "lunes":
        System.out.println("Fol");
        break;
        
        case "marte":
        System.out.println("Prog");
        break;
        
        case "miercoles":
        System.out.println("Sin");
        break;
        
        case "jueves":
        System.out.println("prog");
        break;
        
        case "viernes": 
        System.out.println("BBDD");
        
        default:
         System.out.println("losiento ese dia no hay clase");
        
    }
 }
  } 
